package com.revature.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q7 {
	public static String Q7() {
		List<Employees> employeesList = new ArrayList<Employees>();
		employeesList.addAll(Arrays.asList(new Employees[] {

				new Employees("Joan", "Accounting", 33), new Employees("Robert", "Marketing", 28) }));

		System.out.println("Original List");

		Comparator<Employees> employeeNameComparator = new Comparator<Employees>() {
			@Override
			public int compare(Employees e1, Employees e2) {
				return e1.getName().compareTo(e2.getName());
			}
		};

		System.out.println("==========================");
		Collections.sort(employeesList);
		System.out.println("Sorted by Age");
		for (Employees e : employeesList) {
			System.out.println(e);
		}
		System.out.println("==========================");
		Collections.sort(employeesList);
		System.out.println("Sorted by Department");
		for (Employees e : employeesList) {
			System.out.println(e);
		}
		System.out.println("==========================");
		Collections.sort(employeesList);
		System.out.println("Sorted by Name");
		for (Employees e : employeesList) {
			System.out.println(e);
		}

		return "Compares";
	}
}
