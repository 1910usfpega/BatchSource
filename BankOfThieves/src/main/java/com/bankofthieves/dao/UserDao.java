package com.bankofthieves.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.bankofthieves.bean.Customer;


public interface UserDao {

	public List<UserName> getAllUserNames() throws SQLException;
	public List<Password> getPassword(double encrypt) throws SQLException;
	static HashMap<String, String> customerInfo = new HashMap<>();
	static ArrayList <Customer> empolyees =  new ArrayList<>();
	static ArrayList <Customer> customerList =  new ArrayList<>();

}
