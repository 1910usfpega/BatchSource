package com.revature.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnFactory {
	private static ConnFactory cf = new ConnFactory();
	
	private ConnFactory() {
		super();
	}
	
	public static synchronized ConnFactory getInstance() {
		if (cf==null) {
			cf= new ConnFactory();
		}
		return cf;
	
	}

	public Connection getConnection() {
		Connection conn= null;
		Properties pro=new Properties();
		try {
			pro.load(new FileReader("Database.properties"));
			conn=DriverManager.getConnection(pro.getProperty("url"),pro.getProperty("username"),pro.getProperty("password"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;
		


}
}