package com.revature.homework;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
/*******************************************************************************
 * Q2. Write a program to display the first 25 Fibonacci numbers beginning at 0.
 * @author Bryan Wood
 *
 ******************************************************************************/
class Question2Test {

	@Test
	static void testFibonacci() {
		int[] result= {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368};
		Question2 q=new Question2();
		q.Fibanacci();
		
		assertArrayEquals(result,q.x);
		
		
	}
public static void main(String[] args) {
	testFibonacci();	
	}

}
