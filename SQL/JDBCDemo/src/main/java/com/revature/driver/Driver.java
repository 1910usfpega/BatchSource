package com.revature.driver;

import java.sql.SQLException;

import com.revature.daoimpl.AlbumDaoImpl;
import com.revature.daoimpl.StudentDaoImpl;

public class Driver {

	public static void main(String[] args) {
		AlbumDaoImpl adi = new AlbumDaoImpl();
		StudentDaoImpl sdi= new StudentDaoImpl();
		try {
			//System.out.println(adi.getAllAlbums());
			//System.out.println(adi.getAlbumsById(22));
			sdi.insertStudent("Ryan pretty", 2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
