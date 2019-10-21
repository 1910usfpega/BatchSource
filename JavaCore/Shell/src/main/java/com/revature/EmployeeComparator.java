package com.revature;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee arg0, Employee arg1) {
		// TODO Auto-generated method stub
		return (int) (arg0.getAge() - arg1.getAge());
	}
	
}
