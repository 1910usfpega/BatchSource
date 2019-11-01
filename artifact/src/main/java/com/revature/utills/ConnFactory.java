package com.revature.utills;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;


public class ConnFactory {

	//singleton Factory
		//private static instance of self
		private static ConnFactory cf = new ConnFactory();
		//private no args constructor
		private ConnFactory() {
			super();
		}
		//public static sychronized " getter" method;
		public static synchronized ConnFactory getInstance() {
			if(cf==null) {
				cf = new ConnFactory();
			}
			return cf;
		}
		
		public Connection getConnection() {
			Connection conn = null;
			Properties prop = new Properties();
			
			try {
				prop.load(new FileReader("database.properties"));
				conn=DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("user"),prop.getProperty("password"));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("failed to create connection");
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