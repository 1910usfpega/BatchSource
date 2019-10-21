package com.revature.assignment;

public class Q4 {
	public static void factorialMethod() {
		int n = 1;
		int n2 = 1;
		int fact = 5;
		
		for(n=1;n<=fact;n++) {
			n2=n*n2;
		}
		System.out.println("Factorial of " + fact + " equals: "+ n2);
	}
}
