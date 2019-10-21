package com.revature.employees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class CompareMain {
	
	public static void Compare() {
		List<Employees> employeesList= new ArrayList<Employees>();
		employeesList.addAll(Arrays.asList(
				new Employees [] {
						new Employees("Sir James Todd", 33, 25),
						new Employees("Matt", 25, 45)
				}
				));
		System.out.println("Original List");
		for(Employees e: employeesList ) {
			System.out.println(e);
		}
		
		System.out.println("====================");
		Collections.sort(employeesList);
		System.out.println("Sorted by Department");
		for(Employees e: employeesList) {//enhanced for loop
			System.out.println(e);
		}
		System.out.println("====================");
		Collections.sort(employeesList, new EmployeesComparator());
		System.out.println("Sorted by Age");
		for(Employees e: employeesList) {//enhanced for loop
			System.out.println(e);
		}
		System.out.println("====================");
		System.out.println("Sorted by Name");
		Collections.sort(employeesList, (arg0,arg1)
				->{
					return arg0.getName().compareTo(arg1.getName());
				});
		for(Employees e: employeesList) {//enhanced for loop
			System.out.println(e);
		}	
			
		

	}

}
