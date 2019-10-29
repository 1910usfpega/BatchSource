package com.revature.daoimpl;

import com.revature.dao.AccountsDao;
import com.revature.util.ConFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.bean.Accounts;


public class AccountDaoImpl implements AccountsDao {
	
	public static ConFactory cf = ConFactory.getInstance();

	public List<Accounts> getAllAccounts() throws SQLException {
		// TODO Auto-generated method stub
		List<Accounts> accountsList = new ArrayList<Accounts>();
		Connection conn= cf.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from \"accounts\"");
		Accounts a = null;
		while(rs.next()) {
			a = new Accounts(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getInt(5), rs.getDouble(6));
			accountsList.add(a);
		}
		
		return accountsList;
	}
	

}
