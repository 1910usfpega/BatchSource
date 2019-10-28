package com.revature.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnFactory {
	// Singleton Factory
	
	// private static instace of self
	private static ConnFactory cf = new ConnFactory();
	
			
	// private no args constructor
	private ConnFactory() {
		super();
	}
	
	
	// public static synchronized "getter" method
	public static synchronized ConnFactory getInstance () {
		if (cf==null) {
			cf = new ConnFactory();
		}
		return cf;
		
	}
	
	public Connection getConnection() {
		Connection conn = null;
		Properties prop = new Properties();
//		String url ="jdbc:postgresql://pega1019.c7k0tpminidu.us-east-2.rds.amazonaws.com/postgres";
//		String user = "masteruser";
//		String password = "mypassword";
		
		
		try {
			prop.load(new FileReader("database.properties"));
			conn = DriverManager.getConnection(
					prop.getProperty("url"), 
					prop.getProperty("user"), 
					prop.getProperty("password"));
		} catch (SQLException e) {
			System.out.println("Failed to create connection");
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
