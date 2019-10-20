package com.revature.user;

import com.revature.storage.AccountStorage;
import com.revature.storage.OpenApplications;
//import com.revature.user.Customer;

public class Employee extends User {
	//private int[] myCustomers; //change this to a set??
	
	public Employee() {
		
	}
	
	public Employee(String username,String password) {
		super(username,password);
	}
	
	public void approveAccount(Account acct) {
		OpenApplications.removeApplication(acct);
		AccountStorage.addAccount(acct);
		for(Customer x : acct.getUsers()) {
			x.addNewAccount(acct);
			x.removeApplication(acct);
		}
	}
	
	public void denyAccount(Account acct) {
		OpenApplications.removeApplication(acct);
		for(Customer x : acct.getUsers()) {
			x.removeApplication(acct);
		}
	}
	
	public void viewCust(Customer cust) {
		System.out.println("Username: "+cust.getUsername());
		System.out.println("Number of accounts: "+cust.getMyAccounts().size());

	}

	
	
}
