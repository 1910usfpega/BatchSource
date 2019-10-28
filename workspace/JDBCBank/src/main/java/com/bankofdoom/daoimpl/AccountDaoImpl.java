package com.bankofdoom.daoimpl;

import java.sql.Connection;
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
	public List<Account> getAllAccount() throws SQLException {
		// arraylist to be returned to get all users
		List<Account> accList = new ArrayList<Account>();
		//my connection to the database
		Account a = new Account()
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select account_id from account_table;");
		Account a =null;
		/*
		 * int userId, String uName, String name, String address, 
		 * String email, String phoneNumber, ArrayList<String> role
		 */
		while(rs.next()) {
			a=new Account();	
			a.setAccountID(rs.getInt(1));
			accList.add(a);
		}
		return accList;
	}

	@Override
	public void removeAccount(Account closedAccount) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAccounts(Account updateAccout) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createAccounts(Account newAccout) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	
}
