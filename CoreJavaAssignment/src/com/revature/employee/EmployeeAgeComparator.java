package com.revature.employee;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee> {

	/*
	 * This is a simple comparator for Employee objects for question 6
	 * which sorts by age.
	 */ 

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}

}
