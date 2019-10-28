package users;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connection.dbConnection;

public abstract class Person {
	
	public static String uName, uPassword, rPassword;
	static String name;
	static String last;
	String username;
	public static Scanner input = new Scanner(System.in);
	public static int c, failCounter;
	

	public Person(String name, String last, String username, String password) {
		this.name = name;
		this.last = last;
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getUsername() {
		return this.username;
	}

	// Start here
	
	//Check username and password
	protected static boolean checkLogin(String user, String pw) throws SQLException {
		dbConnection connect = dbConnection.getInstance();
		Connection c = connect.getConnection();
		Statement stmt = (Statement) c.createStatement();
		String sql = "select user_name, user_pw, user_type from account;";
		stmt.executeQuery(sql);
		ResultSet rs = stmt.getResultSet();
		while(rs.next()) {
			String rUser = rs.getString(1);
			String rPassword = rs.getString(2);
			int uType = rs.getInt(3);

			if(rUser.equals(user) && rPassword.equals(pw)) {
				
				return true;
			}
		}
		return false;
	}
	
	//transaction log?
	/*protected static void transactionLog() {
	 * }
	 */
}


