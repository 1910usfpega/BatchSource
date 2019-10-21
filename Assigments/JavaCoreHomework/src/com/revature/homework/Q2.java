package com.revature.homework;

public class Q2 {
	
	public static int fibonacci() {
	int n, a = 0, b = 0, c =1;
	System.out.print("Fibonacci Series: ");
	for(int i = 1; i <= 25; i++) {
		
		a = b;
		b = c;
		c = a + b;
		System.out.print(a+" ");
		
	}
	System.out.println();
	return a;}
}
