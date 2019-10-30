package com.bank.daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bank.bean.Users;
import com.bank.dao.UsersDao;
import com.bank.util.ConFactory;

public class UsersDaoImpl implements UsersDao {

	public static ConFactory cf = ConFactory.getInstance();

	public List<Users> getAllUsers() throws SQLException {
		// TODO Auto-generated method stub
		List<Users> usersList = new ArrayList<Users>();
		Connection conn= cf.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from users");
		Users a = null;
		while(rs.next()) {
			a = new Users(rs.getInt("users_id"), rs.getString("users_first_name"), rs.getString("users_last_name"), rs.getString("users_name"), rs.getString("users_password"),rs.getString("users_type"));
			usersList.add(a);
		}
		
		return usersList;
	}
	
	public void insertNewUser(String users_id, String users_password, String users_first_name,String users_last_name,String account_id	) throws Exception{
		
	}
	
	
}
	

