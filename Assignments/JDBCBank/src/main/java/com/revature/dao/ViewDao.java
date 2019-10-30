package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.bean.Account;
import com.revature.bean.Transaction;
import com.revature.bean.User;
import com.revature.bean.UserInfo;


public interface ViewDao {
	
	public List<User> getAllUsers() throws SQLException;
	public List<UserInfo> getAllUserInfo() throws SQLException;
	public List<Account> getAllAccounts() throws SQLException;
	public List<Transaction> getAllTransaction() throws SQLException;
	
}
