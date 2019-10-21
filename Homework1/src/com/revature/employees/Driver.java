package com.revature.employees;

import java.util.ArrayList;
import java.util.Collections;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employees> employees = new ArrayList<Employees>();
		
		employees.add(new Employees("Gary", "Electronics", 55));
		employees.add(new Employees("Lexy", "Stocking", 29));
		
		System.out.println("Unsorted");
		for (int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i));
		}
		
		System.out.println("Sorting by name");
		Collections.sort(employees, new Sortbyname());
		
		for(int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i));
		}
		
		System.out.println("\n Sorted by department");
		Collections.sort(employees, new Sortbydept());
		
		for(int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i));
		}
		
		System.out.println("\n Sorted by age");
		Collections.sort(employees, new Sortbyage());

		for(int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i));
		}
	}
}
