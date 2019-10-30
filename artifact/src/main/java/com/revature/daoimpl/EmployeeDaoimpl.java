package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.bean.Employee;
import com.revature.bean.bankAccount;
import com.revature.utills.ConnFactory;

public class EmployeeDaoimpl extends Customerdaoimpl{
	public static ConnFactory cf= ConnFactory.getInstance();

	public Employee getEmployeeByName(String name) throws SQLException {
		List<Employee> CustomerList= new ArrayList<Employee>();
		Connection conn= cf.getConnection();
		String sql="select * from customer where username = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1, name);
		ResultSet rs= ps.executeQuery();
		Employee a=null;
			a= new Employee(rs.getNString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			CustomerList.add(a);
		
		return a;
	}
	public void deleteUser(String username) throws SQLException  {
		Connection conn= cf.getConnection();
		String sql="delete  form customer where username = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,username);
	    ps.executeQuery();	
	}
	public void deleteUserAccount(int accountNumber, String Username) throws SQLException {
		Connection conn= cf.getConnection();
		String sql="delete from owners where username = ? and "
				+ "accountnumber = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,Username);
		ps.setInt(1,accountNumber);
	    ps.executeQuery();
	    
	     sql="delete from customer where username = ? ";
	      ps= conn.prepareStatement(sql);
			ps.setString(1,Username);
			ps.setInt(1,accountNumber);
		    ps.executeQuery();
	}


	public ArrayList<bankAccount> bankAccountsOfUser() throws SQLException {
		ArrayList<bankAccount> BankApplicationList= new ArrayList<>();
		Connection conn= cf.getConnection();
		Statement stmt= conn.createStatement();
		ResultSet rs= stmt.executeQuery("select * from acustomer");
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
	public void addBankAccount(bankAccount a, String username) throws SQLException{
		Connection conn= cf.getConnection();
		String sql="update owners set username = ? where accountnumber = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,username);
		ps.setInt(2,a.getAccountNumber());
		 ps.executeQuery();
	}
	
	public boolean newEmployee(String username, String fname,String lname,String password) throws SQLException {
		try {
		Connection conn= cf.getConnection();
		String sql="insert into employee (fname,lname,username,pass)"
				+ "Values(?,?,?,?)";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,fname);
		ps.setString(2,lname);
		ps.setString(1,username);
		ps.setString(2,password);
		 ps.executeQuery();
		 return true;
		}
		catch(Exception e) {return false;}
	}
	
}
