package com.revature.beans;

public class Album {
	private int AlbumId;
	private String title;
	private int artistId;
	
	public Album() {
		super();
	}
	
	public Album(int albumId, String title, int artistId) {
		super();
		AlbumId = albumId;
		this.title = title;
		this.artistId = artistId;
	}


	public int getAlbumId() {
		return AlbumId;
	}


	public void setAlbumId(int albumId) {
		AlbumId = albumId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getArtistId() {
		return artistId;
	}


	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}


	@Override
	public String toString() {
		return "Album [AlbumId=" + AlbumId + ", title=" + title + ", artistId=" + artistId + "]\n";
	}
	
	
	
}
