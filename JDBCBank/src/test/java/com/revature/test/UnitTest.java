package com.revature.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.revature.beans.AccountBean;
import com.revature.beans.CustomerBean;
import com.revature.storage.Bank;

class UnitTest {

	static Bank testBank;
	static CustomerBean testCust;
	static AccountBean testAccount;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		testBank = new Bank();
		testCust = new CustomerBean("usernm","psswrd");
		testAccount = new AccountBean(testBank,"Savings",testCust);
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
