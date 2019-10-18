package com.revature.user;

import com.revature.storage.CustomerStorage;
import com.revature.storage.OpenApplications;

public class Admin extends Employee {
	
	public Admin(String username,String password) {
		super(username,password);
	}
	
	public void viewAllCust() {
		CustomerStorage.getAllCustomers();
		
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
		acct.getUser1().removeAccount(acct);
		if (acct.getUser2()!=null) {
			acct.getUser2().removeAccount(acct);
		}
	}
	
	@Override
	public void approveCust(User cust) {
		System.out.println("customer needs an employee");  // change/remove this?
	}
	
	public void approveCust(User cust, Employee employee) {
		OpenApplications.removeApplication(cust);
		Customer newCustomer = new Customer(cust.getUsername(),cust.getPassword(), employee);
		CustomerStorage.add(newCustomer);
	}

}
