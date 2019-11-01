package com.jdbc.bank.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.jdbc.bank.bean.User;


public interface UserDao {

	public List<User> getAllUsers() throws SQLException;
	//methods for admin when created
	//revising any change in the users information for Admin use
	public void reviseUsers (User user) throws SQLException;
	public User getUserUname(String uname) throws SQLException;
	public int createUser (User user) throws SQLException;
	public void deleteUser (User user) throws SQLException;
	public boolean passwordMatch(String uname) throws SQLException;
	//public User UserLogin(User user) throws SQLException;

}
