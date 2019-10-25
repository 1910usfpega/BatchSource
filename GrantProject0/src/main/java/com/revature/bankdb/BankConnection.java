package com.revature.bankdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
			String url= "jdbc:postgresql://grantdb22.cvy92ehtyzzn.us-east-2.rds.amazonaws.com/postgres";
			String user ="grantDB22";
			String password ="Grant092291.";
			try {
				conn=DriverManager.getConnection(url,user,password);
			} catch (SQLException e) {
				System.out.println("Failed to create connection");
				e.printStackTrace();
			}

			return conn;

		}

	}
	
	
	
	

