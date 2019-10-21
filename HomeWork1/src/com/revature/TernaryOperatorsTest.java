package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TernaryOperatorsTest {

	@Test
	void testTernary() {
		int temp = 1;
		TernaryOperators a = new TernaryOperators();
		int aa =a.ternary(); //1 10
		assertEquals(aa,temp);
	}

}
