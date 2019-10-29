package main.java.dao;

import java.sql.SQLException;
import java.util.List;

import main.java.bean.User;

public interface UserDao {
	public List<User>getAllUsers() throws SQLException;
	public void insertAccount(String user, String pw, String fName, int aType) throws SQLException;
}
