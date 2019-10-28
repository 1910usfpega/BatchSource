package com.revature.dao;

import java.sql.SQLException;

public interface LoginDao {
//CRUD OPS
	public void welcomeScreen();
	public void login();
	public void isAccountValid(String user, String pw) throws SQLException;
	public void adminCheck(String user, String pw);
	public void createNewAccount() throws SQLException;
	public boolean usernameAvailability(String user) throws SQLException;
}
