package com.revature.daoimpl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

//import com.revature.beans.User;
import com.revature.dao.LoginDao;
import com.revature.util.JDBConnector;

public class LoginDaoImpl implements LoginDao {

	static CustomerMenuDaoImpl cmdi = new CustomerMenuDaoImpl();
	static AdminMenuDaoImpl amdi = new AdminMenuDaoImpl();
	static Scanner input = new Scanner(System.in);
	public static JDBConnector jdbc = JDBConnector.getInstance();

	static int pwAttempts;
	//public static String currentUser;

	// BASICALLY START
	public void welcomeScreen() {

		pwAttempts = 3;

		System.out.println("Welcome to Benright Bank! \n");
		System.out.println("Do you have an account with us? Y/N");
		String answer = input.nextLine(); // USER INPUT OF Y/N
		System.out.println();

		// Y WILL SEND TO LOGINUSERNAME() METHOD
		if (answer.equals("y") || answer.equals("Y")) {
			login();
		}
		// N WILL SEND TO NOACCOUNT() METHOD
		else if (answer.equals("n") || answer.equals("N")) {
			try {
				createNewAccount();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// USER INPUTS INVALID RESPONSE, RESTARTS
		else {
			System.out.println("Invalid input.\n");
			System.out.println("////////////////////\n");
			welcomeScreen();
		}

	}

	// ASKS TO ENTER YOUR USERNAME
	public void login() {
		System.out.println("Enter your Username: ");
		String user = input.nextLine();
		System.out.println();
		System.out.print("Enter your Password: ");
		System.out.println();
		String pw = input.nextLine();
		System.out.println();
		adminCheck(user, pw);
		try {
			isAccountValid(user, pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void isAccountValid(String user, String pw) throws SQLException {
		Connection conn = jdbc.getConnection();
		String sql = "select * from \"InformationTable\" where \"USER_ID\" = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, user);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			if(rs.getString(2).equals(user) && rs.getString(3).equals(pw)) {
				System.out.println("Login Success!\n");
				System.out.println("////////////////////\n");
				cmdi.customerMenu(rs.getString(4), rs.getInt(1));
			}
		}
		pwAttempts--;
		if (pwAttempts > 0) {
			System.out.println("Username and/or Password is incorrect! Please try again\n");
			login(); // LETS YOU TRY TO LOGIN AGAIN W/ ONE LESS ATTEMPT
		} 
		else {
			System.out.println("Too many failed login attempts; please try again later.\n");
			System.out.println("////////////////////\n");
			welcomeScreen();
		}
	}
	
	public void adminCheck(String user, String pw) {
		Properties prop = new Properties();
		String adminUser = null; String adminPw = null;
		String adminUser1 = null; String adminPw1 = null;
		try {
			prop.load(new FileReader("database.properties"));
			adminUser = prop.getProperty("adminUser");
			adminPw = prop.getProperty("adminPw");
			adminUser1 = prop.getProperty("adminUser1");
			adminPw1 = prop.getProperty("adminPw1");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if ((user.equals(adminUser)) && (pw.equals(adminPw))) {
			amdi.adminMenu("Mr Revature", 1);
		}
		else if((user.equals(adminUser1)) && (pw.equals(adminPw1))) {
			amdi.adminMenu("Benjamin Enright", 2);
		}
	}
	
	public void createNewAccount() throws SQLException {
		System.out.println("Please enter a Username for your new account: ");
		String user = input.nextLine();
		try {
			if(usernameAvailability(user) == false) {
				System.out.println("This Username is already taken! Please try again!\n");
				System.out.println("////////////////////\n");
				createNewAccount();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		//VALIDATES PASSWORD IN CASE USER FAT FINGERED
		int passCheck = 0;
		String pw = "";
		String pwc = "";
		while(passCheck == 0) {
			System.out.println("Please enter a Password for your new account: ");
			pw = input.nextLine();
			System.out.println("Please confirm your Password for your new account: ");
			pwc = input.nextLine();
				if (pw.equals(pwc)) {
					passCheck = 1;
				}
				else {
					System.out.println("Passwords did not match! Please try again!\n");
					System.out.println("////////////////////\n");
					pw = "";
					pwc = "";
					continue;
				}
		}
		
		System.out.println("Please enter your full name (First Last) for your new account: ");
		String name = input.nextLine();
		
		//CONFIRMS ALL INFORMATION IS CORRECT
		int inputCheck = 0;
		while(inputCheck == 0) {
			System.out.println("Is the following information correct?\n Username: " + user + "\n Password: " + pw + "\n Full Name: " + name + "\n Y/N");                               
			String answer = input.nextLine();
			//SENDS YOU TO CUSTOMER MENU()
			if (answer.equals("y") || answer.equals("Y")) {
				inputCheck = 1;
			}
			//INCORRECT INFO, TRY AGAIN
			else if (answer.equals("n") || answer.equals("N")) {
				System.out.println();
				System.out.println("////////////////////\n");
				user = "";
				pw = "";
				pwc = "";
				name = "";
				inputCheck = 2;
			}
			//USER INPUTS INVALID RESPONSE, ASKS AGAIN
			else {
				System.out.println("Invalid input.\n");
				System.out.println("////////////////////\n");
				continue;
			}
		}
		//Create User
		if(inputCheck == 1) {
			Connection conn = jdbc.getConnection();
			String sql = "insert into \"InformationTable\" values(nextval (\'idSequence\'),?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.executeUpdate();
			System.out.println("Account Successfully Created! Sending Back to Welcome Screen to Login...\n");
			System.out.println("////////////////////\n");
			welcomeScreen();
		}
		else if(inputCheck == 2) {
			createNewAccount();
		}
	}

	public boolean usernameAvailability(String user) throws SQLException {
		Connection conn = jdbc.getConnection();
		String sql = "select * from \"InformationTable\" where \"USER_ID\" = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, user);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			return false;
		}
		return true;
	}
}
