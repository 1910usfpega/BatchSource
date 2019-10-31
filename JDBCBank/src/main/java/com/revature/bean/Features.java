package com.revature.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.revature.bean.*;
import com.revature.daoimpl.TheImpl;
import com.revature.util.ConnFactory;

public class Features extends Account {

	
	
public static Scanner sc = new Scanner (System.in);
public static ConnFactory cf = ConnFactory.getInstance();	
	

	//*************************************CUSTOMERS

//Create Login
	public static void createLogin (String username, String password) throws SQLException{
		ConnFactory.getInstance();
		Connection conn1 = cf.getConnection();
		PreparedStatement ps ;
		String signup = "insert into users" + 
				"(userId)" + 
				"values ((select nextval('seq_create_userId')));" + 
				"insert into account" + 
				"(userId,username,passkey,accountId)" + 
				"values " + 
				"((select currval('seq_create_userId')),?,?," + 
				"(select nextval('seq_create_accountId'" + 
				")))";
		ps = conn1.prepareStatement(signup);
		ps.setString(1,username);
		ps.setString(2,password);
		ps.execute();
		
		User u = null;
//		while (rs.next()) {
//			u=new User(rs.getInt(1));
//		}
//		return userId;
	}

	
	

//View Account
	public static void viewAccount () {
		//located in impl method getAccountInt
	}
	
	
	
	//Open Account
	//must create empty account when they create user
	
	
	
	//View Balance
	public static List<Account> viewBalance (int accountId) throws SQLException {
		List <Account> balanceList = new ArrayList <Account> ();
		
		System.out.println("Enter an Account ID : ");
		System.out.println(" ");
		System.out.println(" ");
		accountId = sc.nextInt();
		System.out.println(" ");
		System.out.println(" ");
		
		//ConnFactory.getInstance();
		Connection conn1 = cf.getConnection();
		String theBal = "select accountBalance from Account where accountId=?";
		PreparedStatement ps;
		ResultSet rs;
		Account u = null;
		
		try {
		ps = conn1.prepareStatement(theBal);
		ps.setInt(1, accountId);
		rs = ps.executeQuery();
		
		while (rs.next()) {
			u = new Account (rs.getDouble(1));
			System.out.println("Your balance is : \n$" + Account.getAccountBalance());
		}
		
		} catch 
			(Exception e) { }
		return balanceList;
		
		}
		
		
		
		

	
	
	
	//Withdraw Feature
	 public static void getWithdraw () {
		System.out.println("``$``$``$``$``$``$``$``$``$``$``$``");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("How much would you like to withdraw?");
		System.out.println("Please enter an amount below : ");
		System.out.println(" ");
		System.out.println(" ");
		while (!sc.hasNextInt() || (amount > accountBalance)) {
			sc.next();
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Please enter a valid amount : ");
			System.out.println(" ");
			System.out.println(" ");
		}
		
		
		amount = sc.nextInt();
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("You entered $" + amount);
		accountBalance = accountBalance - amount; 
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Your current balance is $" + accountBalance);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("``$``$``$``$``$``$``$``$``$``$``$``");
	}
	
	 //Deposit Feature
	 //make sure to store the transaction details
	 //not working correctly yet
	 public static void getDeposit () {
			System.out.println("``$``$``$``$``$``$``$``$``$``$``$``");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("How much would you like to deposit?");
			System.out.println("Please enter an amount below: ");
			System.out.println(" ");
			System.out.println(" ");
			while (!sc.hasNextInt() || (amount < 0)) {
				sc.next();
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("Please enter a valid amount : ");
				System.out.println(" ");
				System.out.println(" ");
			}
			
			
			amount = sc.nextInt();
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("You entered $" + amount);
			accountBalance = accountBalance + amount; 
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Your current balance is $" + accountBalance);
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("``$``$``$``$``$``$``$``$``$``$``$``");
		}
	 


 
	 

//Delete Account
	//check if its empty or not


	
	
	
	
		
		
	 
	 //View Transaction History
		
















	//*************************************BOTH
	//Login Check
	public static boolean checkLogin () throws SQLException {
	
		String un = username;
		String pw = password;
		
	try {
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Login into Tampa General Bank. \n");
		System.out.println("Enter a username : ");
		System.out.println(" ");
		System.out.println(" ");
		un = sc.next();
		System.out.println("Enter a password : ");
		System.out.println(" ");
		System.out.println(" ");
		pw = sc.next();
		
		ConnFactory.getInstance();
		Connection conn1 = cf.getConnection();
		String ss = "select username,userId,accountType from Account where username = ? and passkey = ?";
		PreparedStatement ps = conn1.prepareStatement(ss);
		
		
		ps.setString(1, un);
		ps.setString(2, pw);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			String userName = rs.getString(1);
			String userId = rs.getString(2);
			String accountType = rs.getString(3);
			
		if (pw.equals(pw) && un.equals(un)) {
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("``$``$``$``$``$``$``$``$``$``$``$``");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Hey, " + un + " you're awesome! You may proceed!!");
			return true; 
			} 
			
		
		} }
		
	 catch (Exception e) {
	} return false; 
		
		
	
	
	








	//*************************************ADMIN

 
	 //Search User 
	
	
	 
	 
	
	
	//Add User
	
	
	
	
	
	//Delete User
	 
	 
	 
	 
	 
	 
	 
	 
}
}
