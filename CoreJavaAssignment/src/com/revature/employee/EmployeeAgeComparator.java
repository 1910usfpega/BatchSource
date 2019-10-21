package com.revature.employee;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}

}
