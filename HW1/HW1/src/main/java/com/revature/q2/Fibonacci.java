package com.revature.q2;

public class Fibonacci {

	public static int[] fiboArray = new int[25];
	
	public static void fibo25() {
		fiboArray[0] = 0;
		fiboArray[1] = 1;
		System.out.print("Fibonacci Sequence: " + fiboArray[0] + " " + fiboArray[1] + " ");
		for(int i = 2; i < 25; i++) {
			fiboArray[i] = fiboArray[(i-1)] + fiboArray[(i-2)];
			System.out.print(fiboArray[i] + " ");
		}
		System.out.println();
		
	}
	
}
