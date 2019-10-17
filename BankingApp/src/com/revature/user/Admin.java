package com.revature.user;

public class Admin {
	
	public double withdraw(Customer cust, double amount) {
		// Need a check/validation here
		cust.setBalance(cust.getBalance()-amount);
		return cust.getBalance();
		// Need a log here
	}
	
	public double deposit(Customer cust, double amount) {
		// Need a check/validation here
		cust.setBalance(cust.getBalance()+amount);
		return cust.getBalance();
		// Need a log here
	}
	
	public void transfer(Customer fromCust, Customer toCust, double amount) {
		// Need a check/validation here
		fromCust.setBalance(fromCust.getBalance()-amount);
		toCust.setBalance(toCust.getBalance()+amount);
		// Need a log here
	}
	
	public void cancelAccount(Customer cust) {
		
	}

}
