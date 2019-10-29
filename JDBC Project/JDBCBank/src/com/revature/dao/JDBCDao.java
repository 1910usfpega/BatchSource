package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.bean.Accounts;
import com.revature.bean.Users;

public interface JDBCDao {
	public List<Users> getAllUsers() throws SQLException;
	public List<Accounts> getAllAccounts() throws SQLException;
	

}
