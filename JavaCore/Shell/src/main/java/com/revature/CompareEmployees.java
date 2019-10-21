package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//import com.revature.compare.Student;
//import com.revature.compare.StudentComparator;

public class CompareEmployees {
	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.addAll(Arrays.asList(new Employee[] { 
				new Employee("Alex", "Teacher", 66), 
				new Employee("Heather", "Dean", 41)}));
		System.out.println("Original List");
		for (Employee s : employeeList) {
			System.out.println(s);
		}
		System.out.println("===========================================");
		Collections.sort(employeeList);
		System.out.println("Sorted by Name");
		Collections.sort(employeeList, (arg0, arg1) -> {
			return arg0.getName().compareTo(arg1.getName());
		});
		
		for (Employee s : employeeList) {
			System.out.println(s);
		}

		System.out.println("===========================================");
		System.out.println("Sorted by Department");
		// functional interfaces have 1 (not default) method;
		// we can do lambda w/ these
		
		
		Collections.sort(employeeList, (arg0, arg1) -> {
			return arg0.getDepartment().compareTo(arg1.getDepartment());
		});
		
		for (Employee s : employeeList) {
			System.out.println(s);
		}
		System.out.println("===========================================");
		Collections.sort(employeeList, new EmployeeComparator());
		System.out.println("Sorted by Age");
		for (Employee s : employeeList) {
			System.out.println(s);
		}
	}
		
	
}
