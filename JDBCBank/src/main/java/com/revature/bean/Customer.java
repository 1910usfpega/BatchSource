package com.revature.bean;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.revature.driver.ScannerMain;

/* 7 options
 * 
 * 1 - View all accounts
 * 2 - Create account
 * 3 - Delete account
 * 4 - Withdraw
 * 5 - Deposit
 * 6 - Transfer to
 * 7 - Transfer from
 * 8 - Logout
 */

public class Customer extends Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8667262885064234307L;
	ArrayList<BankAccount> myaccounts = new ArrayList<BankAccount>();
	static HashMap<String, Customer> matchUserName = new HashMap<String, Customer>();
	
	public Customer(int PERSON_ID, String first, String last, String username, String password) {
		super(PERSON_ID, first, last, username, password);
		ScannerMain.pending_customers.add(this);
	}
	
	public static void get_all_options() {
		System.out.println("1 - View all accounts");
		System.out.println("2 - Create account");
		System.out.println("3 - Create joint accounts");
		System.out.println("4 - Withdraw");
		System.out.println("5 - Deposit");
		System.out.println("6 - Transfer money");
		System.out.println("7 - Delete account");
		System.out.println("8 - Logout");
	}
	
	public void view_all_accounts() {
		int i = 1;
		for (BankAccount thisaccount : myaccounts) {
			System.out.print(i);
			thisaccount.toString();
			i++;
		}
	}
	
	public void create_an_account(double initial_deposit) {
		BankAccount newaccount = new BankAccount(first, last, initial_deposit, PERSON_ID);
		try {
			ScannerMain.bankdi.insertBankAccount(first, last, initial_deposit, PERSON_ID);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		myaccounts.add(newaccount);
		
		ScannerMain.all_accounts.add(newaccount);
	}
	
	public void create_joint_accounts(int amount) {
		for( int i = 0; i < amount; i++) {
			this.create_an_account(0);
		}
	}
	
	public void withdraw(int place, double amount) {
		myaccounts.get(place).withdraw(amount);
	}
	
	public void deposit(int place, double amount) {
		myaccounts.get(place).deposit(amount);
	}
	
	public void transfer_to(int i, int j, double amount) {
		myaccounts.get(i).transfer_to(myaccounts.get(j), amount);
	}
	
	public void remove_account(int place) {
		float j = (float) myaccounts.get(place).getBalance(); 
		try {
			ScannerMain.bankdi.deleteThisAccount(PERSON_ID, j);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(myaccounts.get(place).getBalance() == 0) {
			myaccounts.remove(place);
		}
		
	}
	
	public ArrayList<BankAccount> all_accounts(){
		return myaccounts;
	}
}
