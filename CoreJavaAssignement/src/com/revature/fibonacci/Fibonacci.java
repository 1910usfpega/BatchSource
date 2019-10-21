package com.revature.fibonacci;
//Write a program to display the first 25 Fibonacci numbers beginning at 0


public class Fibonacci {
	private static int i;

	public static void fibonacci()  {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		System.out.print(n1 + " " + n2 + "");	
		for(i=0; i<24-1; i++) {
				  n3=n1+n2;    
				  System.out.print(" "+n3);    
				  n1=n2;//we are assigning n2 to n1  
				  n2=n3;// we are assigning n3 to n2
		}
	}
}

