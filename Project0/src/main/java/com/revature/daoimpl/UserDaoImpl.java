package com.revature.daoimpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.dao.UserDao;
import com.revature.model.Account;
import com.revature.model.User;
import com.revature.util.ConnFactory;

public class UserDaoImpl extends AccountDaoImpl implements UserDao {
	
	public static ConnFactory cf = ConnFactory.getInstance();
	
	public List<User> getUsers() throws SQLException {
		
		//holds all the users returned from the query
		List<User> usersList = new ArrayList<User>();

		Connection conn= cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM users");
		
		User user =null;
		//inside the while loop assign each row to a User object.
		while(rs.next()) {
			user = new User(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
			usersList.add(user);		
		}
		return usersList;
	}

	public List<User> getUserByUsername(String username) throws SQLException {
		List<User> userList = new ArrayList<User>();
		
		Connection conn= cf.getConnection();
		String sql = "SELECT * FROM users WHERE username = ? ";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, username);
		ResultSet rs = ps.executeQuery();

		User user =null;
		
		while(rs.next()) {
			user = new User(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
			userList.add(user);		
		}
		return userList;
	}

	public int createUser(User user) throws SQLException {
		int usersCreated = 0;
		
		String sql = "INSERT INTO users(username, user_password, first_name, last_name) VALUES (?, ?, ?, ?)";
		//once stored procedure works we can use a callable statement since we are not receiving any user input
		//String sql = "{ ? = call user_insert(?, ?, ?, ?)}";
		
		Connection conn= cf.getConnection();
		
		//CallableStatement cs = conn.prepareCall(sql);
		//cs.setString(1, user.getUsername());
		//cs.setString(2, user.getPassword());
		//cs.setString(3, user.getFirstName());
		//cs.setString(4, user.getLastName());
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, user.getUsername());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getFirstName());
		ps.setString(4, user.getLastName());
		
		ps.executeUpdate();

		return usersCreated;
	}


	public int updateUser(User user) throws SQLException {
		int usersUpdated = 0;
		
		String sql = "UPDATE users" 
					+ " SET firstName = ?," 
					+ " lastName = ?,"
					+ " WHERE username = ?";
		Connection conn= cf.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1,user.getFirstName() );
		ps.setString(2, user.getLastName());
		ps.setString(3, user.getUsername());
		usersUpdated = ps.executeUpdate();
		
		return usersUpdated;
	}

	//we make a conn to the db to select a username if it matches the passed string
	//if ResultSet has next() match set to true.
	public boolean doesUsernameMatch(String username) throws SQLException {
		boolean match = false;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM users WHERE username = ?";
		
		Connection conn= cf.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, username);
		rs = ps.executeQuery();
		
		if(rs.next()) {
			match = true;
		} else {
			match = false;
		}
		
		return match;
	}

	//used to select a user if the passed username AND password match any row  on the users table.
	public boolean doesPasswordMatch(String password, String username) throws SQLException {
		boolean match = false;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM users WHERE user_password = ?"
					+ " AND username = ?";
		
		Connection conn= cf.getConnection();
		//PreparedStatements are precompiled SQL statements 
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, password);
		ps.setString(2,  username);
		
		rs = ps.executeQuery();
		//we use the ResultSet inside the while loop to iterate
		//through the ResultSet returned from the prepared statement execute query.
		while(rs.next()) {
			if ((password.equals(rs.getString("user_password")) && username.equals(rs.getString("username")))) {
				match = true;
			} else {
				match = false;
		}		
	}
		return match;
	}
}
