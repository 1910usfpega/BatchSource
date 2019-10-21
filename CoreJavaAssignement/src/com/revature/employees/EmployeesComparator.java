package com.revature.employees;

import java.util.Comparator;

public class EmployeesComparator implements Comparator<Employees>{

	public int compare(Employees arg0, Employees arg1) {
		
		return (int) ((arg0.getAge()-arg1.getAge()));
	}
}
