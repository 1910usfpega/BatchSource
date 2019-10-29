package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.beans.Account;
import com.revature.dao.CustomerMenuDao;
import com.revature.util.JDBConnector;

public class CustomerMenuDaoImpl implements CustomerMenuDao {

	public String currentUser;
	public int currentAccount;
	public int howManyAccounts;	

	static Scanner input = new Scanner(System.in);
	public static JDBConnector jdbc = JDBConnector.getInstance();
	
	public void customerMenu(String currentUser, int currentAccount) throws SQLException {
		this.currentUser = currentUser;
		this.currentAccount = currentAccount;
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
				makeAccount(0);
			}
			else if (choice.equals("2")) {
				makeAccount(1);
			}
			else {
				System.out.println("Invalid input.\n");
				System.out.println("////////////////////\n");
				customerMenu(currentUser, currentAccount);
			}
		}
	}
	
	public List<Account> checkBalances(int id) throws SQLException {
		List<Account> balanceList = new ArrayList<Account>();
		Connection conn = jdbc.getConnection();
		String sql = "select * from \"AccountTable\" where \"BANK_ACCOUNT_ID\" = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		Account acct = null;
		while(rs.next()) {
			acct = new Account(rs.getInt(1),rs.getInt(2), rs.getInt(3), rs.getDouble(4));
			System.out.println("hi");
			balanceList.add(acct);
		}
		System.out.println(balanceList.toString());
		return balanceList;
	}
	
	public void makeAccount(int newAccountType) throws SQLException {
		howManyAccounts(currentAccount, newAccountType);
		Connection conn = jdbc.getConnection();
		String sql = "insert into \"AccountTable\" values(currentUser,?,?,0.00)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, newAccountType);
		ps.setInt(2, howManyAccounts + 1);
		ps.executeUpdate();
		System.out.println("Account Successfully Created! Sending Back to Welcome Screen to Login...\n");
		System.out.println("////////////////////\n");
		howManyAccounts = 0;
		customerMenu(currentUser, currentAccount);
	}
	
	public void howManyAccounts(int currentAccount, int currentAccountType) throws SQLException {
		List<Account> numOfAccounts = new ArrayList<Account>();
		Connection conn = jdbc.getConnection();
		String sql = "select * from \"AccountTable\" where \"BANK_ACCOUNT_ID\" = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, currentAccount);
		ResultSet rs = ps.executeQuery();
		Account acct = null;
		while(rs.next()) {
			if(rs.getInt(2) == currentAccountType) {
				acct = new Account(rs.getInt(1),rs.getInt(2), rs.getInt(3), rs.getDouble(4));
				numOfAccounts.add(acct);
			}	
		}
		howManyAccounts = numOfAccounts.size();
		
	}
	
}
