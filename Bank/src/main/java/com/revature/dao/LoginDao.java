package com.revature.dao;

import java.sql.SQLException;

public interface LoginDao {
	
	 void start();
	 void login();
	 void verifyLogin(String userName, String password) throws SQLException;
	 void createNewUser() throws SQLException;
	 boolean userNameAvailable(String userName) throws SQLException;
	 void createNewAccount();

}
