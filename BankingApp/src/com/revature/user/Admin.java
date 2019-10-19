package com.revature.user;

import java.util.ArrayList;
import java.util.Map;

import com.revature.storage.AccountStorage;
import com.revature.storage.CustomerStorage;

public class Admin extends Employee {
	
	public Admin(String username,String password) {
		super(username,password);
	}
	
	public Map<String, Customer> viewAllCustomers() {
		return CustomerStorage.getAllCustomers();
		
	}
	
	public ArrayList<Account> viewAllAccounts() {
		return AccountStorage.getAllAccounts();
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
