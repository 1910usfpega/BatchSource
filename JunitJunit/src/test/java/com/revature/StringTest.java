package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void meh() {
		int actualLenght = "ABCD".length();
		int expectedLength = 4;
		
		// assertEquals
		assertEquals(expectedLength, actualLenght);
//		assertEquals(expectedLength, actualLenght);
//		fail("Not yet implemented");
	}

}
