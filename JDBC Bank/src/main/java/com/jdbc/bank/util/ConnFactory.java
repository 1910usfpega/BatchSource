package com.jdbc.bank.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnFactory {
	private static ConnFactory cf = new ConnFactory()	;
	//private constructor 
	private ConnFactory() {
		super();
	}
	//public static sync getter method
	//this provides an exclusive access to shared resources.
	public static synchronized ConnFactory getInstance() {
		if (cf == null) {
			cf = new ConnFactory();
		}
		return cf;
	}
	//Methods that tell what our factory will be doing)
	public Connection getConnection() {
		Connection conn = null;
		//what we did Friday week three
		Properties prop = new Properties();
		
		//String url = "jdbc:postgresql://postgres.cdhpzvpdpted.us-east-2.rds.amazonaws.com/postgres";
//																						^^^^^^^^^^^ make sure to add this...somtning that is different from oracle
	//	String user = "devazn";
		//String password = "revdevazn";
		try {
			prop.load(new FileReader("database.properties"));
			conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"), prop.getProperty("password"));
		}catch (SQLException e) {
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