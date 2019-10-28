package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.revature.bean.BankApplication;
import com.revature.dao.EmployeeDao;
import com.revature.utills.BankConnection;

public class EmployeeDaoimpl extends CustomerDaoImpl implements EmployeeDao{
	public static BankConnection cf= BankConnection.getInstance();


	@Override
	public void deleteUser(String username) throws SQLException {
		Connection conn= cf.getConnection();
		String sql="delete  form \"customer_table\" where \"user_name\" = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,username);
	    ps.executeQuery();	
	}


	public ArrayList<BankApplication> bankAccountsOfUser() throws SQLException {
		ArrayList<BankApplication> BankApplicationList= new ArrayList<>();
		Connection conn= cf.getConnection();
		Statement stmt= conn.createStatement();
		ResultSet rs= stmt.executeQuery("select * from \"customer_table\"");
		BankApplication a=null;
		while(rs.next()) {
			a= new BankApplication(rs.getDouble(1),rs.getInt(2));
			BankApplicationList.add(a);
		}
		return BankApplicationList;
}
	@Override
	public void updateUserUsername(String username, String updatedUserUsername) throws SQLException {
		Connection conn= cf.getConnection();
		String sql="update \"customer_table\" set user_name = ? where \"user_name\" = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,updatedUserUsername);
		ps.setString(2,username);
		 ps.executeQuery();
		
	}
}
