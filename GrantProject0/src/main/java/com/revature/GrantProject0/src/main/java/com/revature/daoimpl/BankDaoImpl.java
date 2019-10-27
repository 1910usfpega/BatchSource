package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.bean.BankApplication;
import com.revature.bean.Customer;
import com.revature.dao.BankDao;
import com.revature.utills.BankConnection;

public class BankDaoImpl implements BankDao {
	public static BankConnection cf= BankConnection.getInstance();

	@Override
	public double ViewAccount(int accountNumber) throws SQLException {
		Connection conn= cf.getConnection();
		Statement stmt= conn.createStatement();
		 String sql="select * from \"customer_table\" where account_number = ?";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setInt(1,accountNumber);
			ResultSet rs= ps.executeQuery();
			BankApplication a=null;
			while(rs.next()) {
				a= new BankApplication(rs.getDouble(2),rs.getInt(1));
			}
		return a.getAmount();
	}
	public static double ViewAccountStatic(int accountNumber) throws SQLException {
		Connection conn= cf.getConnection();
		Statement stmt= conn.createStatement();
		 String sql="select * from \"customer_table\" where account_number = ?";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setInt(1,accountNumber);
			ResultSet rs= ps.executeQuery();
			BankApplication a=null;
			while(rs.next()) {
				a= new BankApplication(rs.getDouble(2),rs.getInt(1));
			}
		return a.getAmount();
	}
	
	@Override
	public void deposit(double amount, int accountNumber) throws SQLException {
		BankDaoImpl aaa = new BankDaoImpl();
		double temp = aaa.ViewAccountStatic(accountNumber);
		Connection conn= cf.getConnection();
		Statement stmt= conn.createStatement();
		 String sql="update \"customer_table\" set amount =  ? where account_number = ?";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setDouble(1,amount + temp);
			ps.setInt(2,accountNumber);
			ps.executeQuery();
	}

	@Override
	public void withdraw(double amount, int accountNumber) throws SQLException {
		BankDaoImpl aaa = new BankDaoImpl();
		double temp = aaa.ViewAccountStatic(accountNumber);
		Connection conn= cf.getConnection();
		Statement stmt= conn.createStatement();
		 String sql="update \"customer_table\" set amount =  ? where account_number = ?";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setDouble(1,amount - temp);
			ps.setInt(2,accountNumber);
			ps.executeQuery();
	}
	@Override
	public ArrayList<BankApplication> getAllAccounts(int accountNumber) throws SQLException {
		ArrayList<BankApplication> a=null;
			Connection conn= cf.getConnection();
			Statement stmt= conn.createStatement();
			 String sql="select * from \"owner\" where account_number = ?";
				PreparedStatement ps= conn.prepareStatement(sql);
				ps.setInt(1,accountNumber);
				ResultSet rs= ps.executeQuery();
				while(rs.next()) {
					a.add(new BankApplication(rs.getDouble(2),rs.getInt(1)));
				}
			
		return a;
	}	
}
