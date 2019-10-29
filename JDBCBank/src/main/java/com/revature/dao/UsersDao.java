package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Customer;
import com.revature.beans.User;
import com.revature.exceptions.UsernameAlreadyExistsException;

public interface UsersDao {
	public List<User> getUserByLoginAndPass(String login, String pass) throws SQLException;
	public List<Customer> getAllCustomers();
	public Customer createNewCustomer(String username, String password, String firstName, String lastName ) throws UsernameAlreadyExistsException;
	
}
