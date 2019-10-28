package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.dao.CustomerMenuDao;
import com.revature.util.JDBConnector;

public class CustomerMenuDaoImpl implements CustomerMenuDao {

	static Scanner input = new Scanner(System.in);
	public static JDBConnector jdbc = JDBConnector.getInstance();
	
	public void customerMenu(String currentUser, int currentAccount) {
		System.out.println("Welcome " + currentUser + "!");
		System.out.println("ACCOUNT#: " + currentAccount);
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println(" 1. Check Balances\n 2. Withdraw\n 3. Deposit\n 4. Open a New Account\n");
		System.out.println("(Please enter numerical answers only i.e. 1 or 2)");
		System.out.println();
		String answer = input.nextLine();
		//1 WILL SEND TO checkBalance() METHOD
		if (answer.equals("1")) {
			checkBalances(currentAccount);
			customerMenu(currentUser, currentAccount);
		}
		//2 WILL SEND TO withdraw() METHOD
		else if (answer.equals("2")) {
			//withdraw	
		}
		//3 WILL SEND TO deposit() METHOD
		else if (answer.equals("3")) {
			//deposit
		}
		//5 WILL ASK WHICH ACCOUNT TYPE THEY WOULD LIKE TO OPEN
		else if (answer.equals("4")) {
			System.out.println("Would you like to create a 1)Checking or 2)Savings account?");
			System.out.println("(Please enter numerical answers only i.e. 1 or 2)");
			String choice = input.nextLine();
			if (choice.equals("1")) {
				//AccountManagement.CreateSinglePersonCheckingAccount(currentUser);
			}
			else if (choice.equals("2")) {
				//AccountManagement.CreateSinglePersonSavingsAccount(currentUser);
			}
			else {
				System.out.println("Invalid input.\n");
				System.out.println("////////////////////\n");
				customerMenu(currentUser, currentAccount);
			}
		}
	}
	
	public List<Account> checkBalances(int id) throws SQLException {
		List<Account> balanceList = new ArrayList<Account>;
		Connection conn = jdbc.getConnection();
		String sql = "select * from \"AccountTable\" where \"BANK_ACCOUNT_ID\" = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		Account acct = null;
		while(rs.next()) {
			if(rs.getString(2).equals(user) && rs.getString(3).equals(pw)) {
				System.out.println("Login Success!\n");
				System.out.println("////////////////////\n");
				customerMenu(rs.getString(4), rs.getInt(1));
			}
		}
	}
	
	public List<Album> getAlbumsById(int id) throws SQLException {
		List<Album> albumList = new ArrayList<Album>();
		Connection conn = cf.getConnection();
		String sql = "select * from \"Album\" where \"ArtistId\" = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		Album a = null;
		while(rs.next()) {
			a = new Album(rs.getInt(1),rs.getString(2), rs.getInt(3));
			albumList.add(a);
		}
		return albumList;
}
