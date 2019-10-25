package com.revature.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBConnector {
	//Singleton Factory
	
	//private static instance of itself
	private static JDBConnector jdbc = new JDBConnector();
	
	//private no args constructor
	private JDBConnector() {
		super();
	}
	
	public static synchronized JDBConnector getInstance() {
		if(jdbc == null) {
			jdbc = new JDBConnector();
		}
		return jdbc;
	}
	
	//Methods that do stuff
	public Connection getConnection() {
		Connection conn = null;
		Properties prop = new Properties();
		try {
			prop.load(new FileReader("database.properties"));
			conn = DriverManager.getConnection(prop.getProperty("url"),
					prop.getProperty("user"), prop.getProperty("pw"));
		} catch (SQLException e) {
			System.out.println("Failed to create connection!");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
}