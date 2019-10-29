package com.revature.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.revature.beans.AccountBean;
import com.revature.beans.CustomerBean;


class UnitTest {

	static CustomerBean testCust;
	static AccountBean testAccount;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		testCust = new CustomerBean("usernm","psswrd");
		testAccount = new AccountBean("Savings", testCust.getUsername());
	}

	@Test
	void test1() {
		String type=testAccount.getAccountType();
		assertEquals(type,"Savings");
	}
	
	@Test
	void test2() {
		testAccount.setAccountNumber(555);
		int num=testAccount.getAccountNumber();
		assertEquals(num,555);
	}
	
	@Test
	void test3() {
		String name=testCust.getPassword();
		assertEquals(name,"psswrd");
	}


}
