package com.bank.dao;

import java.sql.SQLException;
import java.util.List;

import com.bank.bean.Accounts;



public interface AccountsDao {
	//CRUD OPS
	public List<Accounts> getAllAccounts() throws SQLException;

	
}
