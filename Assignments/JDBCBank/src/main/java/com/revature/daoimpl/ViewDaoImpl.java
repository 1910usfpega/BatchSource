package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.bean.Account;
import com.revature.bean.Transaction;
import com.revature.bean.User;
import com.revature.bean.UserInfo;
import com.revature.dao.ViewDao;
import com.revature.util.ConnFactory;

public class ViewDaoImpl implements ViewDao{
	
	public static ConnFactory cf = ConnFactory.getInstance();

	public List<User> getAllUsers() throws SQLException {
		
		List<User> userList= new ArrayList<User>();
		
		Connection conn= cf.getConnection();
		
		String sql="select * from JDBC_Bank.get_AllLogIn()";
		PreparedStatement ps= conn.prepareStatement(sql);
		
		
		ResultSet rs = ps.executeQuery();
		
		User u = null;
		while(rs.next()) {
			u = new User(rs.getString(1),rs.getString(2));
			userList.add(u);
		}
		return userList;
		

	}

	public List<UserInfo> getAllUserInfo() throws SQLException {
		
		List<UserInfo> userList= new ArrayList<UserInfo>();
		
		Connection conn= cf.getConnection();
		
		String sql="select * from JDBC_Bank.get_AllUsers()";
		PreparedStatement ps= conn.prepareStatement(sql);
		
		
		ResultSet rs = ps.executeQuery();
		
		UserInfo u = null;
		while(rs.next()) {
			u = new UserInfo(rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getString(4), rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12)); 
			userList.add(u);
		}
		return userList;
		

	}

	public List<Account> getAllAccounts() throws SQLException {

		List<Account> accList= new ArrayList<Account>();
		
		Connection conn= cf.getConnection();
		
		String sql = "select * from JDBC_Bank.get_AllAccounts()";
		PreparedStatement ps= conn.prepareStatement(sql);
		
		
		ResultSet rs = ps.executeQuery();
		
		Account a = null;
		while(rs.next()) {
			a = new Account(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getDouble(4)); 
			accList.add(a);
		}
		return accList;
	}

	public List<Transaction> getAllTransaction() throws SQLException {	
		
		List<Transaction> transList= new ArrayList<Transaction>();
		
		Connection conn= cf.getConnection();
		
		String sql = "select * from JDBC_Bank.get_AllTransactions()";
		PreparedStatement ps= conn.prepareStatement(sql);
		
		
		ResultSet rs = ps.executeQuery();
		
		Transaction t = null;
		while(rs.next()) {
			t = new Transaction(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getDouble(5));  
			transList.add(t);
		}
		return transList;
	}

}
