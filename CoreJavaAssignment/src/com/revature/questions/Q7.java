package com.revature.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.revature.employee.Employee;
import com.revature.employee.EmployeeAgeComparator;
import com.revature.employee.EmployeeDepComparator;
import com.revature.employee.EmployeeNameComparator;

public class Q7 {

	public static void main(String[] args) {
		List<Employee> employees = makeEmployees();
		
		
		System.out.println("Original list of employees:");
		System.out.println(employees);
		
		System.out.println("List sorted by name:");
		
		Collections.sort(employees, new EmployeeNameComparator());
		System.out.println(employees);

		System.out.println("List sorted by department:");
		
		Collections.sort(employees, new EmployeeDepComparator());
		System.out.println(employees);

		System.out.println("List sorted by age:");
		
		Collections.sort(employees, new EmployeeAgeComparator());
		System.out.println(employees);
		
	}
	
	public static List<Employee> makeEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		employees.addAll(Arrays.asList(
		new Employee [] {
		new Employee("The Dude", "rug", 49),
		new Employee("Greg","clothing",24),
		new Employee("Bob","food",83)
		}));
		return employees;
	}
	
	

}
