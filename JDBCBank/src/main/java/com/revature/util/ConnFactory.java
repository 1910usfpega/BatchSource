package com.revature.util;

import java.beans.Statement;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.DriverManager;


public class ConnFactory {
	// Singleton factory
	// private static instance of self
	private static ConnFactory cf = new ConnFactory();
	// private no args constructor
	private ConnFactory() {
		super();
	}
	// public static synchronized "getter" method
	public static synchronized ConnFactory getInstance() {
		// synchronized => only one thread can use it
		if(cf == null) {
			cf = new ConnFactory();
		}
		return cf;
	}
	// Methods do stuff
	public Connection getConnection(){
		Connection conn = null;
		Properties prop = new Properties();
		/*String url = "pega1910.cglalinpelnc.us-east-2.rds.amazonaws.com";
		String user = "mccarters";
		String password = "Wf0Tm5Rz3";
		*/
	//	java.sql.Statement stmt = conn.createStatement();
		try {
			prop.load(new FileReader("database.properties"));
			conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"), prop.getProperty("password"));
			// conn = DriverManager.getConnection(url, user, password);
		}
		catch(SQLException e) {
			System.out.println("Failed to create connection");
			e.printStackTrace();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return conn;
		
	}
}