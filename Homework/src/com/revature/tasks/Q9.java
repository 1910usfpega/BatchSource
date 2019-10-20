package com.revature.tasks;

import java.util.ArrayList;
import java.util.List;

import com.revature.driver.PrimeNumber;

public class Q9 {
	// Create an ArrayList which stores numbers from 1 to 100 and 
	// prints out all the prime numbers to the console.
	
	public static void driver() {
		System.out.println();
		System.out.println("==> Q9");
		List<Integer> listOfIntegers = new ArrayList<Integer>();
		for (int i=1; i<101; i++) {
			listOfIntegers.add(i);
		}
		
		System.out.print("Prime numbers: ");
		for (Integer num:listOfIntegers) {
			if (PrimeNumber.checkPrime(num)) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
	}
}
