package com.bankofdoom.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bankofdoom.bean.Account;
import com.bankofdoom.bean.User;
import com.bankofdoom.dao.AccountDao;
import com.bankofdoom.util.ConnFactoryW;

public class AccountDaoImpl implements AccountDao {

	public static ConnFactoryW cf = ConnFactoryW.getInstance();
	private static String sql;
	private static Connection conn = cf.getConnection();



	@Override
	public List<Account> getAllAccount() {
		// arraylist to be returned to get all users
		List<Account> accList = new ArrayList<Account>();
		//my connection to the database
		Account a = new Account();

		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select account_id from account_table;");
		a =null;
		/*
		 * int userId, String uName, String name, String address, 
		 * String email, String phoneNumber, ArrayList<String> role
		 */
		while(rs.next()) {
			a=new Account();	
			a.setAccountID(rs.getInt(1));
			accList.add(a);
		}
		} catch (SQLException e) {
			System.out.println("Unable to get requested account.");
			e.printStackTrace();
		}
		
		return accList;
	}

	@Override
	public boolean removeAccount(Account closedAccount) {

		if(closedAccount.getBalance() == 0) {
			sql= "delete * from account_table where"
					+ "account_id = ?";
			PreparedStatement ps;

			try {
				ps = conn.prepareStatement(sql);
				ps.setInt(1, closedAccount.getAccountID());
				ps.executeUpdate();
			} catch (SQLException e) {
				System.out.println("That account can not be closed!");
				e.printStackTrace();
			}

			return true;
		}

		return false;
	}

	@Override
	public void updateAccount(Account updateAccount){
		sql= "update user_table set"
				+ " checking=?, balance=?, user_id=?,"
				+ " approved=? where account_id=?";
		try {
			PreparedStatement ps= conn.prepareStatement(sql);

			ps.setBoolean(1, updateAccount.isCheckingAccount());
			ps.setDouble(2, updateAccount.getBalance());
			ps.setInt(3, updateAccount.getUserId());
			ps.setInt(4, updateAccount.getAccountID());

		} catch (SQLException e) {
			System.out.println("Unable to update that account!");
			e.printStackTrace();
		}
	}

	@Override
	public void createAccount(Account newAccount) {
		sql= "insert into account_table(checking,balance,user_id,approved) values("
				+ "?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setBoolean(1, newAccount.isCheckingAccount());
			ps.setDouble(2, newAccount.getBalance());
			ps.setInt(3, newAccount.getUserId());
			ps.setBoolean(4, newAccount.isApproved());
			ps.execute();
		} catch (SQLException e) {
			System.out.println("Unable to create that account.");
			e.printStackTrace();
		}
		//ps.setInt(1, newAccount.getAccountID());

	}

	@Override
	public List<Account> getAccounts(User u) {

		List<Account> accList = new ArrayList<Account>();
		Account acc = null;
		sql= "select * from account_table where user_id = ?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, u.getUserId());
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				acc = new Account(rs.getInt(1),rs.getBoolean(2),rs.getDouble(3));
				accList.add(acc);
			}
		} catch (SQLException e) {
			System.out.println("Oops! Unable to get the desired accounts!");
			e.printStackTrace();
		}


		return accList;
	}




}
