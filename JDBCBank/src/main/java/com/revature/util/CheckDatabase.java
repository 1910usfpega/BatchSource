package com.revature.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.beans.AccountBean;
import com.revature.beans.CustomerBean;
import com.revature.beans.EmployeeBean;

public class CheckDatabase {
	public static ConnFactory cf = ConnFactory.getInstance();

	public static boolean acctNumAlreadyUsed(int acctNum) {
		Connection conn = cf.getConnection();

		String str = "SELECT account_number FROM bank_accounts WHERE account_number = ?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(str);
			ps.setInt(1, acctNum);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				if (rs.getInt(1) == acctNum) {
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static boolean openAcctNumAlreadyUsed(int acctNum) {
		Connection conn = cf.getConnection();

		String str = "SELECT account_number FROM bank_applications WHERE account_number = ?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(str);
			ps.setInt(1, acctNum);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				if (rs.getInt(1) == acctNum) {
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static boolean usernameAlreadyUsed(String name) {
		Connection conn = cf.getConnection();

		String str = "SELECT username FROM bank_customers WHERE username = ?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(str);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				if (rs.getString(1).equals(name)) {
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static boolean checkUser(String name, String password) {
		Connection conn = cf.getConnection();

		String str = "SELECT * FROM bank_customers WHERE username = ?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(str);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				if (rs.getString(3).equals(password)) {
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean checkEmployee(String name, String password) {
		Connection conn = cf.getConnection();

		String str = "SELECT * FROM bank_employees WHERE username = ?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(str);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				if (rs.getString(3).equals(password)) {
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static CustomerBean getThisCustomer(String name) {
		Connection conn = cf.getConnection();

		String str = "SELECT * FROM bank_customers WHERE username = ?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(str);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				CustomerBean customer = new CustomerBean(name,rs.getString(3));
				return customer;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static EmployeeBean getThisEmployee(String name) {
		Connection conn = cf.getConnection();

		String str = "SELECT * FROM bank_Employees WHERE username = ?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(str);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				EmployeeBean emp = new EmployeeBean(name,rs.getString(3));
				return emp;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static AccountBean getThisAccount(int acctnum) {
		Connection conn = cf.getConnection();

		String str = "SELECT * FROM bank_accounts WHERE account_number = ?";
		PreparedStatement ps;
		double balance = 0.0;
		String type = null;
		ArrayList<String> custs = null;
		try {
			ps = conn.prepareStatement(str);
			ps.setInt(1, acctnum);
			ResultSet rs = ps.executeQuery();
			custs = new ArrayList<String>();
			while (rs.next()) {
				custs.add(rs.getString(2));
				balance=rs.getDouble(5);
				type=rs.getString(4);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		AccountBean account = new AccountBean(acctnum,type, balance, custs);
		account.setAccountBalance(balance);
		return account;
	}
	
	public static boolean checkUserOwnsAccount(String user,int acct) {
		Connection conn = cf.getConnection();

		String str = "SELECT * FROM bank_accounts WHERE username = ?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(str);
			ps.setString(1, user);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				if (rs.getInt(3)==acct) {
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

}
