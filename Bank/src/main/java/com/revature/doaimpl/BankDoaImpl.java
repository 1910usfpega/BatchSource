package com.revature.doaimpl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.beans.Account;
import com.revature.beans.Users;
import com.revature.dao.UserDao;
import com.revature.util.ConnFactory;

public class BankDoaImpl implements UserDao{


	
	public static List<Users> userList = new ArrayList<Users>();
	public static List<Account> accountList = new ArrayList<Account>();
	public static ConnFactory cf = ConnFactory.getInstance();
	 Scanner sc = new Scanner(System.in);
	public List<ReturnInfo> viewBalances() throws SQLException {
		List<ReturnInfo> viewBalances = new ArrayList<ReturnInfo>();
		Connection conn = cf.getConnection();
		String sql = "select accountid,checkbalance,savebalance from project.accounts";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		ReturnInfo a = null;
		while(rs.next()) {
			a = new ReturnInfo(rs.getInt(1),rs.getDouble(2),rs.getDouble(3));
			viewBalances.add(a);
		}
		return viewBalances;
	}
	
	public static void newUser() {
		System.out.println("You will now create a new account. Please follow the steps below.");
		createUserName();
		createUserPassword();
	
		try {
			createNewUser();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		writeUserFile();
		try {
			createNewAccount(true,true,0.0,0.0,true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//create username
	public static String createUserName() {
		String userName = null;
		Scanner sc = new Scanner(System.in);
		//no duplicate usernames allowed
		while(userName==null) {
			String tmp;
			System.out.println("Please enter new username:");
			tmp=sc.next();
			//set username to false I would much prefer to do this the other way
			//but i'm tired and this SHOULD work fine.... i hope... well I'll find out later
			boolean usernameExists = false;
			for(Users i: userList) {
				if(i.getUserName().contentEquals(tmp)) {
					usernameExists=true;
				}
			}
			if(!usernameExists) {
				userName=tmp;
			}else {
				System.out.println("Invalid entry, username already in use."
						+" Please choose another username.");
			}
		}
		return userName;
	}
	
	//create password
	
	private static String createUserPassword() {

		Scanner sc = new Scanner(System.in);

		String pass1,pass2,password;
		password=null;

		while(password==null) {
			System.out.println("Please enter a new password:");
			pass1=sc.next();
			System.out.println("Please re-enter the password:");
			pass2=sc.next();
			if(pass1.equals(pass2)) {
				password=pass1;
			}else {
				System.out.println("The passwords you entered do not match.\n"
						+"Please try again.");
			}

		}
			sc.close();		
		return password;
	}
	
	public static void createNewAccount(boolean checkingAccount, boolean savingsAccount, double checkBalance,
			double savingsBalance, boolean approved) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "insert into accounts values (nextval (\'newaccountseq\'), ?,?,?,?,?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setBoolean(1, checkingAccount);
		ps.setBoolean(2, savingsAccount);
		ps.setDouble(3, checkBalance);
		ps.setDouble(4, savingsBalance);
		ps.setBoolean(5, approved);
		ps.executeUpdate();
		}

	public static void createNewUser() throws SQLException {
		Scanner sc = new Scanner(System.in);

		String tmp = "";
		Users u = new Users();
		u.setUserName(createUserName());
		u.setPassword(createUserPassword());
		
		System.out.println("Please enter name:");
		tmp =sc.nextLine();
		u.setName(tmp);
		System.out.println("Please enter email:");
		tmp =sc.nextLine();
		u.setEmail(tmp);
		System.out.println("Please enter phone number:");
		tmp =sc.nextLine();
		u.setPhoneNum(tmp);
		
		userList.add(u);
		
		/*String tmp = "";
		Connection conn = cf.getConnection();
		String sql = "insert into users values (nextval (\'newuserseq\'), ?,?,?,?,?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setUserName(createUserName());
		*/
		// TODO Auto-generated method stub
		
	}
	
	public static boolean userLogin() {
		Scanner sc = new Scanner(System.in);

		String un;
		String pw;
		System.out.println("Welcome please enter Username: ");
		un= sc.nextLine();
		System.out.println("Password: ");
		pw =sc.nextLine();

		if(BankDoaImpl.isValidUserLogin(un, pw)) {
			System.out.println("Welcome "+un+"!");
			return true;
		} else {
			System.out.println("Invalid User/Password combination. Please try "
					+ "again!");

		}
		return false;
		//		sc.close();
	}
	
	
	private static boolean isValidUserLogin(String name, String pwd) {


		// first pull up the user file list from the Default users
		//??
		// default login attempt is false
		boolean authorized = false;

		// pull my list of known users and check the string against it
		for (Users u : userList) {
			if (name.equalsIgnoreCase(u.getUserName()) && pwd.equalsIgnoreCase(u.getPassword())) {
				authorized = true;
			}
		}
		
		//		if(!authorizedLogin) {
		//			System.out.println("Username and password do not match known users "
		//					+ "please try again.");
		//		}
		// return login value
		return authorized;

	}

}

