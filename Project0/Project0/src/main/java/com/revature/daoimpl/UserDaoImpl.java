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
		List<User> usersList = new ArrayList<User>();
		
		Connection conn= cf.getConnection();
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM users");
		
		User user =null;
		//while loop to add new user from each row
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
		
		//safer than statement since we are receiving input
		PreparedStatement ps = conn.prepareStatement(sql);

		//get string id, first param is index, 2nd id value.
		ps.setString(1, username);
		
		//assign the executeQuery to the ResultSet
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
		//String sql = "{ ? = call user_insert(?, ?, ?, ?)}";
		
		Connection conn= cf.getConnection();
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		//CallableStatement cs = conn.prepareCall(sql);
		ps.setString(1, user.getUsername());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getFirstName());
		ps.setString(4, user.getLastName());
		
		//cs.setString(1, user.getUsername());
		//cs.setString(2, user.getPassword());
		//cs.setString(3, user.getFirstName());
		//cs.setString(4, user.getLastName());
		
		ps.executeUpdate();
		
		//AccountDaoImpl adi = new AccountDaoImpl();
		//Account account = new Account();
		//account.setId(user.getUsername());
		//account.setBalance(0);
		//adi.createAccount(account);
		
		
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

	public boolean doesPasswordMatch(String password, String username) throws SQLException {
		boolean match = false;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM users WHERE user_password = ?"
					+ " AND username = ?";
		
		Connection conn= cf.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, password);
		ps.setString(2,  username);
		
		rs = ps.executeQuery();
		
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
