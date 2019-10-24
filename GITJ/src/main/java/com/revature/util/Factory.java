package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Factory {
private static Factory cf = new Factory();
	
	private Factory() {
		super();
	}
	
	public static synchronized Factory getInstance() {
		if(cf == null)
			cf = new Factory();
		return cf;
	}
	
	public Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:postgresql://pega1019.c28ouclazdez.us-east-2.rds.amazonaws.com/postgres";
		String user = "twoan92";
		String password = "k3squishy";
		try {
			conn=DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			System.out.println("Failed to connect.");
			e.printStackTrace();
		}
		return conn;
	}
}
