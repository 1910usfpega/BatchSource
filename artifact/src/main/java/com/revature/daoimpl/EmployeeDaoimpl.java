package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.revature.bean.bankAccount;
import com.revature.utils.ConnFactory;

public class EmployeeDaoimpl extends Customerdaoimpl{
	public static ConnFactory cf= ConnFactory.getInstance();


	public void deleteUser(String username) throws SQLException  {
		Connection conn= cf.getConnection();
		String sql="delete  form customer where username = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,username);
	    ps.executeQuery();	
	}


	public ArrayList<bankAccount> bankAccountsOfUser() throws SQLException {
		ArrayList<bankAccount> BankApplicationList= new ArrayList<>();
		Connection conn= cf.getConnection();
		Statement stmt= conn.createStatement();
		ResultSet rs= stmt.executeQuery("select * from \"customer_table\"");
		bankAccount a=null;
		while(rs.next()) {
			a= new bankAccount(rs.getInt(1),rs.getDouble(2));
			BankApplicationList.add(a);
		}
		return BankApplicationList;
}
	public void updateUserUsername(String username, String updatedUserUsername) throws SQLException {
		Connection conn= cf.getConnection();
		String sql="update customer set username = ? where usename = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,updatedUserUsername);
		ps.setString(2,username);
		 ps.executeQuery();
		
	}
}
