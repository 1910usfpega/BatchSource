package DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Scanner;

import connection.dbConnection;
import users.Customer;

public class Implement {
	public static dbConnection connect = dbConnection.getInstance();
	public static DecimalFormat a = new DecimalFormat("0.00");

	// Withdraw and deposit
	@SuppressWarnings("resource")
	public static void withdraw(String user) throws SQLException {
		boolean check = true;
		Scanner scan = new Scanner(System.in);
		String withdraw;
		double amount;
		int num = 0;

		dbConnection connect = dbConnection.getInstance();
		Connection c = connect.getConnection();
		Statement stmt = (Statement) c.createStatement();

		viewAccount(user);
		do {
			System.out.print("Select the account number to withdraw from: ");
			try {
				String s = scan.next();
				num = Integer.parseInt(s);
				check = false;
			} catch (Exception e) {
				System.out.println("\nInvalid Input. Enter a number.\n");
				check = true;
			}
		} while (check);

		ResultSet rs = stmt.executeQuery("select atype_id, balance from account_type where user_name= '" + user + "'");
		while (rs.next()) {
			if (num == rs.getInt(1)) {
				System.out.println("User Account Number: " + rs.getInt(1));
				System.out.println(user + "'s Current Balance: $" + rs.getDouble(2));
				do {
					System.out.print("How much to withdraw: $");
					try { // enter the amount to withdraw
						withdraw = scan.next();
						amount = Double.parseDouble(withdraw);
						if (amount > rs.getDouble(2)) { // deny withdraw when amount is higher than the current balance
							System.out.println("Cannot withdraw more than the current balance.");
							check = true;
						} else { // transaction here
							Statement stmt2 = (Statement) c.createStatement();
							stmt2.executeUpdate("UPDATE account_type SET balance = balance - " + amount
									+ "WHERE user_name = '" + user + "' and atype_id= '" + num + "'");
							viewAccount(user);
							check = false;
						}
					} catch (Exception e) { // If user input an invalid input
						System.out.println("\nInvalid Input. Enter a valid amount");
						check = true;
					}
				} while (check);
			}
		}
		// System.out.println("No checking or savings account opened yet.\n");
	}

	public static void deposit(String user) throws SQLException {
		boolean check = true;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String withdraw;
		double amount;
		int num = 0;

		dbConnection connect = dbConnection.getInstance();
		Connection c = connect.getConnection();
		Statement stmt = (Statement) c.createStatement();

		viewAccount(user);
		do {
			System.out.print("Select the account number to deposit into: ");
			try {
				String s = scan.next();
				num = Integer.parseInt(s);
				check = false;
			} catch (Exception e) {
				System.out.println("\nInvalid Input. Enter a number.\n");
				check = true;
			}
		} while (check);

		ResultSet rs = stmt.executeQuery("select atype_id, balance from account_type where user_name= '" + user + "'");
		while (rs.next()) {
			if (num == rs.getInt(1)) {
				System.out.println("User Account Number: " + rs.getInt(1));
				System.out.println(user + "'s Current Balance: $" + rs.getDouble(2));
				do {
					System.out.print("How much to deposit: $");
					try { // enter the amount to deposit
						withdraw = scan.next();
						amount = Double.parseDouble(withdraw);
						// transaction here
						Statement stmt2 = (Statement) c.createStatement();
						stmt2.executeUpdate("UPDATE account_type SET balance = balance + " + amount
								+ "WHERE user_name = '" + user + "' and atype_id= '" + num + "'");
						viewAccount(user);
						check = false;
					} catch (Exception e) { // If user input an invalid input
						System.out.println("\nInvalid Input. Enter a valid amount");
						check = true;
					}
				} while (check);
			}
		}
	}

	// View account
	public static void viewAccount(String user) throws SQLException {

		dbConnection connect = dbConnection.getInstance();
		Connection c = connect.getConnection();
		Statement stmt = (Statement) c.createStatement();
		ResultSet rs = stmt
				.executeQuery("select user_name, first_name, last_name from account where user_name = '" + user + "'");
		while (rs.next()) {
			System.out.print("\nUser: " + rs.getString(1));
			System.out.println("\nName: " + rs.getString(2) + " " + rs.getString(3));
		}
		rs = stmt.executeQuery("select atype_id, acc_type, balance from account_type where user_name = '" + user + "'");
		while (rs.next()) {
			System.out.print("\nAccount Number: " + rs.getInt(1));
			if (rs.getInt(2) == 1)
				System.out.print("\nAccount type: Checking");
			else
				System.out.print("\nAccount type: Saving");
			System.out.print("\nBalance: $" + a.format(rs.getDouble(3)));
		}
		System.out.println("\n");
	}

	// New user
	public static void insertUser(String user, String pw, String first, String last) throws SQLException {
		// dbConnection connect = dbConnection.getInstance();
		Connection c = connect.getConnection();
		// Statement stmt = (Statement) c.createStatement();
		String sql = "insert into account values(nextval(\'user_id_seq\'), 0, ?, ? ,?, ?)";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, user);
		ps.setString(2, pw);
		ps.setString(3, first);
		ps.setString(4, last);
		ps.executeUpdate();
	}

	// New checking/saving account
	public static void newAccount() throws SQLException {
		boolean check = true;
		String type, user;
		int x = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("\nOpen a new account for which user: ");
		do {
			System.out.print("Enter: ");
			user = scan.next();
			if (!Customer.userAvail(user)) //Checking if the customer is available first
				check = true;
			else {
				System.out.println("That user does not exist.");
				check = false;
			}
		} while (!check);
		do { //Option to create checking or savings account
			check = true;
			System.out.println("(1)Checking");
			System.out.println("(2)Savings");
			System.out.print("Enter: ");
			try {
				type = scan.next();
				x = Integer.parseInt(type);
				if (x > 0 && x < 3) {
					check = false;
				} else
					check = true;

			} catch (Exception e) {
				System.out.println("\nInvalid Input. Enter a valid option.");
				check = true;
			}
		} while (check);

		Connection c = connect.getConnection();
		String sql = "insert into account_type values(nextval(\'acc_type_seq\'),?,?,?)";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, user);
		ps.setInt(2, x);
		ps.setDouble(3, 0);
		ps.executeUpdate();
		if (x == 1)
			System.out.println("\nChecking account created for " + user + "\n");
		if (x == 2)
			System.out.println("\nSavings account created for " + user + "\n");
	}

	// Deleting account
	public void deleteAccount(int id, String user, int accountType) throws SQLException {
		//dbConnection connect = dbConnection.getInstance();
		//Connection c = connect.getConnection();
		//Statement stmt = (Statement) c.createStatement();

		// String sql = "insert into student values(nextval (\'stuseq\'),?,?)";
		// PreparedStatement ps = connect.prepareStatement();
		// ps.setString(1, name);
		// ps.setInt(2, sch_id);
		// ps.executeUpdate();
	}

}
