package com.revature.daoimpl;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.revature.beans.Admin;
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
		
		if (a == null) {
			Properties prop = new Properties();
			try {
				prop.load(new FileReader("database.properties"));
				if (login.equals(prop.getProperty("adminlogin")) && password.equals(prop.getProperty("adminpassword"))) {
					a = new Admin(prop.getProperty("adminlogin"));
					customersList.add(a);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
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

	@Override
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		Connection conn = cf.getConnection();
		String sql = "SELECT * FROM bank_user";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next() ) {
				User user = new User(
						rs.getInt("user_id"), 
						rs.getString("user_name"), 
						rs.getString("user_type"), 
						rs.getString("user_firstname"), 
						rs.getString("user_lastname")
						);
				users.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return users;
	}

	@Override
	public User getUserById(int userId) {
		Connection conn = cf.getConnection();
		String sql = "SELECT * FROM bank_user WHERE user_id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				User customer = new User(
						rs.getInt("user_id"), 
						rs.getString("user_name"), 
						rs.getString("user_type"), 
						rs.getString("user_firstname"), 
						rs.getString("user_lastname")
						);
				return customer;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deleteUserById(int userId) {
		Connection conn = cf.getConnection();
		String sql = "DELETE FROM bank_user WHERE user_id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean usernameExists(String username) {
		boolean result = true;
		Connection conn = cf.getConnection();
		String sql = "SELECT count(user_id) FROM bank_user WHERE user_name = ?;";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int i = rs.getInt(1);
				if (i == 0) {
					System.out.println("NO SUCH USERS");
					result = false;
				} else {
					System.out.println("There is USERS");
					result = true;
				}
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public boolean usernameExists(User user) {
		return usernameExists(user.getUsername());
	}

	@Override
	public void updateUser(int userId, String newUsername, String newFirstName, String newLastName,
			String newUserType) {
		Connection conn = cf.getConnection();
		String sql = "UPDATE bank_user \n" + 
				"SET user_name = ?, user_firstname = ?, user_lastname = ?, user_type=? \n" + 
				"WHERE user_id = ?;";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, newUsername);
			ps.setString(2, newFirstName);
			ps.setString(3, newLastName);
			ps.setString(4, newUserType);
			
			ps.setInt(5, userId);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
