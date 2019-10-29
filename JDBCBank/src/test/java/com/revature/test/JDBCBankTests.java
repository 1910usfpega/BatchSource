package com.revature.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.revature.beans.Customer;
import com.revature.util.ConnFactory;
import com.revature.util.GlobalStorageSingletone;

class JDBCBankTests {

	@Test
	void test_conn_factory() {
		ConnFactory cf = ConnFactory.getInstance();
		ConnFactory cf1 = ConnFactory.getInstance();
		assertEquals(cf, cf1);
	}
	
	@Test
	void test_singleton() {
		GlobalStorageSingletone gss = GlobalStorageSingletone.getInstance();
		assertEquals(gss.getCurrentUser(), null);
	}
	
	@Test
	void test_customer() {
		Customer a = new Customer(1, "Test", "Test", "Test", "Test", true);
		a.showMenu();
	}
	

}
