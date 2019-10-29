package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.revature.beans.Bank;
import com.revature.beans.ConfirmUser;
import com.revature.dao.BankDao;
import com.revature.conn.BankConn;


public class BankDaoImpl {

	public static BankConn cb = BankConn.getInstance();
	static Map<String, String> hMap = new HashMap<>();
	static Map<Integer, Double> hMap2 = new HashMap<>();
	static Map<String, ArrayList<Integer>> hMap3 = new HashMap<>();
	static ArrayList<Integer> id = new ArrayList<Integer>();
//	static Map<Integer, String> hMap4 = new HashMap<>();
	static ArrayList<String> UserName = new ArrayList<String>();
	static ArrayList<Integer> IDs = new ArrayList<Integer>();
	
	public static void insertUser(String username, String password) throws SQLException {
		Connection conn = cb.getConnection();
		String sql= "insert into usernames values (nextval (\'bankseq\'),?,?)";
		PreparedStatement ps= conn.prepareStatement(sql);
		//ResultSet rs = stmt.executeQuery("select * from \"Album\" where \"Artistid\" = " + id);
		ps.setString(1, username);
		ps.setString(2, password);
		ps.executeUpdate();
	}
	
	public static int tableSize() throws SQLException{
		Connection conn = cb.getConnection();
		String sql= "select account_id from accounts";
		PreparedStatement ps= conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = ps.executeQuery();
		rs.beforeFirst();
//		rs.afterLast();
		int size = 0;
		while(rs.next())
		{
			size += 1;
		}

		return size;
	}
	
	public static ArrayList<Integer> IDs() throws SQLException{
		Connection conn = cb.getConnection();
		String sql= "select account_id from accounts";
		PreparedStatement ps= conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = ps.executeQuery();
		rs.beforeFirst();
		while(rs.next())
		{
			IDs.add(rs.getInt(1));
		}
		return IDs;
	}
	
	public static Map<String, String> confirmUser() throws SQLException{
		Connection conn = cb.getConnection();
		String sql= "select username, password from usernames";
		PreparedStatement ps= conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = ps.executeQuery();
		rs.beforeFirst();
		while (rs.next()){
			hMap.put(rs.getString(1), rs.getString(2));
		}
		return hMap;

	}

	public static void insertInfo(String username, double balance) throws SQLException {
		Connection conn = cb.getConnection();
		String sql= "insert into accounts values (nextval (\'userseq\'),?,?)";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1, username);
		ps.setDouble(2, balance);
		ps.executeUpdate();
	}
	
	public static Map<Integer, Double> accountBalance() throws SQLException{
		Connection conn = cb.getConnection();
		String sql= "select account_id, balance from accounts";
		PreparedStatement ps= conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = ps.executeQuery();
		rs.beforeFirst();
		while (rs.next()){
			hMap2.put(rs.getInt(1), rs.getDouble(2));
		}
		return hMap2;
		}

	
	public static Map<String, ArrayList<Integer>> userAccounts() throws SQLException{
		Connection conn = cb.getConnection();
		String sql= "select username, account_id from accounts order by username";
		PreparedStatement ps= conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = ps.executeQuery();
		id = new ArrayList<Integer>();
		
		rs.beforeFirst();
		while (rs.next()){
			String temp = rs.getString(1);
			id.add(rs.getInt(2));
			hMap3.put(rs.getString(1), id);
			if(rs.getString(1) != temp)
			{id.clear();}
		}
		return hMap3;
	}
	public static ArrayList<String> hMap4() throws SQLException{
		Connection conn = cb.getConnection();
		String sql= "select username from accounts";
		PreparedStatement ps= conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = ps.executeQuery();
		rs.beforeFirst();
		while (rs.next()){
			UserName.add(rs.getString(1));
		}
		return UserName;
	}
	
	public static void deleteAccount(int user_id) throws SQLException {
		Connection conn = cb.getConnection();
		String sql= "delete from accounts where account_id = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setInt(1, user_id);
		ps.executeUpdate();
	}
	
	public static void withdrawAccount(double balance, int account_id) throws SQLException {
		Connection conn = cb.getConnection();
		String sql= "update accounts set balance = balance - ? where account_id = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setDouble(1, balance);
		ps.setInt(2, account_id);
		ps.executeUpdate();
	}
	
	public static void depositAccount(double balance) throws SQLException {
		Connection conn = cb.getConnection();
		String sql= "update accounts set balance = balance + ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setDouble(1, balance);
		ps.executeUpdate();
	}
	
	public static void deleteUser(String username) throws SQLException {
		Connection conn = cb.getConnection();
		String sql= "delete from usernames where username = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1, username);
		ps.executeUpdate();
	}
	
}
