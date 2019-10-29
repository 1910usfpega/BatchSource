package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Account;

public interface AccountDao {
	//CRUD OPS
	public List<Account> getAllAccounts() throws SQLException;
	//for every concrete bean you should have a Dao and DaoImpl
	public Account getAccountById(int id) throws SQLException; 
}
