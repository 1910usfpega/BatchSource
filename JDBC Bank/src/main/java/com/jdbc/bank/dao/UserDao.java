package com.jdbc.bank.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.jdbc.bank.bean.User;


public interface UserDao {

	public ArrayList<User> getAllUsers() throws SQLException;
	//methods for admin
	//revising any change in the users information for Admin use
	public void reviseUsers (User user) throws SQLException;
	public void createUser (User user) throws SQLException;
	public void deleteUser (User user) throws SQLException;
	public User UserLogin(User user) throws SQLException;
	
	static HashMap<String, String> customerInfo = new HashMap<>();
	//using list to have more room to adapt to another list if needed
	static ArrayList <User> empolyees =  new ArrayList<>();
	static ArrayList <User> customerList =  new ArrayList<>();


}
