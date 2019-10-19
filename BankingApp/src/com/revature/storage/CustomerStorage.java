package com.revature.storage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.revature.user.Customer;

public class CustomerStorage {
	private static Map<String,Customer> allCustomers = new HashMap<>();
	
	
	public static void remove(String cust) {
		allCustomers.remove(cust);
	}

	public static void add(Customer cust) {
		allCustomers.put(cust.getUsername(),cust);
	}
	public static Customer getThisCustomer(String user) {
		return allCustomers.get(user);
	}
	
	
	public static Map<String,Customer>  getAllCustomers() {
		return allCustomers;
	}

	public static Collection<Customer> getOnlyCustomers() {
		return allCustomers.values();
		
	}
	
	public static void setAllCustomers(Map<String,Customer> allCustomers) {
		CustomerStorage.allCustomers = allCustomers;
	}



	
	
	
	

}
