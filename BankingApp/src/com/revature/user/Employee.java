package com.revature.user;

import com.revature.storage.Bank;
//import com.revature.user.Customer;

public class Employee extends User{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4256248722180794907L;

	public Employee() {
		
	}
	
	public Employee(String username,String password) {
		super(username,password);
	}
	
	public void approveAccount(Bank bank,Account acct) {
		bank.removeApplication(acct);
		bank.addAccount(acct);
		for(Customer x : acct.getUsers()) {
			x.addNewAccount(acct);
			x.removeApplication(acct);
		}
	}
	
	public void denyAccount(Bank bank,Account acct) {
		bank.removeApplication(acct);
		for(Customer x : acct.getUsers()) {
			x.removeApplication(acct);
		}
	}
	
	public void viewCust(Customer cust) {
		System.out.println("Username: "+cust.getUsername());
		System.out.println("Number of accounts: "+cust.getMyAccounts().size());

	}

	
	
}
