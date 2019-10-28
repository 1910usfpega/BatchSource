package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Customer;
import com.revature.beans.User;

public interface UsersDao {
	public List<User> getUserByLoginAndPass(String login, String pass) throws SQLException;
	public List<Customer> getAllCustomers();
	
}
