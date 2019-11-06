package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.util.ConnFactory;

public class StudentDaoImpl {
	public static ConnFactory cf =ConnFactory.getInstance();
	
	public void insertStudent(String name, int sch_id) throws SQLException{
		Connection conn= cf.getConnection();
		String sql= "insert into student values(nextval (\'stuseq\'),?,?)";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1, name);
		ps.setInt(2, sch_id);
		ps.executeUpdate();
	}
}
