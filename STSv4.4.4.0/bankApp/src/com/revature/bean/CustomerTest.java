package com.revature.bean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {
	@Test
	void testAddBankAccount() {
		Customer a = new Customer("Ryan","Crnich","Ryancrnich","123");
		a.addBankAccount();
		bankAccount [] aa = a.allAccounts();
		int temp = aa.length;
		assertEquals(2,temp);
	}
	@Test
	void testViewAccount() {
		Customer a = new Customer("Ryan","Crnich","Ryancrnich","123");
		a.addBankAccount();
		a.addBankAccount();
		bankAccount [] aa = a.allAccounts();
		int b = aa.length;
		assertEquals(3,b);
	}
	@Test
	void testViewAccountBalance() {
		Customer a = new Customer("Ryan","Crnich","Ryancrnich","123");
		bankAccount [] z = a.allAccounts();
		double as = 0;
		double amount =20;
		for(bankAccount x : z) {
			x.deposit(amount);
			as = x.getBalance();
		}
		assertEquals(as,amount);
	}
	@Test
	void testTransfer() {// not working
		double amount =20;
		Customer a = new Customer("Ryan","Crnich","Ryancrnich","123");
		Customer b = new Customer("MIke","kyle","mikekyle","234");
		bankAccount [] c = a.allAccounts();
		bankAccount [] d = b.allAccounts();
		c[0].deposit(amount);
		System.out.print(" "+c[0].getBalance());
		a.transfer(amount-1, c[0], d[0]);
		System.out.print(" "+d[0].getBalance()+" ");
		assertEquals(d[0].getBalance(),amount);
	}
	@Test
	void testAllAccounts() {
		Customer a = new Customer("Ryan","Crnich","Ryancrnich","123");
		a.addBankAccount();
		a.addBankAccount();
		bankAccount [] aa =a.allAccounts();
		int aaa = aa.length;
		assertEquals(aaa,3);
	}
}