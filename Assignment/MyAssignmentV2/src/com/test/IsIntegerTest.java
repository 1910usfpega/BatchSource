package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.revature.IntegerIsEven;

class IsIntegerTest {

	@Test
	void test() {
			IntegerIsEven test= new IntegerIsEven();
			

	 
			String str= "abcd";
			String result =str.toUpperCase();
			assertEquals("ABCD",result);
		}
//		IntegerIsEven test = new IntegerIsEven();
//		boolean output = test.testEvenNumber(2);
//		assertEquals(true,1);
	

}
