package com.revature.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Customer;
import com.revature.dao.CustomerDao;
import com.revature.util.ConnFactory;

public class CustomerDaoImpl implements CustomerDao {
	// Get database connection object
	ConnFactory cf = ConnFactory.getInstance();

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		// Declarations for connection and query
		List<Customer> customerList = new ArrayList<Customer>();
		Connection conn = cf.getConnection();
		String sql = "Select * from \"MakinBank\".customer";

		// Generate query and return data from the database
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		Customer c = null;
		while (rs.next()) {
			// Populate list with data from all customers in database
			c = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			customerList.add(c);
		}
		return customerList;
	}// End of method getAllCustomers

	@Override
	public List<Customer> getCustomerById(int n) throws SQLException {
		// Declarations for connection and query
		List<Customer> customerList = new ArrayList<Customer>();
		Connection conn = cf.getConnection();
		String sql = "Select * from \"MakinBank\".customer where customer = ?";

		// Generate query and return data from the database
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, n);
		ResultSet rs = ps.executeQuery();
		Customer c = null;
		while (rs.next()) {
			// Populate list with data from all customers in database
			c = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			customerList.add(c);
		}
		return customerList;
	}// End of method getCustomerById

	@Override
	public Customer getCustomerByUser(String user) throws SQLException {
		// Declarations for connection and query
		Connection conn = cf.getConnection();
		String sql = "Select * from \"MakinBank\".customer where customer_user = ?";

		// Generate query and return data from the database
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, user);
		ResultSet rs = ps.executeQuery();
		Customer c = null;
		while (rs.next()) {
			// Populate list with data from all customers in database
			c = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
		}
		return c;
	}// End of method getCustomerByUser

	@Override
	public Customer insertCustomerByUser(String user, String pw, String fName, String lName) throws SQLException {
		// Declaration for connection and query
		Connection conn = cf.getConnection();
		String sql = "select \"MakinBank\".createcustomer(?, ?, ?, ?)";

		// Generate query and insert data into database
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, user);
		ps.setString(2, pw);
		ps.setString(3, fName);
		ps.setString(4, lName);
		ps.execute();
		ps = conn.prepareStatement("commit");
		ps.execute();

		// Return the user's information from the database
		sql = "select from \"MakinBank\".customer where customer_user = ?";
		ps = conn.prepareStatement(sql);
		ps.setString(1, user);
		ResultSet rs = ps.executeQuery();
		Customer c = new Customer();
		// populate the user object with returned data
		while (rs.next()) {
			c = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
		}
		return c;
	}// End of method insertCustomerByUser

	@Override
	public Customer login(String user, String password) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "select * from \"MakinBank\".customer where customer_user = ? AND customer_pw = ?";
		PreparedStatement ps = conn.prepareStatement(sql);

		//user = "'" + user + "'";
		//password = "'" + password + "'";
		ps.setString(1, user);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		Customer c = null;
		while (rs.next()) {
			c = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
		}
		return c;
	}// End of method login

}// End of Class CustomerDaoImpl