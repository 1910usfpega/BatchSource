package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.bean.*;

public interface TheDao {

	public List<Account> getAccountInfo () throws SQLException;
	public static List<Account> getAccountInfoById(int accountId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
//	
//	public List<Account> getAllAccountType () throws SQLException;
//	public List<Account> getAccountTypeById(int AccountId) throws SQLException;
	List<Account> getAccountInfoById(List<Account> accountId) throws SQLException;
	
	List<User> getUsersById(List<User> userId) throws SQLException;
	
	
	
}
