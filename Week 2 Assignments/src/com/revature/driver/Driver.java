package com.revature.driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.revature.corejava.EmployeeComparator;
import com.revature.corejava.Employee;
import com.revature.corejava.FunWithJavaWeekB;


public class Driver {

	public static void main (String[] args) {
		//Q1
		System.out.println("NUMBER ONE.");
		int[] sorter = {1,0,5,6,3,2,3,7,9,8,4};
		FunWithJavaWeekB.bubbleSort(sorter);
		System.out.println("\n\n");
		
		//Q2
		System.out.println("NUMBER TWO.");
		int l = 26;
		System.out.println(FunWithJavaWeekB.fibonacci(l++));
		System.out.println("\n\n");
		
		//Q3
		System.out.println("NUMBER THREE.");
		String teehee = "Are we not drawn onward to new era?";
		System.out.println(teehee);
		for (int a = 0; a < teehee.length(); a++)
		{ teehee = teehee.substring(1, teehee.length() - a) + teehee.charAt(0)
		+ teehee.substring(teehee.length() - a);
		}
		System.out.println(teehee);
		System.out.println("\n\n");
		
		//Q4
		System.out.println("NUMBER FOUR.");
		int facty = 7;
		System.out.println("The factorial of " + facty + " is " + FunWithJavaWeekB.factorial(facty) + ".");
		System.out.println("\n\n");
		
		
		//Q5
		System.out.println("NUMBER FIVE.");		
		System.out.println(FunWithJavaWeekB.stringInclusive("Derthalie", 5));
		System.out.println("\n\n");
		
		
		//Q6
		System.out.println("NUMBER SIX.");
		int even = 1111;
		if (FunWithJavaWeekB.evenThough(even))
		System.out.println("The number " + even + " is truly even.");
		else
		System.out.println("This number, " + even + " is surely odd.");		
		System.out.println("\n\n");
		
		
		//Q7
		System.out.println("NUMBER SEVEN.");
		List <Employee> employeeDatabase = new ArrayList <Employee> ();
		
		employeeDatabase.addAll(Arrays.asList(
				new Employee [] {
						new Employee("Derthalie","PEGA",23),
						new Employee("Vianey","Electrical Engineering", 28)
				}));
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println("Regular Employee List");
		for (Employee eD: employeeDatabase) {
			System.out.println(eD);
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println("Sorted by Department");
		Collections.sort(employeeDatabase);
		for (Employee eD1: employeeDatabase) {
			System.out.println(eD1);
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println("Sorted by Age");
		Collections.sort(employeeDatabase, new EmployeeComparator());
		for (Employee eD2: employeeDatabase) {
			System.out.println(eD2);
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println("Sorted by Alphabetical Order with Lambda");
		Collections.sort(employeeDatabase, (arg1, arg2) 
				->{
					return arg1.getName().compareTo(arg2.getName());
				}
				);
		for (Employee eD3: employeeDatabase) {
			System.out.println(eD3);
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("\n\n");
		
		
		//Q8
		System.out.println("NUMBER EIGHT.");
				
		System.out.println("\n\n");
		
				
		//Q9
		System.out.println("NUMBER NINE.");
		int lePrime = 100;
		System.out.println("These are the prime numbers between 0 and " + lePrime + " : " + FunwithJavaWeekB.isPrimey(lePrime);
		System.out.println("\n\n");		
		
				
		//Q10
		System.out.println("NUMBER TEN.");
				
		System.out.println("\n\n");
				
				
		//Q11
		System.out.println("NUMBER ELEVEN.");
				
		System.out.println("\n\n");
				
				
		//Q12
		System.out.println("NUMBER TWELVE.");
				
		System.out.println("\n\n");
				
				
		//Q13
		System.out.println("NUMBER THRIRTEEN.");
				
		System.out.println("\n\n");
				
				
		//Q14
		System.out.println("NUMBER FOURTEEN.");
				
		System.out.println("\n\n");
				
				
		//Q15
		System.out.println("NUMBER FIFTEEN.");
				
		System.out.println("\n\n");
				
				
		//Q16
		System.out.println("NUMBER SIXTEEN.");
				
		System.out.println("\n\n");
				
				
		//Q17
		System.out.println("NUMBER SEVENTEEN.");
				
		System.out.println("\n\n");
				
				
		//Q18
		System.out.println("NUMBER EIGHTEEN.");
				
		System.out.println("\n\n");
				
				
		//Q19
		System.out.println("NUMBER NINETEEN.");
				
		System.out.println("\n\n");
				
				
		//Q20
		System.out.println("NUMBER TWENTY.");
				
		System.out.println("\n\n");
				
				
	}
}

