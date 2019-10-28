package com.revature.driver;

import java.sql.SQLException;

import com.revature.daoimpl.FTDaoImpl;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AlbumDaoimpl adi = new AlbumDaoimpl();
//		try {
//			List<Album> allAlbums = adi.getAlbumsById(22);
//			
//			for (Album album:allAlbums) {
//				System.out.println(album.getTitle());
//			}
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		StudentDaoImpl sdi = new StudentDaoImpl();
//		try {
//			sdi.insertStudent("dd", 12);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		FTDaoImpl ftdi = new FTDaoImpl();
		try {
			System.out.println(ftdi.testFun());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
