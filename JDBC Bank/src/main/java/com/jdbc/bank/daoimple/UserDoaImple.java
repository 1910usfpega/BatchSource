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
						
//			ResultSet rs = stmt.executeQuery("select * from People")


		
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
			con = cf.getConnection();
			//prepare a statement//buffer a statement
			sql = "update people set user_id=?, user_uname=?, user_full_name=?,"
					+ " user_email=?, user_address=?, user_phone_number=?"
					+ "where user_id=?";	
			
			
			ps = con.prepareStatement(sql);
			
			ps.setString(1, user.getUName());
			ps.setString(2, user.getFulltName());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getAddress());
			ps.setString(5, user.getPhoneNumber());
			ps.executeUpdate();			
		}

		@Override
		public void createUser(User user) throws SQLException {
			con = cf.getConnection();
			//prepare a statement//buffer a statement
			sql = "insert into people(user_id, user_uname, user_full_name, user_email, user_address, user_phone_number) values(101, ?, ? ,?, ?, ?)";	
			
			
			ps = con.prepareStatement(sql);
			
			ps.setString(1, user.getUName());
			ps.setString(2, user.getFulltName());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getAddress());
			ps.setString(5, user.getPhoneNumber());
			ps.executeUpdate();
		}

		@Override
		public void deleteUser(User user) throws SQLException {
			con = cf.getConnection();
			//prepare a statement//buffer a statement
			sql = "delete from people where user_uname = ? ";		
			ps = con.prepareStatement(sql);
			
			ps.setString(1, user.getUName());
			ps.setString(2, user.getFulltName());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getAddress());
			ps.setString(5, user.getPhoneNumber());
			ps.executeUpdate();
		}


		@Override
		public User UserLogin(User user) throws SQLException {
			con = cf.getConnection();
			sql = "Insert into login(user_name, user_password) values(?,?)";
			ps = con.prepareStatement(sql);
			return null;
		}
}
