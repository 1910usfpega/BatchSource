package DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connection.dbConnection;

public class Implement {
	public static dbConnection connect = dbConnection.getInstance();

	// Withdraw and deposit
	public void withdraw(double a, double b) throws SQLException {
		Connection connection = connect.getConnection();
		// ResultSet rs = stmt.executeQuery("select * from \"Album\"");
		String wd = "";
		PreparedStatement ps = connection.prepareStatement(wd);
	}

	public void deposit(double a, double b) throws SQLException {
		Connection connection = connect.getConnection();

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
			System.out.print("\nName: " + rs.getString(2) + " " + rs.getString(3));
		}
		rs = stmt.executeQuery("select acc_type, balance from account_type where user_name = '" + user + "'");
		while (rs.next()) {
			if (rs.getDouble(1) == 1)
				System.out.print("\nAccount type: Checking");
			else
				System.out.print("\nAccount type: Saving");
			System.out.print("\nBalance: $" + rs.getDouble(2));
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
		Scanner scan = new Scanner(System.in);
		System.out.println("Open a new account for which user: ");
		String user = scan.next();
		
		Connection c = connect.getConnection();
		String sql = "insert into account_type values(nextval(\'acc_type_seq\'),?,?)";
		PreparedStatement ps = c.prepareStatement(sql);
		while(ps.)
		ps.setInt(1, type);
		ps.setDouble(2, 0);
		ps.executeUpdate();
	}

	// Deleting account
	public void deleteAccount(int id, String user, int accountType) throws SQLException {
		dbConnection connect = dbConnection.getInstance();
		Connection c = connect.getConnection();
		Statement stmt = (Statement) c.createStatement();

		// String sql = "insert into student values(nextval (\'stuseq\'),?,?)";
		// PreparedStatement ps = connect.prepareStatement();
		// ps.setString(1, name);
		// ps.setInt(2, sch_id);
		// ps.executeUpdate();
	}

}
