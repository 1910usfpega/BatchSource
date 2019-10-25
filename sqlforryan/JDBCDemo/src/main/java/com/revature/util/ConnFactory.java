package com.revature.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnFactory {
//singleton Factory
	//private static instance of self
	private static ConnFactory cf = new ConnFactory();
	//private no args constructor
	private ConnFactory() {
		super();
	}
	//public static sychronized " getter" method;
	public static synchronized ConnFactory getInstance() {
		if(cf==null) {
			cf = new ConnFactory();
		}
		return cf;
	}
	
//	method that do stuff
	public Connection getConnection() {
		Connection conn = null;
		
//		  String url=
//		  "jdbc:postgresql://grantdb22.cvy92ehtyzzn.us-east-2.rds.amazonaws.com/postgres";
//		   String user ="grantDB22"; 
//		    String password ="Grant092291.";
		 		Properties prop = new Properties();
		
		try {
			prop.load(new FileReader("database.properties"));
//		conn=DriverManager.getConnection(url,user,password);
			conn=DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("user"),prop.getProperty("password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("failed to create connection");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
}
