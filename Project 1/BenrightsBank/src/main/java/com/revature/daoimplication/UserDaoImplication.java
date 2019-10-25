package com.revature.daoimplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.User;
import com.revature.dao.UserDao;
import com.revature.util.DataBaseConnector;

public class UserDaoImplication implements UserDao {

	public static DataBaseConnector dbc = DataBaseConnector.getInstance();
	
	public List<User> getAllUsers() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getUsersByAccountId(int accountId) throws SQLException {
		List<User> userList = new ArrayList<User>();
		Connection conn = dbc.getConnection();
		String sql = "select * from Users where user";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery("select * from \"Album\"");
	}

}
