package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnFactory {
	private static ConnFactory cf= new ConnFactory();
	private ConnFactory() {	
	}
	public static synchronized ConnFactory getinstance() {
		if(cf==null) {
			cf=new ConnFactory();
		}
		return cf;
	}
	public Connection getConnection() {
		Connection conn= null;
		String url ="jdbc:postgresql://pega1019.ccjzasyyhpja.us-east-2.rds.amazonaws.com:5432/postgres";
		String user="mrkitten";
		String password="rolltideroll";
		try {
			conn=DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
