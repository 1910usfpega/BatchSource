package users;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DAOImpl.Implement;
import connection.dbConnection;

public class Customer extends Person {

	public Customer(String name, String last, String username, String password) {
		super(name, last, username, password);
	}

	// Creating a user account
	public static boolean accountCreation() throws SQLException{
		failCounter = 0;
		System.out.println("\nCreating a New User");
		System.out.println("======================");
		do {
			System.out.print("Select a Username: "); // Selecting a user name
			uName = input.next();
			if (userAvail(uName)) { // Check to see if user name is available before selecting a password
				failCounter = 0;
				System.out.print("Enter a Password: ");
				uPassword = input.next();
				do {
					System.out.print("Re-enter the Password: ");
					rPassword = input.next();
					if (uPassword.equals(rPassword)) { //Make user re enter the password to see if it matches
						System.out.print("First name: ");
						name = input.next();
						System.out.print("Last name: ");
						last = input.next();
						// Enter it to database
						Implement.insertUser(uName, uPassword, name, last); //Call method and pass the parameters to insert new user
						System.out.print("\nAccount Created.\n\n");
					} else {
						System.out.println("Passwords do not match.");
						failCounter++;
						if (failCounter > 3) {
							System.out.println("Too many unmatched password. Returning back to Main Menu");
							break;
						}
					}
				} while (!(uPassword.equals(rPassword)) || failCounter > 3); //if the password does not match or fail counter
				//reaches the limit, exit out of loop
				return false;
			} else {
				System.out.print("Username is taken. Select another username.\n");
				if (failCounter > 3) {
					System.out.println("Too many tries. Returning back to the Main Menu");
					return false;
				}
				failCounter++;
			}
		} while (!userAvail(uName));
		return true;
	}

	public static boolean userAvail(String user) throws SQLException{
		// Pass in the input username and check the data base if username is available
		// username.equals(database)
		dbConnection connect = dbConnection.getInstance();
		Connection c = connect.getConnection();
		Statement stmt = (Statement) c.createStatement();
		String sql = "select user_name from account";
		stmt.executeQuery(sql);
		ResultSet rs = stmt.getResultSet();
		while(rs.next()) {
			String rUser = rs.getString(1);
			if(rUser.equals(user)) {
				return false;
			}
		}
		return true;
	}

	// Customer Login; Returns true if login is successful, false if too many
	// invalid tries
	public static boolean customerLogin(boolean s) throws SQLException {
		failCounter = 0;
		System.out.print("========== [Existing Customer Login] ==========");
		System.out.print("\nUsername: ");
		uName = input.next();
		do {
			System.out.print("Password: ");
			uPassword = input.next();
			// check database to see if pw and account is linked
			if (Person.checkLogin(uName, uPassword)) {
				return true;
			}

			System.out.println("Incorrect Password.");
			failCounter++;
			if (failCounter > 3)
				return false;
		} while (true);
	}
}
