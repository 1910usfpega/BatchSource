package com.revature.beans;

public class Album {

	private int albumId;
	private String title;
	private int artistId;
	
	
	public Album(int albumId, String title, int artistId) {
		this.albumId = albumId;
		this.title = title;
		this.artistId = artistId;
	}
	
	public Album() {
	}
	
	
	public int getAlbumId() {
		return albumId;
	}


	public void setAlbumId(int albumId) {
		this.albumId = albumId;
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
		return "Album [Album ID = " + albumId + ", Title = " + title + 
				", Artist ID = " + artistId + "]\n";
	}
	
}
