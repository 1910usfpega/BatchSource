package com.revature.driver;

import java.sql.SQLException;

import com.revature.daoimpl.AlbumDaoImpl;

public class Driver {

	public static void main(String[] args) {
		AlbumDaoImpl adi = new AlbumDaoImpl();
		try {
			System.out.println(adi.getAlbumsById(22));
		} catch (SQLException e) {
			System.out.println("DB not found!");
			e.printStackTrace();
		}

	}

}
