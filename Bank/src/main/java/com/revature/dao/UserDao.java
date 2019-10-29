package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Account;
import com.revature.beans.Users;


public interface UserDao {
	// CRUD OPS
	// create, read, update, delete
	
	public void mainMenu( String userName, int accountID );
	public List<Account> viewBalances(int accountID);
	public void withdrawal(int accountID, double amount) throws SQLException;
	public void deposit(int accountID, double amount) throws SQLException;
	
}

