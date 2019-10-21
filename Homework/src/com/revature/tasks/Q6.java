package com.revature.tasks;

public class Q6 {
	// Write a program to determine if an integer is 
	// even without using the modulus operator (%)
	
	public static void main(String [] args) {
		System.out.println();
		System.out.println("==> Q6");
		int n = 6;
		
		if (isEven(n)) {
			System.out.println(n + " is Even");
		} else {
			System.out.println(n + " is Odd");
		}
	}
	
	public static Boolean isEven(Integer n) {
		return (n / 2) * 2 == n;
	}
}
