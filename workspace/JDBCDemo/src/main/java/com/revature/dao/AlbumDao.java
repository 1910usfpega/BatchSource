package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.bean.Album;

public interface AlbumDao {
public List<Album> getAllAlbums() throws SQLException;
public List<Album> getAlbumsById(int i) throws SQLException;
}
