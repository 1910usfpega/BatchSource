package com.revature.dao;

import java.sql.SQLException;

import com.revature.bean.Account;
import com.revature.bean.Transaction;
import com.revature.bean.UserInfo;

public interface InsertDao {
	
	public void addUser(UserInfo u) throws SQLException;
	public void addAccount(Account a) throws SQLException;
	public void addTransaction(Transaction t) throws SQLException;

}
