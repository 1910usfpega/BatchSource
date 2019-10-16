package com.revature.homework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/******************************************************************************
 * Q1.  Perform a bubble sort on the following integer array:
 *      1,0,5,6,3,2,3,7,9,8,4
 *      
 * @author Bryan Wood
 *
 *****************************************************************************/


class Question1Test {

	@Test
	void testArrayOrder() {
		int[] start= new int[] {1,0,5,6,3,2,3,7,9,8,4};
		int[] result = new int[] {0,1,2,3,3,4,5,6,7,8,9};
//		int[] checking = result;
		assertEquals(result, start);
		
	}

}
