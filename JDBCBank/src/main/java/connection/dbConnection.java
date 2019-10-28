package connection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class dbConnection {
	
	private static dbConnection connection = new dbConnection();

	private dbConnection() {
		super();
	}

	public static synchronized dbConnection getInstance() {
		if (connection == null)
			connection = new dbConnection();
		return connection;
	}

	public Connection getConnection() {
		Connection connect = null;
		Properties prop = new Properties();
		try {
			prop.load(new FileReader("database.properties"));
			connect = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"), prop.getProperty("password"));
		} catch (SQLException e) {
			System.out.println("Failed to connect.");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connect;
	}
}
