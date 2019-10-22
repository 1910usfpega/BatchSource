package com.revature.user;

import java.util.ArrayList;
import java.util.Map;

import com.revature.storage.Bank;

public class Admin extends Employee  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2264073195831418063L;

	public Admin(String username,String password) {
		super(username,password);
	}
	
	public Map<String, Customer> viewAllCustomers(Bank bank) {
		return bank.getAllCustomers();
		
	}
	
	public ArrayList<Account> viewAllAccounts(Bank bank) {
		return bank.getAllAccounts();
	}
	
	public double withdraw(Account acct, double amount) {
		// Need a check/validation here
		return acct.withdraw(amount);
		// Need a log here
	}
	
	public double deposit(Account acct, double amount) {
		// Need a check/validation here
		return acct.deposit(amount);
		// Need a log here
	}
	
	public void transfer(Account fromAcct, Account toAcct, double amount) {
		// Need a check/validation here
		fromAcct.withdraw(amount);
		toAcct.deposit(amount);
		// Need a log here
	}
	
	public void cancelAccount(Account acct) {
		for(Customer x:acct.getUsers()) {
			x.removeAccount(acct);
		}
	}
	
	

}
