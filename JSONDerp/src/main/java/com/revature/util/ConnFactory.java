package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnFactory {
	private static ConnFactory cf= new ConnFactory();
	private ConnFactory() {	
	}
	public static synchronized ConnFactory getInstance() {
		if(cf==null) {
			cf=new ConnFactory();
		}
		return cf;
	}
	public Connection getConnection() {
		Connection conn= null;
		String url = "jdbc:postgresql://battlem2072.c8h37embw41w.us-east-2.rds.amazonaws.com/postgres";
		String username = "mariobattle";
		String password = "1qaz2wsx3edc";		try {
			conn=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
