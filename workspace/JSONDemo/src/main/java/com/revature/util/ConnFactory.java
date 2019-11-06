package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnFactory {
	private static ConnFactory cf= new ConnFactory();
	private static final String url="jdbc:postgresql://mypegabatch.cfgmuw0zkwrh.us-east-2.rds.amazonaws.com/postgres";
	private static final String user="MadScientist626";
	private static final String password="3eDru-=0FaP8L-tiTh8p";
	private ConnFactory() {
		super();
	}
	public static synchronized ConnFactory getInstance() {
		if(cf==null) {
			cf= new ConnFactory();
		}
		return cf;
	}
	public Connection getConnection() {
		Connection conn=null;
		try {
			Class.forName("org.postgresql.Driver");
			conn= DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
}
