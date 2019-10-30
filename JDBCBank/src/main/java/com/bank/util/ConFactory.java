package com.bank.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConFactory {
	
	//singleton Factory connection object
	//private static instance of self
	//we are instantiating the interface CeonFactory
	private static ConFactory cf = new ConFactory();
	//private no args constructor
	private ConFactory() {
		super();
	}
	//public static synchroized"getter"method, Thread Safe-means only one thread can access because we are in a singleton factory, we create only one object
	public static synchronized ConFactory getInstance() {
		if (cf==null) {
			cf= new ConFactory();
		}
		return cf;
		}
	//method that do stuff
	public Connection getConnection() {
		Connection conn = null;
		// we are adding the file database.properties
		Properties prop = new Properties();
		try {
			prop.load(new FileReader("database.properties"));
//			//line for database.properties
			conn=DriverManager.getConnection(prop.getProperty("url"),
											prop.getProperty("user"),
											prop.getProperty("password"));
		   
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Failed to create connectionj");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
//			// TODO Auto-generated catch block
			e.printStackTrace();
//		}
	}
		return conn;
}
}



	