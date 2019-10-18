package com.revature.user;

import java.util.Arrays;

import com.revature.storage.CustomerStorage;
import com.revature.storage.OpenApplications;
//import com.revature.user.Customer;

public class Employee extends User {
	private int[] myCustomers; //change this to a set??
	
	
	public Employee(String username,String password) {
		super(username,password);
	}
	
	public void approveCust(User cust) {
		OpenApplications.removeApplication(cust);
		Customer newCustomer = new Customer(cust.getUsername(),cust.getPassword(), this);
		CustomerStorage.add(newCustomer);
	}
	
	public void denyCust(Customer cust) {
		OpenApplications.removeApplication(cust);
	}
	
	public void viewCust(Customer cust) {
		Customer thisCust = CustomerStorage.getThisCustomer(cust.getAccountNumber());
		System.out.println(thisCust.getUsername()); //move the sysout methods to the main screen??
		System.out.println(thisCust.getBalance());
		System.out.println(thisCust.isJoint());

	}
	public int[] getMyCustomers() {
		return myCustomers;
	}
	public void setMyCustomers(int[] myCustomers) {
		this.myCustomers = myCustomers;
	}
	@Override
	public String toString() {
		return "Employee [myCustomers=" + Arrays.toString(myCustomers) + "]";
	}

	
	
}
