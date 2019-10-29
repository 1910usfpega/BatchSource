package com.revature.bean;

import java.io.ObjectInputStream.GetField;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.driver.ScannerMain;

public class Admin extends Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2144549481172572600L;
	public static BankAccount main_bank = new BankAccount("main", "bank", 1000000000, 1);
			
	public Admin(String name, String last, String username, String password) {
		super(PERSON_ID, name, last, username, password);
		// TODO Auto-generated constructor stub
	}
	// All options
	
	// Main options
	public static void general_options() {
		System.out.println("1 - View all current accounts");
		System.out.println("2 - View all pending accounts");
		System.out.println("3 - Logout");
	}
	
	// Options to remove, approve, or currently ignore a pending order
	public static void remove_or_approve() {
		System.out.println("1 - Approve customer");
		System.out.println("2 - Deny Customer");
		System.out.println("3 - Undecided");
	}
	
	
	// Options when viewing a current customer's information
	public static void current_customer_options() {
		System.out.println("1 - View Customer Info");
		System.out.println("2 - View an individual account");
		System.out.println("3 - Remove customer (Deletes all their accounts");
		System.out.println("4 - View other customer");
	}
	
	// Options when viewing someone's particular account
	public static void current_account_options() {
		System.out.println("1 - View bank information");
		System.out.println("2 - Take a payment from this account.");
		System.out.println("3 - Remove this account");
		System.out.println("4 - Look at a different account");
	}
	
	// Get a payment
	public static void take_payment(BankAccount other, double amount) {
		if (other.has_the_money(amount)){
			other.withdraw(amount);
			main_bank.deposit(amount);
			System.out.println("You have received funds of " + amount + " from "+  other.getFirst() + " " + other.getLast() + "'s account.");
		}
		else {
			throw new ArithmeticException("This customer's account does not have the money to withdraw");
		}
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public static void remove_customer(Customer bye) {
		// Given a member's name, remove their membership and all of their bank accounts
		for(BankAccount account : ScannerMain.all_accounts) {
			if(account.getFirst() == bye.getFirst() && account.getLast() == bye.getLast()) {
				ScannerMain.current_customers.remove(account);
			}
		}
		
		for(Customer customer : ScannerMain.current_customers) {
			if(customer.getFirst() == bye.getFirst() && customer.getLast() == bye.getLast()) {
				ScannerMain.current_customers.remove(customer);			
			}
		}
		
	}
	
	public static void delete_one_account(Customer customer, int place) {
		for(BankAccount account : ScannerMain.all_accounts) {
			if( account.getACCOUNTNUMBER() == customer.all_accounts().get(place).getACCOUNTNUMBER()) {
				ScannerMain.all_accounts.remove(account);
			}
		}
		float j = (float) customer.all_accounts().get(place).getBalance(); 
		try {
			ScannerMain.bankdi.deleteThisAccount(PERSON_ID, j);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		customer.all_accounts().remove(place);
	}
	
	public static void deny_customer(int place) throws SQLException {
		String first = ScannerMain.pending_customers.get(place).getFirst();
		String last = ScannerMain.pending_customers.get(place).getLast();
		String username = ScannerMain.pending_customers.get(place).getUsername();
		ScannerMain.pending_customers.remove(place);
		
		try {
			ScannerMain.persdi.deletePerson(first, last, username);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void approve_customer(int place) {
		Customer temp = ScannerMain.pending_customers.get(place);

		ScannerMain.pending_customers.remove(place);
		ScannerMain.current_customers.add(temp);
		
	}
}