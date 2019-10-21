package com.revature.questions;

public class Q2 {

	
	public static int printFib(int n) {
		int a=0;
		int b=1;
		int c=0;;
		for (int i=0;i<n;i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
		return c-a;
	}

}
