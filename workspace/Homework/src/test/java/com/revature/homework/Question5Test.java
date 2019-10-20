package com.revature.homework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/******************************************************************************
 * Q5. Write a substring method that accepts a string str and an integer 
 *      idx and returns the substring contained between 0 and idx-1 inclusive.
 *      Do NOT use any of the existing substring methods in the String, 
 *      StringBuilder, or StringBuffer APIs.
 * @author Bryan Wood
 *
 *****************************************************************************/
class Question5Test {

	@Test
	void test() {
		String s1 = "running";
		int index = 3;
		String r1 = "run";
		Question5 q = new Question5();
		assertEquals(r1,q.newString(s1, index));
	}

}
