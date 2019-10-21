package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubStringTest {

	@Test
	void test() {
		SubString sub = new SubString();
		 char input = sub.subStringer("hello", 2);
		 
		 char c = 'l';
		 assertEquals(c,input);
	}

}
