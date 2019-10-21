//Sort two employees based on their  name, department, and age using the Comparator interface.

package com.homework.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProblemSeven {
	public static void sortEmployee() {
		
		//Make an array list of new employee with a set of parameters
		List<Employee> eList = new ArrayList<Employee>();
		eList.addAll(Arrays.asList(
				new Employee[] { 
						new Employee("Beavis", "Operations", 21), 
						new Employee("Butthead", "HR", 22) 
				}));
		
		//Sort by name(alphabetical order)
		System.out.println("Sort by Name");
		Collections.sort(eList, (arg0,arg1)
				->{
					return arg0.getName().compareTo(arg1.getName()
							);}
				);
		for(Employee e: eList) {
			System.out.println(e);
		}
		
		//Sort by department(alphabetical order)
		System.out.println("\nSort by Department");
		Collections.sort(eList, (arg0,arg1)
				->{
					return arg0.getDepartment().compareTo(arg1.getDepartment()
							);}
				);
		for(Employee e: eList) {
			System.out.println(e);
		}
		
		//Sort by age
		System.out.println("\nSort by Age");
		Collections.sort(eList, new EmployeeComparator());
		for(Employee e: eList) {
			System.out.println(e);
		}
		
	}
}
