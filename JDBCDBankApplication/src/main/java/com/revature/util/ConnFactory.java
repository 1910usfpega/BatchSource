package com.revature.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnFactory {

	// private static instance of self
	private static ConnFactory cf = new ConnFactory();

	// private constructor
	private ConnFactory() {
		super();
	}

	// public static synchronized "getter" method
	// synchronized means only one thread can see or run at a time
	public static synchronized ConnFactory getInstance() {
		if (cf == null) {
			cf = new ConnFactory();
		}
		return cf;
	}

	// Methods that do stuff
	public Connection getConnection() {
		Connection conn = null;
		Properties prop = new Properties();
		try {
			prop.load(new FileReader("database.properties"));
			conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"),
					prop.getProperty("password"));
		} catch (SQLException e) {
			System.out.println("Failed to create connection");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
