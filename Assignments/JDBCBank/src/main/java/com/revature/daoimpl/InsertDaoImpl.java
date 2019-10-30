package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.bean.Account;
import com.revature.bean.Transaction;
import com.revature.bean.UserInfo;
import com.revature.dao.InsertDao;
import com.revature.util.ConnFactory;

public class InsertDaoImpl implements InsertDao{
	
	public static ConnFactory cf = ConnFactory.getInstance();

	public void addUser(UserInfo u) throws SQLException {
		
		Connection conn= cf.getConnection();
		
	
		String sql = "SELECT JDBC_Bank.AddUser( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps= conn.prepareStatement(sql);
		

		ps.setString(1,u.getUser_Name());
		ps.setInt(2,u.getUser_Typ());
		ps.setString(3,u.getFirstName());
		ps.setString(4,u.getLastName());
		ps.setString(5,u.getAddressln());
		ps.setString(6,u.getCity());
		ps.setString(7,u.getState());
		ps.setString(8,u.getCountry());
		ps.setString(9,u.getZip());
		ps.setString(10,u.getContact_num());
		ps.setString(11,u.getEmail());
		
		ps.executeQuery();
		
		// set user's login info  JDBC_Bank.AddLogIN(uName VARCHAR, pwd VARCHAR)
		sql = "SELECT JDBC_Bank.AddLogIN( ?, ?)";
		ps= conn.prepareStatement(sql);
		
		ps.setString(1,u.getUser_Name());
		ps.setString(2,u.getPassword());
		
		ps.executeQuery();
		
		
	}

	public void addAccount(Account a) throws SQLException {

		Connection conn= cf.getConnection();
		
	
		String sql = "SELECT JDBC_Bank.AddAccount( ?, ?, ?)";
		PreparedStatement ps= conn.prepareStatement(sql);

		ps.setInt(1,a.getUser_ID());
		ps.setInt(2,a.getAccountType());
		ps.setDouble(3,a.getAccBalance());
		
		
		ps.executeQuery();
		
	}

	public void addTransaction(Transaction t) throws SQLException {
		
		Connection conn= cf.getConnection();
		
		
		String sql = "SELECT JDBC_Bank.AddTrans( ?, ?, ?, ?)";
		PreparedStatement ps= conn.prepareStatement(sql);

		ps.setInt(1,t.getUser_ID());
		ps.setInt(2,t.getBank_Acc_ID());
		ps.setInt(3,t.getTrans_Typ());
		ps.setDouble(4,t.getTrans_Amt());
		
		
		ps.executeQuery();
		
	}
	
	
	

}
