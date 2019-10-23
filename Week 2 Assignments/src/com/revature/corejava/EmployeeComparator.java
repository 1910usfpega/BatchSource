package com.revature.corejava;

import java.util.Comparator;

import com.revature.corejava.Employee;

public class EmployeeComparator implements Comparator <Employee> {

		public int compare(Employee arg1, Employee arg2) {
			
			return (int) ((arg1.getAge() - arg2.getAge())*100);
		}
	
}
