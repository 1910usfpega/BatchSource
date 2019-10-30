package com.bank.dao;

import java.sql.SQLException;
import java.util.List;

import com.bank.bean.Users;



public interface UsersDao {
	//CRUD OPS
	public List<Users> getAllUsers() throws SQLException;

	
}
