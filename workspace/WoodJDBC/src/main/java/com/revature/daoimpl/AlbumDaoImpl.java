package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.bean.Album;
import com.revature.dao.AlbumDao;
import com.revature.util.ConnFactoryW;

public class AlbumDaoImpl implements AlbumDao {
	public static ConnFactoryW cf = ConnFactoryW.getInstance();

	@Override
	public List<Album> getAllAlbums() throws SQLException {

		List<Album> albumList = new ArrayList<Album>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from album order by title;");
		Album a=null;
		while(rs.next()) {
			a=new Album(rs.getInt(1),rs.getString(2),rs.getInt(3));
			albumList.add(a);
		}
//		Collections.sort(albumList,(arg0,arg1)
//				->{
//					return arg0.getArtist().compareTo(arg1.getArtist()
//							);}
//				);
		return albumList;
	}

	@Override
	public List<Album> getAlbumsById(int i) throws SQLException {
		List<Album> albumList = new ArrayList<Album>();
		Connection conn = cf.getConnection();
		String sql="select * from album where artistId = ?";
		PreparedStatement ps =  conn.prepareStatement(sql);
		//not necessarily bad... so long as i has been sanitized first
//		ResultSet rs = stmt.executeQuery("select * from album where artistId="+i);
		//bad!!!!!! so very bad!!!!!! NEVER DO!!!! EVER!!!!! FIRE ANYONE THAT SAYS OTHERWISE!!!!!!
		ps.setInt(1, i);
		ResultSet rs = ps.executeQuery();
		
		
		Album a=null;
		while(rs.next()) {
			a=new Album(rs.getInt(1),rs.getString(2),rs.getInt(3));
			albumList.add(a);
		}
//		Collections.sort(albumList,(arg0,arg1)
//				->{
//					return arg0.getArtist().compareTo(arg1.getArtist()
//							);}
//				);
		return albumList;
	}

}
