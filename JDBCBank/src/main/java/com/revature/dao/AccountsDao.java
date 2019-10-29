package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.bean.Accounts;

public interface AccountsDao {

	public List<Accounts> getAllAccounts() throws SQLException;

	
}

