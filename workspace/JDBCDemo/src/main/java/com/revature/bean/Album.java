package com.revature.bean;

public class Album {
private int albumId;
private String title;
private int artistId;
public int getAlbumId() {
	return albumId;
}
public void setAlbumId(int albumId) {
	this.albumId = albumId;
}
public String getTitle() {
	return title;
}
public void setTitle(String artist) {
	this.title = artist;
}
public int getArtistId() {
	return artistId;
}
public void setArtistId(int artistId) {
	this.artistId = artistId;
}
public Album(int albumId, String artist, int artistId) {
	super();
	this.albumId = albumId;
	this.title = artist;
	this.artistId = artistId;
}
public Album() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "\n Album\n albumId = " + albumId + "\t title = " + title + "\t artistId = " + artistId;
}


}
