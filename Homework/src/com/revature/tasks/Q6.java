package com.revature.tasks;

public class Q6 {
	// Write a program to determine if an integer is 
	// even without using the modulus operator (%)
	
	public static void driver() {
		System.out.println();
		System.out.println("==> Q6");
		int n = 6;
		
		if ((n / 2) * 2 == n) {
			System.out.println(n + " is Even");
		} else {
			System.out.println(n + " is Odd");
		}
	}
}
