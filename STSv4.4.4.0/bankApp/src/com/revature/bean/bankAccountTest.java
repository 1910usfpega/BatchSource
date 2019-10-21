package com.revature.bean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class bankAccountTest {

	@Test
	void testDeposit() {
		bankAccount a = new bankAccount();
		a.deposit(20);
		double temp = a.getBalance();
		assertEquals(temp,20);

	}

	@Test
	void testWithdrawDouble() {
		bankAccount a = new bankAccount();
		a.deposit(20);
		a.withdraw(19);
		double temp = a.getBalance();
		assertEquals(1,temp);
	}

	

	@Test
	void testGetAccountNumber() {
		bankAccount a = new bankAccount();
		assertEquals(1,a.getAccountNumber());
	}

	@Test
	void testGetBalance() {
		bankAccount a = new bankAccount();
		a.deposit(20);
		double temp = a.getBalance();
		assertEquals(20,20);
	}

}
