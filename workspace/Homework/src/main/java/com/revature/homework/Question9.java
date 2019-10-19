package com.revature.homework;

import java.util.ArrayList;

/******************************************************************************
 * Create an ArrayList which stores numbers from 1 to 100 and prints out all the
 * prime numbers to the console.
 * 
 * @author Bryan Wood
 *
 *****************************************************************************/

public class Question9 {

	ArrayList<Integer> a = new ArrayList<Integer>();

	public void countingPrimes() {
		boolean isPrime = false;
		for (int i = 0; i < 100; i++) {
			a.add(i + 1);
			for (int j = 0; j < i + 1; j++) {
				if (j != 0) {
					if ((i + 1) % j != 0) {
						isPrime = !isPrime;
					}
				}
			}
			if (isPrime) {
				System.out.println(i );
			}
		}

	}

}
