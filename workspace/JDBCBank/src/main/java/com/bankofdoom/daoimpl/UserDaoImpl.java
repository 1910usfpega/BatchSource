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
import com.bankofdoom.display.MenuMethod;
import com.bankofdoom.util.ConnFactoryW;

public class UserDaoImpl implements UserDao {

	public static ConnFactoryW cf = ConnFactoryW.getInstance();
	private static String sql;
	private static Connection conn = cf.getConnection();

	@Override
	public List<User> getAllUsers(){
		// arraylist to be returned to get all users
		List<User> userList = new ArrayList<User>();
		// my connection to the database

		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select user_id , user_name from " 
					+ "user_table;");
			User a = null;

			while (rs.next()) {
				a = new User(rs.getInt(1), rs.getString(2));
				userList.add(a);
			}
		} catch (SQLException e) {
			System.out.println("Unable to get users as requested.");
			e.printStackTrace();
		}

		return userList;
	}

	@Override
	public void updateUser(User u) {
		/*
		 * Updates user information
		 */
		sql = "update user_table set" + "user_name = ?, legal_name=?, address=?, email=?,"
				+ " contact_num=? where user_name=?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, u.getuName());
			ps.setString(2, u.getName());
			ps.setString(3, u.getAddress());
			ps.setString(4, u.getEmail());
			ps.setString(5, u.getPhoneNumber());
			ps.setString(6, u.getuName());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("User is not updated!");
			e.printStackTrace();
		}

	}

	public void updateUserRole(User u) {
		sql = "update user_table(user_role) values() where user_id=?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(2, u.getuName());
			ps.setInt(1, u.getRole());
		} catch (SQLException e) {
			System.out.println("Unable to update users role!");
			e.printStackTrace();
		}

	}

	@Override
	public void createNewUser(User u, int role) {
		sql = "insert into user_table(user_name, legal_name, address, "
				+ "email, contact_num,user_role) "
				+ "values(?,?,?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, u.getuName());
			ps.setString(2, u.getName());
			ps.setString(3, u.getAddress());
			ps.setString(4, u.getEmail());
			ps.setString(5, u.getPhoneNumber());
			ps.setInt(6, role);
			ps.execute();
		} catch (SQLException e) {
			System.out.println("Unable to create new user!");
			e.printStackTrace();
		}

	}

	@Override
	public User getUser(User u) {
		sql = "Select * from user_table where user_id=?";
		PreparedStatement ps;
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, u.getUserId());
			ResultSet rs =ps.executeQuery();
			while(rs.next()) {
				u = new User(rs.getInt(1), rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7));


			}

		} catch(SQLException e) {
			System.out.println("Unable to find user by that id");
			e.printStackTrace();
		}
		return u;
	}
	@Override
	public void deleteUser(User u) {
		// delete from registered_user where user_name='test';
		sql = "delete from user_table where user_name=?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, u.getuName());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Unable to delete user!");
			e.printStackTrace();
		}

	}

	/**
	 * 
	 */
	@Override
	public void createLogin(User u) {
		sql = "insert into registered_user values(?,?)";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, u.getuName());
			ps.setInt(2, u.getPassword());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Unable to create login!");
			e.printStackTrace();
		}

	}

	/*
	 * In case of weird role issue the index that should be returned is the role, if
	 * the list is being pop'd by usernames, the index would need adjusting by +1
	 */
	@Override
	public List<String> getRoles(User u) {
		List<String> rList = new ArrayList<>();
		// my connection to the database
		sql = "select my_role from roles where user_name=?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, u.getuName());
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				rList.add(rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rList;
	}

	@Override
	public User userLogin(User u) {
		User ul = null;
		sql = "select * from bank_login(?,?)";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, u.getuName());
			ps.setInt(2, u.getPassword());
			ResultSet rs = ps.executeQuery();

			if (!rs.next()) {
				return null;
			}
			ul = new User(rs.getInt(1), rs.getString(2), rs.getInt(3));
		} catch (SQLException e) {
			System.out.println("Login error! :( ");
			e.printStackTrace();
		}
		if(ul == null) {
			System.out.println("OOPs");
			MenuMethod.displayLoginMenu();
		} 
		return ul;
		
	}

	@Override
	public void updateLogin(User u) {
		sql = "update registered_user values(?,?) where user_name=?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, u.getuName());
			ps.setInt(2, u.getPassword());
			ps.setString(3, u.getuName());
			ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Logins are not updated, bad query.");
			e.printStackTrace();
		}

	}

}
