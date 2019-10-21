package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test
	void test() {
		Palindrome test = new Palindrome();
		boolean input = test.isPalindrome("bob");
		assertEquals(input,true);
	}

}
