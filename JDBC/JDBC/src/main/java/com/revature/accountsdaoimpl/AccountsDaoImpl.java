package com.revature.accountsdaoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.beans.Accounts;
import com.revature.beans.Users;
import com.revature.util.ConnFactory;

public class AccountsDaoImpl {

	public static ConnFactory cf = ConnFactory.getInstance();

	static Scanner in = new Scanner(System.in);

	public void insertaccounts(String accounts_username, int accounts_accountnumber, double accounts_accountbalance,
			String accounts_accounttype) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "insert into accounts values(?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, accounts_username);
		ps.setInt(2, accounts_accountnumber);
		ps.setDouble(3, accounts_accountbalance);
		ps.setString(4, accounts_accounttype);
		ps.executeUpdate();
	}
	public ArrayList<Accounts>getAccounts(String a){
		ArrayList<Accounts>AccountList= new ArrayList<Accounts>();
		Connection conn = cf.getConnection();
		String str = "select *from Accounts where accounts_username= ?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(str);
			ps.setString(1, a);
			ResultSet rs = ps.executeQuery();
			Accounts b= null;
			while (rs.next()) {
				b = new Accounts(rs.getString(1), rs.getInt(2), rs.getDouble(3), rs.getString(4));
				AccountList.add(b);
			
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return AccountList;
	}

	public Accounts getAccountsbyaccounts_accountnumber(int accounts_accountnumber) throws SQLException {
		
		Connection conn= cf.getConnection();
		String sql= "select * from Accounts where accounts_accountnumber=?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setInt(1,accounts_accountnumber);
		ResultSet rs= ps.executeQuery();
		Accounts a= null;
		while(rs.next()) {
			a= new Accounts(rs.getString(1), rs.getInt(2), rs.getDouble(3), rs.getString(4));
			
		}
		return a;
	}
	public void addAccount(Accounts z){
		Connection conn= cf.getConnection();
		String sql= "insert into accounts values(?,?,?,?,nextval('accountsseq'))";
		try {
			
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setString(1, z.getAccounts_username());
			ps.setInt(2, z.getAccounts_accountnumber());
			ps.setDouble(3, z.getAccounts_accountbalance());
			ps.setString(4, z.getAccounts_accounttype());
			ps.execute();
			ps=conn.prepareStatement("commit");
			ps.execute();
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	public void updatebalance(Accounts s) {
		Connection conn= cf.getConnection();
		String sql= "Update accounts set accounts_accountbalance =? where accounts_accountnumber =?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setDouble(1, s.getAccounts_accountbalance());
			ps.setInt(2, s.getAccounts_accountnumber());
			ps.execute();
			ps=conn.prepareStatement("commit");
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}
	
}
