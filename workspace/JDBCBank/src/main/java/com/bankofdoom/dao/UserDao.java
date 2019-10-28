package com.bankofdoom.dao;

import java.sql.SQLException;
import java.util.List;

import com.bankofdoom.bean.User;
public interface UserDao {
	public List<User> getAllUsers() throws SQLException;
	public void updateUser(User u)  throws SQLException;
	public void createNewUser(User u) throws SQLException;
	public void deleteUser(User u) throws SQLException;
	public User userLogin(User u) throws SQLException;
	public List<String> getRoles(User u)  throws SQLException;
	void createLogin(User u) throws SQLException;
	void updateLogin(User u) throws SQLException;
	
}
