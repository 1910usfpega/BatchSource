package com.revature.storage;

import java.util.HashMap;
import java.util.Map;

import com.revature.user.Customer;

public class CustomerStorage {
	private static Map<Integer,Customer> allCustomers = new HashMap<>();
	
	public static void remove(int cust) {
		allCustomers.remove(cust);
	}

	public static void add(Customer cust) {
		allCustomers.put(cust.getUserNumber(),cust);
	}
	public static Customer getThisCustomer(int user) {
		return allCustomers.get(user);
	}
	
	
	public static Map<Integer,Customer>  getAllCustomers() {
		return allCustomers;
	}

	public static void setAllCustomers(Map<Integer,Customer> allCustomers) {
		CustomerStorage.allCustomers = allCustomers;
	}

	
	

}
