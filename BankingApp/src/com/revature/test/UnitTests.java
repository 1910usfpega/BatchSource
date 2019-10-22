package com.revature.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.revature.storage.Bank;
import com.revature.user.Account;
import com.revature.user.Customer;

class UnitTests {
	static Bank testBank;
	static Customer testCust;
	static Account testAccount;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		testBank = new Bank();
		testCust = new Customer("usernm","psswrd");
		testAccount = new Account(testBank,"Savings",testCust);
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
