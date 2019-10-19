package com.revature.storage;

import java.util.HashMap;
import java.util.Map;

import com.revature.user.Employee;

public class EmployeeStorage {
	private static Map<String,Employee> allEmployees = new HashMap<>();
	
	
	public static void remove(String emp) {
		allEmployees.remove(emp);
	}

	public static void add(Employee emp) {
		allEmployees.put(emp.getUsername(),emp);
	}
	public static Employee getThisEmployee(String emp) {
		return allEmployees.get(emp);
	}
	
	
	public static Map<String,Employee>  getAllCustomers() {
		return allEmployees;
	}

	public static void setAllEmployees(Map<String,Employee> allEmployees) {
		EmployeeStorage.allEmployees = allEmployees;
	}

}
