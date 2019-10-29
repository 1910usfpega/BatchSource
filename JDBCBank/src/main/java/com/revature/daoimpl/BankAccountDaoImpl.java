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

public class BankAccountDaoImpl implements AllDaos{
	public static ConnFactory cf = ConnFactory.getInstance();
	
	public void insertBankAccount(String first, String last, double balance, int owner_id) throws SQLException{
		Connection conn = cf.getConnection();
		String sql = "Insert into BankAccount values(nextval (\'seq\') default,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,  first);
		ps.setString(2,  last);
		ps.setDouble(3, balance);
		ps.setInt(4, owner_id);
		ps.executeUpdate();
	}

	public List<BankAccount> getAllBankAccounts() throws SQLException {
		// TODO Auto-generated method stub
		List<BankAccount> bankaccounts = new ArrayList<BankAccount>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from \"BankAccount\" ");
		BankAccount a = null;
		while(rs.next()) {
			a = new BankAccount(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
			bankaccounts.add(a);
		}
		return bankaccounts;
	}
	
	public void deleteThisAccount(int owner_id, float d) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "delete from \"BankAccount\" where owner_id = ? and balance = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1,  owner_id);
		ps.setFloat(2, d);
		ps.executeUpdate();	
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