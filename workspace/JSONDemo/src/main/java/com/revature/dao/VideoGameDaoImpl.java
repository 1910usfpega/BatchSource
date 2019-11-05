package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.bean.VideoGame;
import com.revature.util.ConnFactory;

public class VideoGameDaoImpl {
	public static ConnFactory why=ConnFactory.getInstance();
	
	//get specific vid game
	public VideoGame getVGbyID(int id) throws SQLException{
		VideoGame vg=null;
		String sql = "select * from public.videogame where vgid=?";
		Connection conn = why.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			vg = new VideoGame(rs.getInt(1), rs.getString(2),rs.getInt(3));
		}
		return vg;
	}
	//insert row
	public void instertVG(VideoGame vg)throws SQLException{
		String sql = "insert into public.videogame values(?,?,?)";
		Connection conn = why.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, vg.getVgID());
		ps.setString(2, vg.getVgName());
		ps.setInt(3, vg.getVgMetaScore());
		ps.executeUpdate();
	}
}
