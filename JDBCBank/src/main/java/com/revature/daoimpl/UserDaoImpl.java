package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Customer;
import com.revature.beans.Employee;
import com.revature.beans.User;
import com.revature.dao.UsersDao;
import com.revature.exceptions.UsernameAlreadyExistsException;
import com.revature.util.ConnFactory;

public class UserDaoImpl implements UsersDao{
	public static ConnFactory cf = ConnFactory.getInstance();

	@Override
	public List<User> getUserByLoginAndPass(String login, String password) throws SQLException {
		List<User> customersList = new ArrayList<User>();
		Connection conn = cf.getConnection();
		
		String sql = "SELECT * "
				+ "FROM bank_user "
				+ "WHERE user_name = ? "
				+ "AND user_password = crypt(?, user_password);";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, login.toLowerCase());
		ps.setString(2, password);
		
		ResultSet rs = ps.executeQuery();
		User a = null;
		
		while (rs.next() ) {
			if (rs.getString("user_type").equals("customer")) {
				a = new Customer(
						rs.getInt("user_id"), 
						rs.getString("user_name"), 
						rs.getString("user_type"), 
						rs.getString("user_firstname"), 
						rs.getString("user_lastname"), 
						rs.getBoolean("user_status")
						);
			} else if (rs.getString("user_type").equals("employee")) {
				a = new Employee(rs.getInt("user_id"), 
						rs.getString("user_name"), 
						rs.getString("user_type"), 
						rs.getString("user_firstname"), 
						rs.getString("user_lastname")
						);
			} else {
				a = new User(rs.getInt("user_id"), rs.getString("user_name"), rs.getString("user_type"), rs.getString("user_firstname"), rs.getString("user_lastname"));
			}
			
			customersList.add(a);
		}
		
		return customersList;
	}

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<Customer>();
		Connection conn = cf.getConnection();
		String sql = "SELECT * FROM bank_user WHERE user_type='customer'";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next() ) {
				Customer customer = new Customer(
						rs.getInt("user_id"), 
						rs.getString("user_name"), 
						rs.getString("user_type"), 
						rs.getString("user_firstname"), 
						rs.getString("user_lastname"), 
						rs.getBoolean("user_status")
						);
				customers.add(customer);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return customers;
	}

	@Override
	public Customer createNewCustomer(String username, String password, String firstName, String lastName ) throws UsernameAlreadyExistsException {
		Connection conn = cf.getConnection();
		String sql = "SELECT * FROM create_new_user(?, ?, ?, ?);";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, firstName);
			ps.setString(4, lastName);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int newCustomerId =rs.getInt(1);
				if (newCustomerId==0) {
					throw new UsernameAlreadyExistsException("Username already exists");
				} else {
					String sql2 = "SELECT * FROM bank_user WHERE user_id=?;";
					PreparedStatement ps2 = conn.prepareStatement(sql2);
					ps2.setInt(1, newCustomerId);
					ResultSet rs2 = ps2.executeQuery();
					while (rs2.next()) {
						Customer customer = new Customer(
								rs2.getInt("user_id"), 
								rs2.getString("user_name"), 
								rs2.getString("user_type"), 
								rs2.getString("user_firstname"), 
								rs2.getString("user_lastname"), 
								rs2.getBoolean("user_status")
								);
						return customer;
					}
					
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

}
