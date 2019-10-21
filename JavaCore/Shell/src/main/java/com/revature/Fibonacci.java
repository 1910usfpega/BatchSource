package com.revature;

public class Fibonacci {
	public static void fibFun() { 
	int fibNumber = 25, fibNumba1 = 0, fibNumba2 = 1;
	
	
	System.out.println(fibNumba1);
	System.out.println(fibNumba2);
	for(int i=0; i < fibNumber; i++) {
		int fibNumba3 = fibNumba1 + fibNumba2;
		fibNumba1 = fibNumba2;
		fibNumba2 = fibNumba3;
		System.out.println(fibNumba3);
	}
	}
}
