package com.revature.homework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/******************************************************************************
 * Q4. Write a program to compute N factorial.
 *  
 * @author Bryan Wood
 *
 *****************************************************************************/
class Question4Test {

	@Test
	void test() {
		Question4 q=  new Question4();
		assertEquals(120,q.factorialN(5));
	}

}
