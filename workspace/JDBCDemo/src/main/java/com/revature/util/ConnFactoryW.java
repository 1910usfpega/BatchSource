package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnFactoryW {
//singleton factory
//private static instance of self
	private static ConnFactoryW cf = new ConnFactoryW();

	private ConnFactoryW() {
		super();

	}

	public static synchronized ConnFactoryW getInstance() {
		if (cf == null) {
			cf = new ConnFactoryW();
		}
		return cf;

	}

	public Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:postgresql://mypegabatch.cfgmuw0zkwrh.us-east-2.rds.amazonaws.com/postgres";
		String user = "MadScientist626";
		String password = "3eDru-=0FaP8L-tiTh8p";
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("Failed to create connection");
			e.printStackTrace();
		}
		return conn;

	}
}
