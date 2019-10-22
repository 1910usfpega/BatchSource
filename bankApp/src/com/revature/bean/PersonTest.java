package com.revature.bean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void testPerson() {
		Customer a = new Customer("","","","");
		boolean aa = Person.login("","");
		assertEquals(true,aa);
	}
	@Test
	void testLogin() {
		fail("Not yet implemented");
	}
	@Test
	void testGetBankAccountsForIDCheck() {
		fail("Not yet implemented");
	}
	@Test
	void testUserCheck() {
		fail("Not yet implemented");
	}

	@Test
	void testCheckMoney() {
		fail("Not yet implemented");
	}
	@Test
	void testGetName() {
		fail("Not yet implemented");
	}
	@Test
	void testSetName() {
		fail("Not yet implemented");
	}

	@Test
	void testGetLast() {
		fail("Not yet implemented");
	}

	@Test
	void testSetLast() {
		fail("Not yet implemented");
	}

	@Test
	void testGetUsername() {
		fail("Not yet implemented");
	}

}
