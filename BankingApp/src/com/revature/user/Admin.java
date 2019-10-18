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
		CustomerStorage.remove(cust.getAccountNumber());
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
