package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Album;

public interface AlbumDao {
//CRUD OPS
	
	public List<Album>getAlbumsById(int id)throws SQLException;
	public List<Album>getAllAlbums()throws SQLException;
}
