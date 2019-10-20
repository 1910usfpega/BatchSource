package com.revature.homework;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/******************************************************************************
 * Q10. Find the minimum of two numbers using ternary operators.
 * @author Bryan Wood
 *
 *****************************************************************************/

class Question10Test {
	Number a = 10;
	Number b = 50;
	
	@Test
	void testTrue() {
		Question10 q= new Question10();
		
		 
		assertEquals(a, q.getMin(a, b));
		
	}

	
}
