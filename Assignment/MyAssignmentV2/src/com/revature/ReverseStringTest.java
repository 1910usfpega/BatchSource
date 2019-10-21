package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
//		String stringer = "hello";
		ReverseString reve = new ReverseString();
		String input = reve.reverseString();
		assertEquals(input,"olleh");
	}

}
