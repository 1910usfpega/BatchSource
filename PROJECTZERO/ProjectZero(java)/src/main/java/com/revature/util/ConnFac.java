package com.revature.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnFac {
	//Singleton Factory
	//private static instance of self
	private static ConnFac cf= new ConnFac();
	//private no args constructor
	private ConnFac() {
		super();
	}
	//public static synchronized getter method
	public static synchronized ConnFac getInstance() {
		if(cf == null) {
			cf = new ConnFac();
		}
		return cf;
	}
	
	//methods that 'do the things'
	public Connection getConnection() {
		Connection conn = null;
//		String url = "jdbc:postgresql://battlem2072.c8h37embw41w.us-east-2.rds.amazonaws.com/battlem2072";
//		String username = "mariobattle";
//		String password = "1qaz2wsx3edc";
		Properties prop = new Properties();
		
		try {
			prop.load(new FileReader("src/main/resources/database.properties"));
			conn= DriverManager.getConnection(prop.getProperty("url"),
					prop.getProperty("user"), prop.getProperty("password"));
//			conn= DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			System.out.println("Failed to create connection");
			// TODO Auto-generated catch block
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
