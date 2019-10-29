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
import com.revature.bean.Person;
import com.revature.bean.BankAccount;
import com.revature.bean.Admin;


import com.revature.dao.AllDaos;
import com.revature.util.ConnFactory;

public class PersonDaoImpl implements AllDaos{
	public static ConnFactory cf = ConnFactory.getInstance();
	
	public void insertPerson(String first, String last, String username, String password) throws SQLException{
		Connection conn = cf.getConnection();
		String sql = "Insert into Person values(nextval (\'seq\'),?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,  first);
		ps.setString(2,  last);
		ps.setString(3, username);
		ps.setString(4, password);
		ps.executeUpdate();
	}
	
	public void deletePerson(String first, String last, String username) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = cf.getConnection();
		String sql = "delete from Person where first_name = ? and last_name = ? and username = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, first);
		ps.setString(2, last);
		ps.setString(3, username);
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