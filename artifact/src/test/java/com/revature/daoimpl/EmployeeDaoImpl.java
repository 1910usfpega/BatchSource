package com.revature.daoimpl;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.revature.bean.Customer;
import com.revature.bean.Employee;
import com.revature.bean.bankAccount;

class EmployeeDaoImpl {
	static Employee a ;
	@Test
	void testGetEmployeeByName() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteUser() {
		bankAccount b = new bankAccount(123,123);
		Customer d = new Customer("Ryan","Ryan","Ryan","Ryan");
		boolean test = false;
	try {
		 test = a.deleteUserAccount(b.getAccountNumber(), d.getUserName());
		 test = true;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	assertEquals(true,test);
	}

	@Test
	void testDeleteUserAccount() {
		boolean test = false;
		bankAccount b = new bankAccount(123,123);
		Customer d = new Customer("Ryan","Ryan","Ryan","Ryan");
		a.addBankAccount(b, "Ryan");
		try {
			test = a.deleteUserAccount(b.getAccountNumber(), d.getUserName());
			test = true;
		} catch (SQLException e) {
			test = false;
			e.printStackTrace();
		}
		assertEquals(true,test);
	}

	@Test
	void testBankAccountsOfUser() {
		fail("Not yet implemented");
	}


	@Test
	void testAddBankAccount() {
		boolean test = false;
		bankAccount b = new bankAccount(123,123);
		Customer d = new Customer("Ryan","Ryan","Ryan","Ryan");
		test =a.addBankAccount(b, "Ryan");
		assertEquals(true,test);
	}

	@Test
	void testNewEmployee() {
		boolean test = false;
		try {
			a.newEmployee("Ryan", "RyanC", "C", "123");
			a.createNewUser(a.getName(), a.getLast(), a.getLast(), a.getLast(), false);
			test = true;
		} catch (SQLException e) {
			
		}
		assertEquals(true,test);
	}

}
