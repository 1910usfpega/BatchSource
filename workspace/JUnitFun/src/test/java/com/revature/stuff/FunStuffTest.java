package com.revature.stuff;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class FunStuffTest {

	@SuppressWarnings("deprecation")
	@Test
	void test1(String s) {
//		 new Person("Bobo", 3,35);
		int expectedMaxLength=80;
		Assert.assertTrue(s.length()<expectedMaxLength);
	}

}
