package com.revature.employee;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee>{
	/*
	 * This is a simple comparator for Employee objects for question 6
	 * which sorts by name.
	 */ 

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
