package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing {

	@Test 
	void test() {
		int actualLenght = "ABCD".length();
		int expectedLength = 4;
		
		// assertEquals
		assertEquals(expectedLength, actualLenght);
//		fail("Not yet implemented");
	}

}
