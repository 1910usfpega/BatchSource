package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.revature.bean.bankAccount;
import com.revature.utills.ConnFactory;
public class BankDaoImpl  {
	public static ConnFactory cf= ConnFactory.getInstance();

	public static double newBankAccount() throws SQLException {
		Connection conn= cf.getConnection();
		Statement stmt= conn.createStatement();
		 String sql="insert into bankaccount (amount) Value(0)";
			PreparedStatement ps= conn.prepareStatement(sql);
			ResultSet rs= ps.executeQuery();
			bankAccount a=null;
			while(rs.next()) {
				a= new bankAccount(rs.getInt(2),rs.getDouble(1));
			}
		return a.getBalance();
	}

	public static double ViewAccountStatic(int accountNumber) throws SQLException {
		Connection conn= cf.getConnection();
		Statement stmt= conn.createStatement();
		 String sql="select * from bankaccount where accountnumber = ?";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setInt(1,accountNumber);
			ResultSet rs= ps.executeQuery();
			bankAccount a=null;
			while(rs.next()) {
				a= new bankAccount(rs.getInt(2),rs.getDouble(1));
			}
		return a.getBalance();
	}

	public void deposit(double amount, int accountNumber) throws SQLException {
		BankDaoImpl aaa = new BankDaoImpl();
		double temp = aaa.ViewAccountStatic(accountNumber);
		Connection conn= cf.getConnection();
		Statement stmt= conn.createStatement();
		 String sql="update bankaccount set amount =  ? where accountnumber = ?";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setDouble(1,amount + temp);
			ps.setInt(2,accountNumber);
			ps.execute();
	}


	public void withdraw(double amount, int accountNumber) throws SQLException {
		BankDaoImpl aaa = new BankDaoImpl();
		double temp = aaa.ViewAccountStatic(accountNumber);
		Connection conn= cf.getConnection();
		Statement stmt= conn.createStatement();
		 String sql="update bankaccount set amount =  ? where accountnumber = ?";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setDouble(1,amount - temp);
			ps.setInt(2,accountNumber);
			ps.execute();
	}
	public bankAccount getAccount( int accountnumber) throws SQLException {
		bankAccount a=null;
			Connection conn= cf.getConnection();
			Statement stmt= conn.createStatement();
			 String sql="select * from bankaccount where accountnumber = ?";
				PreparedStatement ps= conn.prepareStatement(sql);
				ps.setInt(1,accountnumber);
				ResultSet rs= ps.executeQuery();
				while(rs.next()) {
					a = new bankAccount(rs.getInt(1),rs.getDouble(2));
				}
			
		return a;
	}

	public ArrayList<bankAccount> getAllAccounts(String username) throws SQLException {
		ArrayList<bankAccount> a= new ArrayList<>();
		bankAccount aa = null;
		Connection conn= cf.getConnection();
		Statement stmt= conn.createStatement();
		 String sql="select accountnumber from owners where username = ? ";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setString(1,username);
			ResultSet rs= ps.executeQuery();
			int temp = 0;
			ResultSet rs2= null;
			while(rs.next()) {
				temp = rs.getInt(1);
				sql=("select * from bankaccount where accountnumber = ?");
				 ps= conn.prepareStatement(sql);
					ps.setInt(1,temp);
				    rs2= ps.executeQuery();
				    while(rs2.next()) {
				   aa = new bankAccount(rs2.getInt(1),rs2.getDouble(2));
					a.add(aa);
				    }
			}
			return a;	
}
	
	
	public ArrayList<bankAccount> getAllofAccounts() throws SQLException {
		ArrayList<bankAccount> a=null;
		Connection conn= cf.getConnection();
		Statement stmt= conn.createStatement();
		 String sql="select * from bankaccount ";
			PreparedStatement ps= conn.prepareStatement(sql);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				a.add(new bankAccount(rs.getInt(2),rs.getDouble(1)));
	}
			return a;	
}}