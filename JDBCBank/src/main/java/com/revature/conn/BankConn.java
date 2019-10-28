package com.revature.conn;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class BankConn {

	private static BankConn cb = new BankConn();
	private BankConn() {
		super();
	}
	//public static synchnronized "getter" method
	public static synchronized BankConn getInstance() {
			if (cb==null) {
				cb = new BankConn();
			}
			return cb;
	}
	
	public Connection getConnection() {
		Connection conn = null;
		Properties prop = new Properties();
		
		
		try {
			prop.load(new FileReader("admin.properties"));
			conn=DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"), prop.getProperty("password"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Failed to create connection");
			e.printStackTrace();
		}
		return conn;
		
	}
	
	
}
