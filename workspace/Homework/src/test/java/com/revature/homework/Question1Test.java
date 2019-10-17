package com.revature.homework;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

/******************************************************************************
 * Q1. Perform a bubble sort on the following integer array:
 * 1,0,5,6,3,2,3,7,9,8,4
 * 
 * @author Bryan Wood
 *
 *****************************************************************************/

class Question1Test {

	@Test
	void testArrayOrder() {

		//create object of type Question1 to actually test the method
		Question1 q = new Question1();
		
//		create example and what the end result of that example should be.
		int[] startingPoint = new int[] { 1, 0, 5, 6, 3, 2, 7, 3, 9, 8, 4 };
//		int[] result = Arrays.sort(start);
		int[] expectedResult = new int[] {0,1,2,3,3,4,5,6,7,8,9};
		q.bubbleSort(startingPoint);
//		System.out.println(Arrays.toString(start));
//		System.out.println(Arrays.toString(result));
		assertArrayEquals(expectedResult, startingPoint);

	}

}
