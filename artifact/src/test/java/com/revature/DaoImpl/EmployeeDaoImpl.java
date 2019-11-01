package com.revature.DaoImpl;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.revature.bean.Customer;
import com.revature.bean.Employee;
import com.revature.bean.bankAccount;
import com.revature.daoimpl.Customerdaoimpl;
import com.revature.daoimpl.EmployeeDaoimpl;


class EmployeeDaoImpl {
	static Customer customer =new Customer("name","last","username","123");
	static Employee employee =new Employee("","","","");
	static bankAccount  bankaccount = new bankAccount(1,100);
	  static Customerdaoimpl supercustomer = new Customerdaoimpl();
	    static EmployeeDaoimpl superemployee = new EmployeeDaoimpl();


	@Test
	void testBankAccountsOfUser() {
		if(superemployee.bankAccountsOfUser()    .size()>0)
	}

	@Test
	void testGetEmployeeByName() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteUser() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteUserAccount() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateUserUsername() {
		fail("Not yet implemented");
	}

//	@Test
//	void testAddBankAccount() {
//		s
//	}

	@Test
	void testNewEmployee() {
		fail("Not yet implemented");
	}




}
