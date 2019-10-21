package com.revature.homework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/******************************************************************************
 * Create an ArrayList which stores numbers from 1 to 100 and prints out 
 *  		all the prime numbers to the console.
 * @author Bryan Wood
 *
 *****************************************************************************/
class Question9Test {

	@Test
	void test() {

		int[] knownPrime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
								43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,97};
		Question9 q = new Question9();
		int[] result = new int[knownPrime.length];
		result = q.countingPrimes();
		
		assertArrayEquals(knownPrime,result);
	}

}
