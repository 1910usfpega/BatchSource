package com.jdbc.bank.daoimple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.bank.bean.Account;
import com.jdbc.bank.bean.User;
import com.jdbc.bank.dao.AccountDao;
import com.jdbc.bank.util.ConnFactory;

public class AccountDoaImple implements AccountDao {
	
	public static ConnFactory cf = ConnFactory.getInstance();
	public static String sql;
	public static Connection con;
	public static PreparedStatement ps;


	@Override
	public ArrayList<Account> getAccType(boolean type) throws SQLException {
		//this is where I would implement a method to return a boolean value
		//to see either a savings or checking account types.
		return null;
	}

	@Override
	public List<Account> getAllAccId(User you) {
		List<Account> accID = new ArrayList<Account>();
		con = cf.getConnection();
		sql = "select * from account where account_full_name = ?";	
		Account temp = null;

		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, you.getFullName());
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				temp = new Account(rs.getDouble(1),rs.getString(2),rs.getBoolean(3),rs.getDouble(4)); 
				System.out.println(temp);
				accID.add(temp);
			}
		}	catch (SQLException e) {
			System.out.println("Account can not be deleted!");
			e.printStackTrace();
		}
		
		return accID;
	}

	
	
	
	@Override
	public void removeAccount(Account closedAccount) throws SQLException {
		con = cf.getConnection();
		sql = "delete from account where bank_account_id = ?";	
	
		try {
		ps = con.prepareStatement(sql);
		ps.setDouble(1, closedAccount.getAccID());
		ps.executeUpdate();
	}	catch (SQLException e) {
		System.out.println("Account can not be deleted!");
		e.printStackTrace();
	}
		
		
		
		
	}

	@Override
	public void reviseAccountBalance(Account reviseAccount) {
		con = cf.getConnection();
		sql= "update account set account_balance=? where bank_account_id=?";
		try {
	
			ps= con.prepareStatement(sql);
			ps.setDouble(1, reviseAccount.getBalance());
			ps.setDouble(2, reviseAccount.getAccID());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Selected account balance cannot be updated!");
			e.printStackTrace();
		}
	}
		
		
		
	
	@Override
	public void createAccounts(Account newAccount) {
		
		//ConnFactory connect = ConnFactory.getInstance();
		//controls the connection to the database
		
		con = cf.getConnection();
		sql = "insert into account(bank_account_ID,"
				+ " account_full_name, account_Type, "
				+ "account_balance) values ( ? ,?, ?, ?)";	
		
	
		try {
			ps = con.prepareStatement(sql);
			
			ps.setDouble(1, newAccount.getAccID());
			ps.setString(2, newAccount.getFullName());
			ps.setBoolean(3, newAccount.getAccType());
			ps.setDouble(4, newAccount.getBalance());
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}	
	

}
