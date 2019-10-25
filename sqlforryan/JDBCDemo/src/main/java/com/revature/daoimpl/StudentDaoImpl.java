package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.util.ConnFactory;

public class StudentDaoImpl {

	
	public static ConnFactory cf = ConnFactory.getInstance();
	
	public void insertStudent(String name ,int sch_id)throws SQLException {
		Connection conn = cf.getConnection();
		String sql="Insert into Student values(nextval ('stuseq'),?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,name);
		ps.setInt(2,sch_id);
		ps.executeUpdate();
	}

	
	
	
	
//	@Override
//	public List<Album> get() throws SQLException {
//		List<Album>albumList = new ArrayList<Album>();
//		Connection conn = cf.getConnection();
//		Statement stmt= conn.createStatement();
//		ResultSet rs = stmt.executeQuery("select * from \"Album\"");
//		Album a =null;
//		//iterate it
//		while(rs.next()) {
//			a = new Album(rs.getInt(1),rs.getString(2),rs.getInt(3));
//			albumList.add(a);
//		}
//		
//		return albumList;
//	}
}
