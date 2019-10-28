package com.revature.dao;

import java.sql.SQLException;
public interface EmployeeDao {
	public String viewUser(String username)throws SQLException;
	public void deleteUser(String username)throws SQLException;
	public void updateUserUsername(String username, String updatedUserUsername)throws SQLException;
	public void updateUserPassword(String username,String updatedPassword)throws SQLException;
}
