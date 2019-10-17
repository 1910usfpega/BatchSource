package com.revature.storage;

import java.util.HashMap;
import java.util.Map;

import com.revature.user.Customer;

public class CustomerStorage {
	Map<Integer,Customer> allCustomers = new HashMap<>();

	public Customer getThisCustomer(int user) {
		return allCustomers.get(user);
	}
	
	
	public CustomerStorage() {
		super();
	}
	
	public Map<Integer,Customer>  getAllCustomers() {
		return allCustomers;
	}

	public void setAllCustomers(Map<Integer,Customer> allCustomers) {
		this.allCustomers = allCustomers;
	}

	
	

}
