package com.revature.q2;

import java.util.Arrays;

/**
 * 	Class Fibonacci
 * 	@author James Todd
 *
 *	Fibonacci is a class designed to display the first 25 numbers of the Fibonacci sequence beginning with 0.
 *
 *	One method: fib()
 *
 *	fib() is a method designed to create an array of 25 integers, then populate the array beginning with 0 and 1 then calculating
 *		each subsequent Fibonacci number before adding it to the array in the corresponding order. Once the array is fully populated,
 *		the array is then displayed using the toString(int[]) function located in java.util.Arrays
 *
 */


public class Fibonacci {
	
	public static void fib() {
		System.out.println("Q2");
		
		int[] fib = new int[25];
		fib[0] = 0;
		fib[1] = 1;
		
		for(int i=2; i<fib.length; i++) {
			fib[i] = fib[i-2]+fib[i-1];
		}
		
		System.out.println("Fibonacci numbers: " + Arrays.toString(fib) + "\n");
	}
}
