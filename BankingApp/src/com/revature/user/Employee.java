package com.revature.user;

import com.revature.storage.AccountStorage;
import com.revature.storage.OpenApplications;
//import com.revature.user.Customer;

public class Employee extends User {
	//private int[] myCustomers; //change this to a set??
	
	
	public Employee(String username,String password) {
		super(username,password);
	}
	
	public void approveAccount(Account acct) {
		OpenApplications.removeApplication(acct);
		AccountStorage.addAccount(acct);
		for(Customer x : acct.getUsers()) {
			x.addNewAccount(acct);
		}
	}
	
	public void denyAccount(Account acct) {
		OpenApplications.removeApplication(acct);
	}
	
	public void viewCust(Customer cust) {
		System.out.println("Username: "+cust.getUsername()); //move the sysout methods to the main screen??
		System.out.println("Number of accounts: "+cust.getMyAccounts().size());

	}
//	public int[] getMyCustomers() {
//		return myCustomers;
//	}
//	public void setMyCustomers(int[] myCustomers) {
//		this.myCustomers = myCustomers;
//	}

	
	
}
