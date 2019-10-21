package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class reverseStringTest {

	@Test
	void test() {
		String aaa = "olleh";
		ReverseString a = new ReverseString();
		String aa =a.reverseString();
		assertEquals(aaa, aa);
	
		
	}

}
