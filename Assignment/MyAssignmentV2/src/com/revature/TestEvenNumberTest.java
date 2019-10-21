package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEvenNumberTest {

	@Test
	void test() {
		IntegerIsEven inteT = new IntegerIsEven();
		 int output = inteT.testEvenNumber(4);
		 assertEquals(4,output);
	}

}
