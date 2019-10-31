package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import com.revature.bean.Account;
import com.revature.bean.User;
import com.revature.dao.TheDao;
import com.revature.util.ConnFactory;

public class TheImpl implements TheDao {

	public static ConnFactory cf = ConnFactory.getInstance();
	public static Scanner sc = new Scanner (System.in);
	
	public List <Account> getAllAccounts () throws SQLException {

		List <Account> accountList = new ArrayList <Account> ();
		Connection conn = cf.getConnection();
		Statement statement = conn.createStatement();
		ResultSet rs = statement.executeQuery("select * from Account");
		Account a = null;
		while (rs.next()) {

			//			int userId, String userType, String firstName, String lastName, 
			//			String accountType, int accountId, double accountBalance

			a = new Account (rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), 
					rs.getString(5),rs.getInt(6), rs.getDouble(7));
			accountList.add(a);
			System.out.println(a.toString());
		}
		return accountList;

	}


	public static List<Account> getAccountInfo(int accountId) throws SQLException {
		List <Account> accountList = new ArrayList <Account> ();
		System.out.println("Enter an Account ID : ");
		System.out.println(" ");
		System.out.println(" ");
		accountId = sc.nextInt();
		System.out.println(" ");
		System.out.println(" ");
		
		Connection conn = cf.getConnection();
		
		String lookup ="select userId,userType,firstName,lastName," + 
								 "accountType,accountId,accountBalance" + 
				" from account where accountId=?";
		PreparedStatement ps; ResultSet rs = null;
		Account u = null;
		try {
		ps = conn.prepareStatement(lookup); //not working
		ps.setInt(1, accountId);
		rs = ps.executeQuery();
		
		while (rs.next()) {
			u = new Account (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),
					rs.getString(5),rs.getInt(6),rs.getDouble(7));
			System.out.println("Account Information " + u.toString());
		}
		} catch 
		(Exception e) {
		 }
		return accountList;
	}
	
	
	public List<Account> getAccountInfoById(List<Account> AccountId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


	public static List <User>  getUsersById (int userId) throws SQLException {

		List <User> UserList = new ArrayList <User> ();
		Connection conn = cf.getConnection();
		String theUsers = "select * from Users";
		PreparedStatement ps;
		//ps.setInt(1, userId); 
		User u =null;
		try {
			ps = conn.prepareStatement(theUsers);
		   ResultSet rs =ps.executeQuery();
		while (rs.next()) {
		//System.out.println("User ID is : " + UserList.get(j).toString());
		u=new User(rs.getInt(1));
		UserList.add(u);
		System.out.println("User ID : " + u.getUserId());
		} 
		
		} catch (Exception e) {

		}

//		int userId, String userType, String firstName, String lastName, 
//		String streetAddress, String city, String state, String zipCode
		
		return UserList;
		
	}
	
	
	public static List <User> getAUserById (int userId) throws SQLException {

		List <User> UserList = new ArrayList <User> ();
		Connection conn = cf.getConnection();
		String theUsers = "select * from Users where username=?";
		PreparedStatement  ps = null;
		ps.setInt(1, userId); 
		User u =null;
		try {
			ps = conn.prepareStatement(theUsers);
		   ResultSet rs =ps.executeQuery();
		while (rs.next()) {
		//System.out.println("User ID is : " + UserList.get(j).toString());
		u=new User(rs.getInt(1));
		UserList.add(u);
		System.out.println("User ID : "+u.getUserId());
		} 
		   

		} catch (Exception e) {

		}

//		int userId, String userType, String firstName, String lastName, 
//		String streetAddress, String city, String state, String zipCode
		
		return UserList;
		
	}


	@Override
	public List<Account> getAccountInfo() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<User> getUsersById(List<User> userId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
}



