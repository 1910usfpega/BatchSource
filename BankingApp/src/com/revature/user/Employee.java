package com.revature.user;

import java.util.Arrays;

//import com.revature.user.Customer;

public class Employee extends User {
	private int[] myCustomers; //change this to a set??
	
	
	
	public void viewAllCust() {
		
	}
	public void approveCust(Customer cust) {
		
	}
	
	public void denyCust(Customer cust) {
		
	}
	
	public void viewCust(Customer cust) {
		
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
