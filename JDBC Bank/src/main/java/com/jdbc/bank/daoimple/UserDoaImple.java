package com.jdbc.bank.daoimple;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.jdbc.bank.bean.User;
import com.jdbc.bank.dao.UserDao;
import com.jdbc.bank.util.ConnFactory;

public class UserDoaImple implements UserDao {
		public static ConnFactory cf = ConnFactory.getInstance();
		public static String sql;
		public static Connection con = cf.getConnection();
		public static PreparedStatement ps;
	

	public void createsUser(User user) throws SQLException {
			int userType;
			
			//ConnFactory connect = ConnFactory.getInstance();
			//controls the connection to the database
			
			Connection con = cf.getConnection();
			//prepare a statment//buffer a statement
			String sql = "insert into people(user_id, user_uname, user_full_name, user_email, user_address, user_phone_number) values(101, ?, ? ,?, ?, ?)";	
			
			
			//ps = con.prepareStatement(sql);
///		ps.setInt(1, user.getUserID());
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, user.getUName());
			ps.setString(2, user.getFulltName());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getAddress());
			ps.setString(5, user.getPhoneNumber());
			ps.executeUpdate();
			//not returning anything so no result set
//			ResultSet rs = stmt.executeQuery("select * from People")
	}

		
	//creating a method that will create a connection to the User table
	//through the AWS server. by sending a String in the SQL language the data
	//enabling to request and receive the database information
		@Override
		public ArrayList<User> getAllUsers() throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void reviseUsers(User user) throws SQLException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void createUser(User user) throws SQLException {
			
		}

		@Override
		public void deleteUser(User user) throws SQLException {
			// TODO Auto-generated method stub
			
		}


		@Override
		public User UserLogin(User user) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
}
