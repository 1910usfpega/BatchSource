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
		
		for (int i = 1; i < 100; i++) {
			int isPrime=0;
			a.add(i + 1);
			for (int j = 1; j < i ; j++) {
			
//					if(i==2)
//						System.out.println(i+ ": is a Prime Number.");
					if (i % j == 0) {
						isPrime++;
				}
			}
			if(isPrime==2) {
			System.out.println(i*2+ ": is a Prime Number.");
			}
		}

	}

}
