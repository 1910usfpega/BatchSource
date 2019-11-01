package com.jdbc.bank.daoimple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.bank.bean.Account;
import com.jdbc.bank.dao.AccountDao;
import com.jdbc.bank.util.ConnFactory;

public class AccountDoaImple implements AccountDao {
	
	public static ConnFactory cf = ConnFactory.getInstance();
	
	
	//creating an account by connecting to DB through the JDBC connection
	//sending a SQL string statement to send a request to the data
	//sending it through as a prepared statement for security against SQL injections
	
	@Override
	public void createAccount(Account newAccount) throws SQLException {
		Connection con = cf.getConnection();
		//prepare a statement//buffer a statement
		String sql = "insert into accounts(bank_account_id, "
				+ "account_uname, account_type, account_balance) "
				+ "values(nextval (\'accountSequence\'),  ? , ?, ?)";	
		
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, newAccount.getAcct_uname());
		ps.setString(2, newAccount.getAccType());
		ps.setDouble(3, newAccount.getBalance());
		
		ps.executeUpdate();	
	}

//	updateAccount 
	@Override
	public void updateAccount(Account account) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "UPDATE accounts SET account_balance = ?"
				+ " WHERE bank_account_id = ?";

		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setDouble(1, account.getBalance());
		ps.setInt(2, account.getAccID());

		ps.execute();
		//commit saves the current transaction and ends it
		ps = conn.prepareStatement("commit");
		ps.execute();
		
	}
	
	@Override
	public void removeAccount(Account closedAccount) throws SQLException {
		Connection con = cf.getConnection();
		String sql = "delete from accounts where account_uname = ?"
				+ " AND  bank_account_id = ?";	
	
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, closedAccount.getAcct_uname());
		ps.setInt(2, closedAccount.getAccID());
		ps.executeUpdate();
		
	}


	@Override
	public Account getAcct(int acct_number, String uName) throws SQLException {
		Connection con = cf.getConnection();
		String sql = "SELECT * FROM accounts WHERE bank_account_id = ? AND account_uname = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
	
		ps.setInt(1, acct_number);
		ps.setString(2, uName);
		
		
		ResultSet rs = ps.executeQuery();
		
		Account acct = null;
		while(rs.next()) {
			acct = new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
			
		}
		return acct;
	}

	
	
	
	
	@Override
	public List<Account> getAllAccounts() throws SQLException {
		List<Account> accountList = new ArrayList<Account>();
		Connection con = cf.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM accounts");
		
		Account acct = null;
		
		while(rs.next()) {
			acct = new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
			accountList.add(acct);
		}
		return accountList;
	}
	
	

	@Override
	public List<Account> getAccId(String uName) throws SQLException {
		List<Account> accountList = new ArrayList<Account>();
		Connection con = cf.getConnection();
		String sql = "SELECT * FROM accounts WHERE account_uname = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, uName);
		ResultSet rs = ps.executeQuery();
		
		Account acct = null;
		
		while(rs.next()) {
			acct = new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
			accountList.add(acct);
		}
		System.out.println(accountList + "\n");
		return accountList;
	}

	
	

	@Override
	public double getBalance(int bank_account_id) throws SQLException {
		double balance = 0;
		ResultSet rs = null;
		
		Connection con = cf.getConnection();
		String sql = "SELECT * FROM accounts WHERE bank_account_id = ?";
		

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, bank_account_id);
		
		rs = ps.executeQuery();
		
		while(rs.next()) {
			balance = rs.getDouble("account_balance");
		}
		return balance;
	}
	

	@Override
	public void reviseAccountBalance(Account reviseAccount) throws SQLException {
		Connection con = cf.getConnection();
		String sql= "update accounts set account_balance=? where bank_account_id=?";
	
		PreparedStatement ps = con.prepareStatement(sql);
		
			ps.setDouble(1, reviseAccount.getBalance());
			ps.setDouble(2, reviseAccount.getAccID());
			ps.executeUpdate();
		
		
	}


}
