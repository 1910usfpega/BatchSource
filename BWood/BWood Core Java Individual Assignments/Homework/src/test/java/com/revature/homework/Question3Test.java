package com.revature.homework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/******************************************************************************
 * Q3. Reverse a string without using a temporary variable. Do NOT use reverse()
 *     in the StringBuffer or the StringBuilder APIs.
 * @author Bryan Wood
 *
 *****************************************************************************/
class Question3Test {

	@Test
	void test() {
		String str = "hello";
		String result ="olleh";
//		StringBuilder result = new StringBuilder();
//		
//		result.append(str);
//		result.reverse();
		Question3 q= new Question3();
		assertEquals(result,q.reverseString(str));
		
	}

}
