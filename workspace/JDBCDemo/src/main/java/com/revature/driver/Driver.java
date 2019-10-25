package com.revature.driver;

import java.sql.SQLException;

import com.revature.daoimpl.AlbumDaoImpl;
import com.revature.daoimpl.FTDaoImpl;

public class Driver {

	public static void main(String[] args) {
		AlbumDaoImpl adi = new AlbumDaoImpl();
		FTDaoImpl ftdi=new FTDaoImpl();
		try {
			System.out.println(ftdi.testFun());
		} catch (SQLException e) {
			System.out.println("DB not found!");
			e.printStackTrace();
		}

	}

}
