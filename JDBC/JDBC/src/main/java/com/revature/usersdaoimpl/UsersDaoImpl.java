//import com.revature.userdao.UsersDao;

//package com.revature.usersdaoimpl;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//
//import com.revature.beans.Users;
//import com.revature.userdao.UsersDao;
//import com.revature.util.ConnFactory;

//public class UsersDaoImpl implements UsersDao {
//public static ConnFactory cf1= ConnFactory.getInstance();
//
//		public static void customerlogin() {
//		Connection conn= cf.getConnection(); 
//		 System.out.println("Hello Valued Customer!");
//		 String user, pass;
//		System.out.println("Enter your username:");
//			user= in.next();
//			System.out.println("Enter your password:");
//			user= in.next();
			
//	public List<Users> getUsersbyusers_username1(String users_username ) throws SQLException {
//		List <Users> UsersList= new ArrayList<Users>();
//		Connection conn= cf1.getConnection();
//		String sql= "select * from \"Users\"where \"users_username\"=?";
//		PreparedStatement ps= conn.prepareStatement(sql);
//		ps.setString(1,users_username);
//		ResultSet rs= ps.executeQuery();
//		Users a= null;
//		while(rs.next()) {
//			a= new Users(rs.getString(1));
//			UsersList.add(a);
//			System.out.println("Welcome Valued Customer!");
//		}
//		return UsersList;
//		
//	}
//	
//
//	
//	
//	
//	
//	
//	public static ConnFactory cf= ConnFactory.getInstance();
//	
//	static Scanner in = new Scanner(System.in);
//	public void insertUsers(String users_username, String users_fname, String users_lname, String users_pword, int users_usertype_id) throws SQLException {
//		Connection conn= cf1.getConnection(); 
//		String sql= "insert into users values(?,?,?,?,?)";
//		PreparedStatement ps = conn.prepareStatement(sql);
//			ps.setString(1, users_username);
//			ps.setString(2, users_fname);
//			ps.setString(3, users_lname);
//			ps.setString(4, users_pword );
//			ps.setInt(5,users_usertype_id );
//			ps.executeUpdate();	
//		 
//			
//		}
//			
//	{
//	}	
//	
//
//
//	
//	public List<Users> getAllUsers() throws SQLException {
//		// TODO Auto-generated method stub
//		return null;
//	
//	}
//
//
//
//
//	@Override
//	public List<Users> getUsersbyusers_username(String users_username) throws SQLException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//
//
//	public char[] getUsersbyusers_username(int i) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}
//
////	public char[] getAllUsers() {
////		// TODO Auto-generated method stub
////		return null;
////	}
////
////	}
////	
//	
//	
//	
////	public List<User> getUserByusertype_id(int usertype_id) throws SQLException {
////		List <User> UsersList= new ArrayList<User>();
////		Connection conn= cf.getConnection();
////		String sql= "select * from \"Users\"where \"usertype_id\"=?";
////		PreparedStatement ps= conn.prepareStatement(sql);
////		ps.setInt(1, usertype_id);
////		ResultSet rs= ps.executeQuery();
////		User a= null;
////		while(rs.next()) {
//			
//		
////		 a= new User(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getInt(5));
////			UsersList.add(a);
////		}
////		return UsersList;
////	}
//
//
//	
////	public List<UsersDao> getAllUsers() throws SQLException {
////		// TODO Auto-generated method stub
////		return null;
////	}
////
////	@Override
////	public List<UsersDao> getUsersByusertype_id(int id) throws SQLException {
////		// TODO Auto-generated method stub
////		return null;
////	}
//
//
//	
//
//
//
//
//
//
//
//
//
//	
//
//
//
//
//
//
//
//
//
////	public List<UsersDao> getUsersByusertype_id(int usertype_id) throws SQLException {
////		// TODO Auto-generated method stub
////		return null;
////	}
////
////}
