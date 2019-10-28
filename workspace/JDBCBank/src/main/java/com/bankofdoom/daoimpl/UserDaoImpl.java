package com.bankofdoom.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bankofdoom.bean.User;
import com.bankofdoom.dao.UserDao;
import com.bankofdoom.util.ConnFactoryW;

public class UserDaoImpl implements UserDao {
	
	public static ConnFactoryW cf = ConnFactoryW.getInstance();
	private static String sql;
	private static Connection conn = cf.getConnection();
	
	
	
	@Override
	public List<User> getAllUsers() throws SQLException {
		// arraylist to be returned to get all users
		List<User> userList = new ArrayList<User>();
		//my connection to the database
		
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select user_id , user_name from "
				+ "user_table;");
		User a=null;
		/*
		 * int userId, String uName, String name, String address, 
		 * String email, String phoneNumber, ArrayList<String> role
		 */
		while(rs.next()) {
			a=new User(rs.getInt(1),rs.getString(2));			
			userList.add(a);
		}
		return userList;
	}

	
	@Override
	public void updateUser(User u) throws SQLException {
		/*Updates user information
		 */
		sql= "update user_table set"
				+ "user_name = ?, legal_name=?, address=?, email=?,"
				+ " contact_num=? where user_name=?";
		PreparedStatement ps= conn.prepareStatement(sql);
		
		ps.setString(1, u.getuName());
		ps.setString(2, u.getName());
		ps.setString(3, u.getAddress());
		ps.setString(4, u.getEmail());
		ps.setString(5, u.getPhoneNumber());
		ps.setString(6, u.getuName());
		ps.executeUpdate();

	}

	public void updateUserRole(User u) throws SQLException{
		sql= "update user_table(user_role) values() where user_id=?";
		PreparedStatement ps= conn.prepareStatement(sql);
		
		ps.setString(2, u.getuName());
		ps.setInt(1, u.getRole());
	}
	
	@Override
	public void createNewUser(User u) throws SQLException {
		sql= "insert into user_table("
				+ "user_name, legal_name, address, email, contact_num,user_role) "
				+ "values(?,?,?,?,?,0)";
		PreparedStatement ps= conn.prepareStatement(sql);
		
		ps.setString(1, u.getuName());
		ps.setString(2, u.getName());
		ps.setString(3, u.getAddress());
		ps.setString(4, u.getEmail());
		ps.setString(5, u.getPhoneNumber());
		ps.execute();

	}

	@Override
	public void deleteUser(User u) throws SQLException {
		//delete from registered_user where user_name='test';
		sql = "delete from user_table where user_name=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,u.getuName());
		ps.executeUpdate();
	}

/**
 * 
 */
	@Override
	public void createLogin(User u) throws SQLException {
		 sql= "insert into registered_user values(?,?)";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1, u.getuName());
		ps.setInt(2, u.getPassword());
		ps.executeUpdate();
		
	}

	/*In case of weird role issue the index that should 
	 * be returned is the role, if the list is being pop'd by usernames, 
	 * the index would need adjusting by +1
	 */
	@Override
	public List<String> getRoles(User u) throws SQLException {
		List<String> rList = new ArrayList<>();
		//my connection to the database
		sql = "select my_role from roles where user_name=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, u.getuName());
		ResultSet rs= ps.executeQuery();
		
		while(rs.next()) {
			rList.add(rs.getString(1));
		}
		
		return rList;
	}

	
	@Override
	public User userLogin(User u) throws SQLException {
		
		sql= "select * from bank_login(?,?)";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,u.getuName());
		ps.setInt(2, u.getPassword());
		ResultSet rs= ps.executeQuery();
		
		if(!rs.next()) {
			return null;
		}
		u= new User(rs.getInt(1),rs.getString(2));
		
		return u;
	}


	@Override
	public void updateLogin(User u) throws SQLException {
		 sql= "update registered_user values(?,?) where user_name=?";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setString(1, u.getuName());
			ps.setInt(2, u.getPassword());
			ps.setString(3, u.getuName());
			ps.executeUpdate();
		
	}

	

}
