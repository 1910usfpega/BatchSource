package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.bean.VideoGame;
import com.revature.util.ConnFactory;

public class VGDaoImpl {
public static ConnFactory conn = ConnFactory.getInstance();

public VideoGame getVGbyID(int id) throws SQLException {
	VideoGame vg=null;
	Connection c= conn.getConnection();
	Statement stmt= c.createStatement();
	ResultSet rs=stmt.executeQuery("select * from videogame where vgid= "+id);
	while(rs.next()) {
		vg=new VideoGame(rs.getInt(1),rs.getString(2),rs.getInt(3));
	}
	return vg;
}
public void insertVG(VideoGame vg) throws SQLException{
	String sql="insert into videogame values(?,?,?)";
	Connection c=conn.getConnection();
	PreparedStatement ps=c.prepareStatement(sql);
	ps.setInt(1,vg.getVgID());
	ps.setString(2, vg.getVgName());
	ps.setInt(3,vg.getVgMetaScore());
	ps.executeUpdate();
}

}
