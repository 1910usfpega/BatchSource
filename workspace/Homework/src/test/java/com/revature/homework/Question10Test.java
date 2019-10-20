package com.revature.homework;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/******************************************************************************
 * Q10. Find the minimum of two numbers using ternary operators.
 * @author Bryan Wood
 *
 *****************************************************************************/

class Question10Test {

	@Test
	void test(Number answer ,Number a, Number b) {
		Question10 q= new Question10();
		
//		 a = 10;
//		 b = 50;
		
		assertEquals(answer, q.getMin(a, b));
		
		
		
	}

}
