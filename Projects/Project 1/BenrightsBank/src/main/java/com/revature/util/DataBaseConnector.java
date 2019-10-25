package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnector {
	//Singleton Factory
	
	//private static instance of itself
	private static DataBaseConnector dbc = new DataBaseConnector();
	
	//private no args constructor
	private DataBaseConnector() {
		super();
	}
	
	//public static syncronized "getter" method
	public static synchronized DataBaseConnector getInstance() {
		if(dbc == null) {
			dbc = new DataBaseConnector();
		}
		return dbc;
	}
	
	//Methods that do stuff
	public Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:postgresql://dbbenright.cviba8ddmknh.us-east-2.rds.amazonaws.com/postgres";
		String user = "benright313";
		String pw = "awsDB313";
		try {
			conn = DriverManager.getConnection(url, user, pw);
		} catch (SQLException e) {
			System.out.println("Failed to create connection!");
			e.printStackTrace();
		}
		return conn;
	}
	
}
