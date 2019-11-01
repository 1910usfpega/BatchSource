package com.jdbc.bank.daoimple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.bank.bean.User;
import com.jdbc.bank.dao.UserDao;
import com.jdbc.bank.util.ConnFactory;

public class UserDoaImple implements UserDao {
	
		public static ConnFactory cf = ConnFactory.getInstance();
		
//TODO copy and paste the methods as they will be using the similar logic
//		*****reminder to not type everything out****
		
		
		//TODO write out my CRUD methods
		
		@Override
		public int createUser(User user) throws SQLException {
			int userCreated = 0;
			Connection con = cf.getConnection();
			//prepare a statement//buffer a statement
			String sql = "insert into users(user_id, user_uname, user_password, user_first_name, user_last_name) values(nextval (\'usersequence\'), ?, ? , ?, ?)";	
			
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, user.getuName());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getFirstName());
			ps.setString(4, user.getLastName());
			
			ps.executeUpdate();
			
			return userCreated;
		}
		
		
		@Override
		public List<User> getAllUsers() throws SQLException {
			List<User> userList = new ArrayList<User>();
			Connection con = cf.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM users");
			
			User u = null;
			
			while(rs.next()) {
				u = new User(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				userList.add(u);
			}
			return userList;
		}
				
		
		@Override
		public void reviseUsers(User user) throws SQLException {
			Connection con = cf.getConnection();
			//prepare a statement//buffer a statement
			String sql = "update users set user_first_name= ? user_last_name = ?";	
			
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, user.getFirstName());
			ps.setString(2, user.getLastName());
			ps.executeUpdate();			
		}
		

		@Override
		public void deleteUser(User user) throws SQLException {
			Connection con = cf.getConnection();
			//prepare a statement//buffer a statement
			String sql = "DELETE FROM users WHERE user_uname = ?";		
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, user.getuName());
			ps.executeUpdate();
		}


		//TODO Write methods that grab the username, compare existing passwords with boolean
		
		@Override
		public User getUserUname(String uname) throws SQLException {
			Connection con = cf.getConnection();
			String sql = "SELECT * FROM users WHERE user_uname = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(2, uname);
			ResultSet rs = ps.executeQuery();
			
			User user = null;
			
			while(rs.next()) {
				user = new User(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			}
			return user;
		}

		
		@Override
		public boolean passwordMatch(String uname) throws SQLException {
			boolean match = false;
			ResultSet rs = null;
			
			Connection con = cf.getConnection();
			String sql = "SELECT * FROM users WHERE user_uname = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, uname);
			
			rs = ps.executeQuery();
			
			if (rs.next()) {
				match = true;
			} else {
				match = false;
			}
			
			return match;
		}
		
		
		public boolean doesPassMatch(String password, String username) throws SQLException {
			boolean isMatch = false;
			ResultSet rs = null;
			
			Connection conn= cf.getConnection();
			String sql = "SELECT * FROM users WHERE user_password = ?"
						+ " AND user_uname = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, password);
			ps.setString(2,  username);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				if ((password.equals(rs.getString("user_password")) && username.equals(rs.getString("user_uname")))) {
					isMatch = true;
				} else {
					isMatch = false;
				}		
			}
			return isMatch;
		}
}
