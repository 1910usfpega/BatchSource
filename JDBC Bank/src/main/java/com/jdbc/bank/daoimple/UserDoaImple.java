package com.jdbc.bank.daoimple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.jdbc.bank.bean.User;
import com.jdbc.bank.dao.UserDao;
import com.jdbc.bank.util.ConnFactory;

public class UserDoaImple implements UserDao {
		public static ConnFactory cf = ConnFactory.getInstance();

//		@Override
//		public List<User> getAllAlbums(int id) throws SQLException {
//			List<User> albumList = new ArrayList<User>();
//			Connection conn = cf.getConnection();
//			String sql = "select * from \"Album\" where ?";
//			PreparedStatement ps = conn.prepareStatement(sql);
////			^^^^Is like a sending someting in a envelope and putting a lock on it to prevent tampering
//			ps.setInt(1, id);
////				ResultSet rs = stmt.executeQuery("select * from \"Album\" where \"ArtistId\" = " + id);
//			ResultSet rs = ps.executeQuery("select * from \"Album\" where ?");
////			stmt.set
//			User a = null;
//				while (rs.next()) {
//					a = new User(rs.getInt(1),rs.getString(2),rs.getInt(3));
//					albumList.add(a);
//				}	//return our AlbumList
//				return albumList;
//		}

		public static void userCreation(String uName, String pw) throws SQLException {
			ConnFactory connect = ConnFactory.getInstance();
			//connected to the DB
			Connection c = connect.getConnection();
			//prepare a statment//buffer a statement
			String sql = "insert into people values(nextval(\'user_id_seq\'), ?, ?, ? ,?, ?, ?, ?)";	
			PreparedStatement ps = c.prepareStatement(sql);
			
		}
		
		
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
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteUser(User user) throws SQLException {
			// TODO Auto-generated method stub
			
		}
}
