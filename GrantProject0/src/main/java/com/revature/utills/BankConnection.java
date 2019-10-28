package com.revature.utills;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class BankConnection {

		//Singleton Factory
		//private static instance of self
		private static BankConnection cf = new BankConnection();
		//private no args constructor
		private BankConnection() {
			super();
		}
		//public static synchronized"getter" method
		public static synchronized BankConnection getInstance() {
			if(cf==null) {
				cf= new BankConnection();
			}
			return cf;
		}
		//Methods that do stuff
		public Connection getConnection() {
			Connection conn = null;
//			String url= "jdbc:postgresql://grantdb22.cvy92ehtyzzn.us-east-2.rds.amazonaws.com/postgres";
//			String user ="grantDB22";
//			String password ="Grant092291.";
			Properties prop = new Properties();
			try {
				try {
					prop.load(new FileReader("database.properties"));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	//conn=DriverManager.getConnection(url,user,password);
					conn=DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("user"),prop.getProperty("password"));
			} catch (SQLException e) {
				System.out.println("Failed to create connection");
				e.printStackTrace();
			}

			return conn;

		}

	}
	
	
	
	

