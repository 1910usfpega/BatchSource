package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TernaryOperatorTest {

	@Test
	void test() {
		int temp = 1;
		TernaryOperators ternary1 = new TernaryOperators();
		int a = ternary1.ternary();
		assertEquals(a,temp);
	}

}
