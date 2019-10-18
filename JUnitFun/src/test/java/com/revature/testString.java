package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class testString {

	
	@BeforeAll
	static void beforeAllofem() {
		System.out.println("Before All");
	}
	
	@Test
	@DisplayName("Length Check")
	void meh() {
		int actualLengh="ABCD".length();
		int expectedLength = 4;
		//assertEquals will take two parameters (expected value and actual value)
		assertEquals(expectedLength, actualLengh);
		
	}
	
	@Test
	void toUpperCase() {
		String str = "abcd";
		String result = str.toUpperCase();
		assertEquals("ABCD",result);
	}
	


}
