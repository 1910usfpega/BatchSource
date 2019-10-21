package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEvenNumberTest {

	@Test
	void test() {
		IntegerIsEven inteT = new IntegerIsEven();
		 boolean output = inteT.testEvenNumber(4);
		 assertEquals(true,output);
	}

}
