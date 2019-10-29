import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

class JDBC_Tests {

	@Test
	void testConnection() {
		Connection conn = null;
		String url = "jdbc:postgresql://pega1019.c8l2ahirenhx.us-east-2.rds.amazonaws.com/postgres";
		String username = "Techguy0711";
		String password = "Kristhian0711";
		
		try {
			conn = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
		fail("Failed to create connection");
			e.printStackTrace();
		}
	}

}
