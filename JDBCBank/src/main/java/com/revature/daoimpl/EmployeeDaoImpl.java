package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.bean.Customer;
import com.revature.bean.Employee;
import com.revature.bean.BankAccount;
import com.revature.bean.Admin;


import com.revature.dao.AllDaos;
import com.revature.util.ConnFactory;

public class EmployeeDaoImpl implements AllDaos{
	public static ConnFactory cf = ConnFactory.getInstance();
	
	public void insertEmployee(String first, String last, String username, String password) throws SQLException{
		Connection conn = cf.getConnection();
		String sql = "Insert into Customer values(nextval (\'seq\'),?,?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,  first);
		ps.setString(2,  last);
		ps.setString(3, username);
		ps.setString(4, password);
		ps.executeUpdate();
	}

	public List<Employee> getAllCustomers1() throws SQLException {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from \"Employees\" ");
		Employee a = null;
		while(rs.next()) {
			a = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			employees.add(a);
		}
		return employees;
	}

	public List<BankAccount> getAllAccounts() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<BankAccount> getMyAccounts(Customer c) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Customer> getAllCustomers() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> getAllEmployees() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Admin> getAllAdmin() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}