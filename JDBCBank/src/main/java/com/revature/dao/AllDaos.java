package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.bean.BankAccount;
import com.revature.bean.Admin;
import com.revature.bean.Customer;
import com.revature.bean.Employee;

public interface AllDaos{
	public List<BankAccount> getAllAccounts() throws SQLException;
	public List<BankAccount> getMyAccounts(Customer c) throws SQLException;
	
	public List<Customer> getAllCustomers() throws SQLException;
	
	public List<Employee> getAllEmployees() throws SQLException;
	
	public List<Admin> getAllAdmin() throws SQLException;
}