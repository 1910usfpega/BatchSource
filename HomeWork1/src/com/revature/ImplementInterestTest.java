package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImplementInterestTest {

	@Test
	void testImplement() {
		ImplementInterest a = new ImplementInterest();
		double temp =a.implement();// first 100 second 1 third 1 == 100
		assertEquals(100.0,temp);
	}

}
