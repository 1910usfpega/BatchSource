/******
 * 
 * Q2. Write a program to display the first 25 Fibonacci numbers beginning at 0.
 * 
 * @author johnljennings
 *
 ******/
package com.john;

public class Q2Fibonacci {

	public static void fibonnacci(int n) {
		int previousNumber = 0;
		int nextNumber = 1;
		int fibSeqCnt = 1;
		if (n < 0) {
			System.out.println("Not a valid number");
		}
		
		//iterating as we assign a 2nd number to the 1st number
		//&& assigning the sum of the last two numbers to the 2nd number.
		for (int i = 1; i <= 25; i++) {
			System.out.println(previousNumber + ":  iterated:" + (fibSeqCnt++) + " times");
			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;
		}
		
	}
}
