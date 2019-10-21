package com.revature.tasks;

import java.util.ArrayList;
import java.util.Collections;

import com.revature.q7.Employee;
import com.revature.q7.SortByAge;
import com.revature.q7.SortByDepartment;
import com.revature.q7.SortByName;

public class Q7 {
	// Sort two employees based on their  name, department, and age 
	// using the Comparator interface.
	
	public static void main(String [] args) {
		System.out.println();
		System.out.println("==> Q7");
		
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Iskandar", "Software developing", 22));
		employees.add(new Employee("Bob", "Logistic", 30));
		employees.add(new Employee("Morty", "R&D", 400));
		employees.add(new Employee("Rick", "R&D", 300));
		
		System.out.println("Unsorted"); 
        for (int i=0; i<employees.size(); i++) 
            System.out.println(employees.get(i)); 
        
        Collections.sort(employees, new SortByName()); 
        System.out.println("\nSorted by name:"); 
        for (int i=0; i<employees.size(); i++) 
            System.out.println(employees.get(i)); 
        
        
        Collections.sort(employees, new SortByAge()); 
        System.out.println("\nSorted by age:"); 
        for (int i=0; i<employees.size(); i++) 
            System.out.println(employees.get(i)); 
        
        
        Collections.sort(employees, new SortByDepartment()); 
        System.out.println("\nSorted by department:"); 
        for (int i=0; i<employees.size(); i++) 
            System.out.println(employees.get(i)); 
		
	}
}
