package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeNumberListTest {

	@Test
	void test() {
		PrimeNumberList primer = new PrimeNumberList();
		boolean test = primer.isPrime();
		assertEquals(false,test);
	}

}
