package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestString {

	@Test
	void meh() {
		int actualLength="ABCD".length();
		int expectedLength=4;
		//assertEquals( expected value, actual value);
		assertEquals(expectedLength, actualLength);
	}

}
