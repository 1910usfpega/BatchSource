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

	public Employee getEmployeeByName(String name) throws SQLException {
		ArrayList<Employee> CustomerList= new ArrayList<Employee>();
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

	public static double ViewAccountStatic(int accountNumber) throws SQLException {
		Connection conn= cf.getConnection();
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
		Connection conn= cf.getConnection();
		 String sql="update bankaccount set amount =  amount + ? where accountnumber = ?";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setDouble(1,amount);
			ps.setInt(2,accountNumber);
			ps.executeUpdate();	}


	public void withdraw(double amount, int accountNumber) throws SQLException {
		BankDaoImpl aaa = new BankDaoImpl();
		double temp = aaa.ViewAccountStatic(accountNumber);
		if(temp > amount) {
		Connection conn= cf.getConnection();
		 String sql="update bankaccount set amount =  amount - ? where accountnumber = ?";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setDouble(1,amount);
			ps.setInt(2,accountNumber);
			ps.execute();}
		else {
			System.out.println("You dont have enough money in that account, to makme that with draw");
		}
	}
	public bankAccount getAccount( int accountNumber, String username) throws SQLException {
		
		Connection conn= cf.getConnection();

		String sql="select * from bankaccount where accountnumber = ? ";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setInt(1,accountNumber);
		ResultSet rs= ps.executeQuery();
		while(rs.next()) {
			double balance = rs.getDouble(2);
			bankAccount aa = new bankAccount(accountNumber, balance);
			return aa;
		}
			
		return null;
	}

	public List<bankAccount> getAllAccounts(String username) throws SQLException {
		List<bankAccount> a= new ArrayList<bankAccount>();
		bankAccount aa = null;
		Connection conn= cf.getConnection();
		 String sql="select accountnumber from owners where username = ? ";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setString(1,username);
			ResultSet rs= ps.executeQuery();
			int temp = 0;
			while(rs.next()) {
				temp = rs.getInt(1);
				sql=("select * from bankaccount where accountnumber = ?");
				 ps= conn.prepareStatement(sql);
					ps.setInt(1,temp);
				   ResultSet rs2= ps.executeQuery();
				    while(rs2.next()) {
				   aa = new bankAccount(rs2.getInt(1),rs2.getDouble(2));
					a.add(aa);
				    }
			}
			return a;	
}
	
	public void addaccounttouser(String username) throws SQLException {
		Connection conn= cf.getConnection();
		 String sql=("select accountnumber from bankaccount where accountnumber = (select max(accountnumber) from bankaccount)");
			PreparedStatement ps= conn.prepareStatement(sql);
			ResultSet rs= ps.executeQuery();
			rs.next();
			int temp = rs.getInt(1);
			System.out.println("looking for: "+username);
			 sql=("insert into owners (accountnumber, username)VALUES(?,?)");
			PreparedStatement ps2= conn.prepareStatement(sql);
			 ps2.setInt(1,temp);
			 ps2.setString(2,username);
	         ps2.execute();
			
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