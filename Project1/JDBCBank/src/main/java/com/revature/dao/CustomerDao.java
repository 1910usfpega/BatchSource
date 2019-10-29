package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Customer;

public interface CustomerDao {
	//CRUD OPS
	public List<Customer> getAllCustomers() throws SQLException;
	public List<Customer> getCustomerById(int n) throws SQLException;
	public Customer getCustomerByUser(String user) throws SQLException;
	public Customer insertCustomerByUser(String user, String password, String fName, String lName) throws SQLException;
	public Customer login(String user, String password) throws SQLException;
}
