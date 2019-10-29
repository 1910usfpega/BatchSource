package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Account;
import com.revature.beans.Person;
import com.revature.dao.AccountDao;
import com.revature.util.ConnFac;

public class AccountDaoImpl implements AccountDao {
	public static ConnFac cf = ConnFac.getInstance();
	public void insertAccount(Account a) throws SQLException{
		Connection conn = cf.getConnection();
		String sql = "insert into accounts values (nextval(\'act_seq\'), ?, ?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setDouble(1,a.getBalance());
		ps.setString(2, a.getAcctType());
		ps.setInt(3, a.getUserId());
		ps.executeUpdate();
		System.out.println("Account added.");
	}
	public Account getAccountById(int id) throws SQLException{
		Connection conn = cf.getConnection();
		try {
		PreparedStatement ps = conn.prepareStatement("select * from accounts where account_id = ?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		Account a = null;
		while(rs.next()) {
			a=new Account(rs.getInt(1),rs.getInt(2), rs.getString(3), rs.getInt(4));
		}return a;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;		
	}
	public List<Account> getAccountsbyUID(int userId) throws SQLException {
		ArrayList<Account> accountList = new ArrayList<Account>();
		Connection conn = cf.getConnection();
		try {
		PreparedStatement ps = conn.prepareStatement("select * from accounts where user_id = ?");
		ps.setInt(1, userId);
		ResultSet rs = ps.executeQuery();
		Account a = null;
		while(rs.next()) {
			a=new Account(rs.getInt(1),rs.getInt(2), rs.getString(3), rs.getInt(4));
			accountList.add(a);
		}return accountList;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;	
	}
	
	public List<Account> getAllAccounts() throws SQLException {
		ArrayList<Account> accountList = new ArrayList<Account>();
		Connection conn = cf.getConnection();
		java.sql.Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from accounts");
			Account p = null;
			while(rs.next()) {
				p =new Account(rs.getInt(1),rs.getInt(2), rs.getString(3), rs.getInt(4));
				accountList.add(p);
			}return accountList;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
 public void updateAccount(Account acct) {
	 Connection conn = cf.getConnection();
	 String str = "update accounts set balance =? where account_id = ?";
	 try {
		 PreparedStatement ps = conn.prepareStatement(str);
		 ps.setInt(2, acct.getAccountId());
		 ps.setDouble(1, acct.getBalance());
		 ps.execute();
		 ps = conn.prepareStatement("commit");
		 ps.execute();
	 }catch(SQLException e) {
		 e.printStackTrace();
	 }
 }
 public void removeAcct(int id) {
	 Connection conn = cf.getConnection();
	 String str = "delete from accounts where acct_id = ?";
	 try {
		 PreparedStatement ps = conn.prepareStatement(str);
		 ps.setInt(1, id);
		 ps.execute();
		 ps= conn.prepareStatement("commit");
		 ps.execute();
	 }catch(SQLException e) {
		 e.printStackTrace();
	 }
 }

}
