package com.revature.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorMain {

	public static void Comparator() {
		// TODO Auto-generated method stub
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.addAll(Arrays.asList(
				new Employee [] {
						new Employee(15,"Matt", "Trash Department"),
						new Employee(7,"Ben", "Lunch Lady Land Depo"),
						
				}));
	
			
			System.out.println("\nSorted by Name");
			Collections.sort(employeeList,(arg0,arg1)
			->{ 
				return arg0.getName().compareTo(arg1.getName());
		});
			
			for(Employee e: employeeList) {
			System.out.println(e);
			}
			System.out.println("\nSorted by Department");
			Collections.sort(employeeList,(arg0,arg1)
			->{ 
				return arg0.getDepartment().compareTo(arg1.getDepartment());
		});
			for(Employee e: employeeList) {
			System.out.println(e);
			}
			
			System.out.println("\nSorted by Age ");
			Collections.sort(employeeList,new EmployeeComparator());
			for(Employee e: employeeList) {
			System.out.println(e);
			}
	}

}
