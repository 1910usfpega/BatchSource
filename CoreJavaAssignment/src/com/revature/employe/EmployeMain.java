package com.revature.employe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeMain {
	
	public static void employeMain() {
		
		List<Employe> employes = new ArrayList <Employe>();
		employes.addAll(Arrays.asList(
				new Employe[] {
						new Employe("Roman", "Marketing", 999),
						new Employe("Ibba", "Programing", 109),
				}));
		
		Collections.sort(employes, new NameComparator());
		System.out.println("Sorted by Name");		
		for(Employe s: employes) {
			System.out.println(s);
		}
		System.out.println("==============================");
		
		Collections.sort(employes, new DepartmentComparator());
		System.out.println("Sorted by Department");		
		for(Employe s: employes) {
			System.out.println(s);
		}
		System.out.println("==============================");
		
		Collections.sort(employes, new AgeComparator());
		System.out.println("Sorted by Age");		
		for(Employe s: employes) {
			System.out.println(s);
		}
		
	}

}
