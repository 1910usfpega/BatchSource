package com.revature.assignment;

public class Q2 {
	public static void fib() {
	int fib = 25, n1=0, n2=1;
	System.out.println("First "+ fib + " Term: ");
	
	for(int i =1; i<=fib;i++) {
		System.out.println(n1);
		
		int nacci = n1 + n2;
		n1 = n2;
		n2=nacci;
	}

}

}
