package com.revature.tasks;

import java.util.ArrayList;
import java.util.List;

import utils.PrimeNumber;

public class Q19 {
	/*
	 * Create an ArrayList and insert integers 1 through 10. Display the ArrayList.
	 * Add all the even numbers up and display the result. Add all the odd numbers
	 * up and display the result.
	 * 
	 * Remove the prime numbers from the ArrayList and print out the remaining
	 * ArrayList.
	 */

	public static void driver() {
		System.out.println();
		System.out.println("==> Q19");

		List<Integer> arrayToTen = new ArrayList<Integer>();

		Integer evenSum = 0;
		Integer oddSum = 0;
		
		for (int i = 0; i < 10; i++) {
			arrayToTen.add(i + 1);
			if (((i+1) % 2) == 1) {
				// odd
				oddSum = oddSum + i + 1;
			} else {
				// even
				evenSum = evenSum + i + 1;
			}
		}

		System.out.println("ArrayList: " + arrayToTen.toString());
		System.out.println("Even numbers sum: " + evenSum);
		System.out.println("Odd numbers sum: " + oddSum);
		
		for (int i = 0; i<arrayToTen.size(); i++ ) {
			if (PrimeNumber.checkPrime(arrayToTen.get(i))) {
				arrayToTen.remove(i);
			}
		}
		
		System.out.println("ArrayList without prime numbers: " + arrayToTen.toString());

	}
}
