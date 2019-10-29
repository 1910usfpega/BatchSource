package com.revature.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnFactory {
	// Singleton Factory
	// private static instance of itself
	private static ConnFactory cf = new ConnFactory();

	// private no-args constructor
	private ConnFactory() {
		super();
	}//End of no-arg constructor

	// public static synchronized "getter" method
	public static synchronized ConnFactory getInstance() {
		if (cf == null) {
			cf = new ConnFactory();
		}
		return cf;
	}//End of synchronized "getter" getInstance

	// Methods that do stuff
	public Connection getConnection() {
		// Declarations for connection variables
		Connection conn = null;
		Properties prop = new Properties();
		File connFile = new File("src/main/resources/database.properties");

		// Try to connect to the server. If fail, check for what broke
		try {
			prop.load(new FileReader(connFile));
			// Using Properties file
			conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"),
					prop.getProperty("password"));
		} catch (SQLException e) {
			System.out.println("Failed to create connection");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}//End of try/catch
		
		return conn;
	}//End of method getConnection

//	public Connection getConnection(String user, String pw) {
//		// Declare connection variables
//		Connection conn = null;
//		Properties prop = new Properties();
//		File connFile = new File("src/main/resources/database.properties");
//
//		// Attempt to connect to database using login input from user
//		try {
//			prop.load(new FileReader(connFile));
//			conn = DriverManager.getConnection(prop.getProperty("url"), user, pw);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			System.out.println("\n\nUser/Password combination does not match our records. Please try again.\n");
//		} // End of try/catch
//
//		return conn;
//	}// End of method getConnection with user input

} // End of Class ConnFactory