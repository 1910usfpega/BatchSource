package com.revature.homework;

public class Q4 {
	public static int factorial(int n) {
		if (n==0)
			return 1;
		return n*factorial(n-1);
	}
	public static void factorial2() {
		int num = 7;
		 System.out.println("Factorial of "+ num + " is " + factorial(7)); 	
	}

}
