package com.revature.homework;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
/******************************************************************************
 * Q6. Write a program to determine if an integer is even without using
 *      the modulus operator (%)
 * @author Bryan Wood
 *
 *****************************************************************************/
class Question6Test {

	@Test
	void testTrue() {
		int x = 20;
		

//		Question6 q = new Question6();
		//System.out.println("Testing if "+x+" is even or odd.");
		assertTrue(Question6.isEven(x));
	
	}

	@Test
	void testFalse() {
		int y = 21;
		assertFalse(Question6.isEven(y));
	}
}
