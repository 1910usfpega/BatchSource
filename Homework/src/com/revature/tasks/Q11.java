package com.revature.tasks;

import com.revature.anotherpack1.DemoClass1;
import com.revature.anotherpack2.DemoClass2;

public class Q11 {
	/* Write a program that would access two float-variables 
	 * from a class that exists in another package. 
	 * 
	 * Note, you will need to create two packages to demonstrate the solution.	
	 */
	
	
	public static void main(String [] args) {
		System.out.println();
		System.out.println("==> Q11");
		
		System.out.println("Float from Class 1: " + DemoClass1.f1);
		System.out.println("Float from Class 2: " + DemoClass2.f2);
	}
}
