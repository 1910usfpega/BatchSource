package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() {
		Factorial fact = new Factorial();
		int temp = fact.factorialGo();
		assertEquals(5,temp);
	}

}
