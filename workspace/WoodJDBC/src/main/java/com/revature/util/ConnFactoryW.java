package com.revature.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnFactoryW {
//singleton factory
//private static instance of self
	private static ConnFactoryW cf = new ConnFactoryW();

	private ConnFactoryW() {
		super();

	}

	public static synchronized ConnFactoryW getInstance() {
		if (cf == null) {
			cf = new ConnFactoryW();
		}
		return cf;

	}

	public Connection getConnection() {
		Connection conn = null;
		Properties prop = new Properties();
		try {
			prop.load(new FileReader("src/main/resources/database.properties"));
			conn = DriverManager.getConnection(prop.getProperty("url"),
					prop.getProperty("user"), prop.getProperty("secret"));
		} catch (SQLException e) {
			System.out.println("Failed to create connection");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not Found");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Oops bad IO");
			e.printStackTrace();
		}
		return conn;

	}
}
