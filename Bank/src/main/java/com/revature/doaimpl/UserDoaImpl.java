package com.revature.doaimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.beans.Account;
import com.revature.dao.UserDao;
import com.revature.util.ConnFactory;

public class UserDoaImpl implements UserDao{
	static LoginDaoImpl ldi = new LoginDaoImpl();
	public String userName;
	public int accountID;
	static Scanner sc = new Scanner(System.in);
	public static ConnFactory cf = ConnFactory.getInstance();
	
	
	public void mainMenu(String userName, int accountID) {
		this.userName=userName;
		this.accountID=accountID;
		System.out.println("-----------------------------");
		System.out.println("|  Welcome "+ userName +".   |");
		System.out.println("|                            |");
		System.out.println("|How may we assist you today?|");
		System.out.println("|                            |");
		System.out.println("|    1. View balances        |");
		System.out.println("|    2. Withdrawal           |");
		System.out.println("|    3. Deposit              |");
		System.out.println("|    4. Exit                 |");
		System.out.println("|----------------------------|");
		System.out.println();
		int s = sc.nextInt();
		double amount = 0;
		switch (s){
		
		case 1:
			System.out.println("Account Balances: \n");
			viewBalances(accountID);
			mainMenu(userName,accountID);
			
		break;
			
		case 2:
			try {
				withdrawal(accountID,amount);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			//}
			break;

			//Bring up deposit menu
		case 3:
			
			try {
				deposit(accountID, amount);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;

		case 4:
			System.out.println("Transaction canceled.. loging out.");	
			ldi.start();
			break;
		default: 
			System.out.println("Entry invalid... Please try again.");
			mainMenu(userName,accountID);

		}
		}
		
	
	@Override
	public List<Account> viewBalances(int accountID) {
		List<Account> viewBalances = new ArrayList<Account>();
		Connection conn = cf.getConnection();
		String sql = "select * from project.accounts where accountID = ?";
		PreparedStatement ps;
		
			try {
				ps = conn.prepareStatement(sql);
				ps.setInt(1, accountID);
				ResultSet rs=ps.executeQuery();
				Account a = null;
				while(rs.next()) {
				a = new Account(rs.getInt(1),rs.getBoolean(2),rs.getBoolean(3),rs.getDouble(4),rs.getDouble(5));
				} 
				viewBalances.add(a);
				}
				catch (SQLException e) {
				e.printStackTrace();
			}
				System.out.println(viewBalances.toString());
				return viewBalances;
	}
	@Override
	public void withdrawal(int accountID, double amount) throws SQLException {
		int choose;
		
		do {
			System.out.println("Please choose the Account type to withdrawal from: ");
			System.out.println("1. Checking Account                                ");
			System.out.println("2. Savings Account                                 ");
			System.out.println("3. Cancel                                          ");
			System.out.println("---------------------------------------------------");
			choose=sc.nextInt();
			switch (choose) {
			case 1:
				System.out.println("You chose Checking Account.\n Enter withdrawal amount: ");
				amount=sc.nextDouble();
				Connection conn = cf.getConnection();
				String sql = "update project.accounts set checkBalance = ? where accountID = ?";
				PreparedStatement ps;
				ps = conn.prepareStatement(sql);
				ps.setInt(1, accountID);
				ResultSet rs=ps.executeQuery();
				
				System.out.println("Withdrawal complete. Updated Checking Account balance: " );
				mainMenu(userName,accountID);
				break;
			case 2:
				System.out.println("You chose Savings Account.\n Enter withdrawal amount: ");
				amount=sc.nextDouble();
				Connection conn1 = cf.getConnection();
				String sql1 = "update project.accounts set saveBalance = ? where accountID = ?";
				PreparedStatement ps1;
				ps1 = conn1.prepareStatement(sql1);
				ps1.setInt(1, accountID);
				ResultSet rs1=ps1.executeQuery();
				
				System.out.println("Withdrawal complete. Updated Savings Account balance: ");
				mainMenu(userName,accountID);
				break;
			case 3:
				System.out.println("Transaction canceled..");
				mainMenu(userName,accountID);
				break;

			}

		}
		while (choose >=4);
	}
		// TODO Auto-generated method stub
		
	@Override
	public void deposit(int accountID, double amount) throws SQLException {
		int choose;
		
		//double amount = deposit;
		//Account a = checkingAccount;
		
		do {
			System.out.println("Please choose the Account type to withdrawal from: ");
			System.out.println("1. Checking Account                                ");
			System.out.println("2. Savings Account                                 ");
			System.out.println("3. Cancel                                          ");
			System.out.println("---------------------------------------------------");
			choose=sc.nextInt();
			switch (choose) {

			case 1:
				System.out.println("You chose Checking Account.\n Enter deposit amount: ");
				amount=sc.nextDouble();
				Connection conn = cf.getConnection();
				String sql = "update project.accounts set checkBalance = ? where accountID = ?";
				PreparedStatement ps;
				ps = conn.prepareStatement(sql);
				ps.setInt(1, accountID);
				ResultSet rs=ps.executeQuery();
				
				System.out.println("Deposit complete. Updated Checking Account balance: $");
				mainMenu(userName,accountID);
				break;
			
			case 2:
				System.out.println("You chose Savings Account.\n Enter deposit amount: ");
				amount=sc.nextDouble();
				
				Connection conn1 = cf.getConnection();
				String sql1 = "update project.accounts set saveBalance = ? where accountID = ?";
				PreparedStatement ps1;
				ps1 = conn1.prepareStatement(sql1);
				ps1.setInt(1, accountID);
				ResultSet rs1=ps1.executeQuery();
				
				System.out.println("Deposit complete. Updated Savings Account balance: $" );
				mainMenu(userName,accountID);
				break;
			case 3:
				System.out.println("Transaction canceled..");
				mainMenu(userName,accountID);
				break;


			}
		}
		while (choose>=4);
		}
		
	}
		
	