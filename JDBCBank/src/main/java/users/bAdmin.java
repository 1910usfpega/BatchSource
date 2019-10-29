package users;

import java.sql.SQLException;

public class bAdmin extends Person{

	public bAdmin(String name, String last, String username, String password) {
		super(name, last, username, password);
	}
	
	//Admin Login
	public static boolean adminLogin(boolean s) throws SQLException {
		failCounter = 0;
		System.out.print("========== [Admin Login] ==========");
		System.out.print("\nAdmin username: ");
		uName = input.next();
		do {
			System.out.print("Password: ");
			uPassword = input.next();
			if (Person.checkLogin(uName, uPassword)) { //call checklogin method and pass in the username and pw
				return true;
			}

			System.out.println("Incorrect Password.");
			failCounter++;
			if (failCounter > 3) //have a fail counter to exit if too many incorrect inputs
				return false;
		} while (true);
	}
}
