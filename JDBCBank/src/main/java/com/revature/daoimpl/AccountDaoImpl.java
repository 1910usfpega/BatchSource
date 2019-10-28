package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.revature.beans.AccountBean;
import com.revature.dao.AccountDao;
import com.revature.util.ConnFactory;

public class AccountDaoImpl implements AccountDao {
	public static ConnFactory cf = ConnFactory.getInstance();

	@Override
	public ArrayList<AccountBean> getAllApplications() {
		ArrayList<AccountBean> accountlist = new ArrayList<AccountBean>();
		Connection conn = cf.getConnection();
		String str = "select * from bank_applications";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(str);
			ResultSet rs = ps.executeQuery();
			ArrayList<String> custs= new ArrayList<String>();
			AccountBean a = null;
			String c = null;
			ResultSet rs2 = null;
			PreparedStatement ps2 = conn.prepareStatement(str);
			ArrayList<Integer> alreadyMade=new ArrayList<Integer>();
			while (rs.next()) {
				if(alreadyMade.contains(rs.getInt(3))==false){
					custs = new ArrayList<String>();
					str = "select * from bank_applications where account_number = ?";
					ps2 = conn.prepareStatement(str);
					ps2.setInt(1, rs.getInt(3));
					rs2 = ps2.executeQuery();
					while (rs2.next()) {
						c = rs2.getString(2);
						custs.add(c);
					}
					a = new AccountBean(rs.getInt(3),rs.getString(4), custs);
					a.setUsers(custs);
					accountlist.add(a);
					alreadyMade.add(rs.getInt(3));
				}
			}
			return accountlist;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public ArrayList<AccountBean> getAllAccounts() {
		ArrayList<AccountBean> accountlist = new ArrayList<AccountBean>();
		Connection conn = cf.getConnection();
		String str = "select * from bank_accounts";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(str);
			ResultSet rs = ps.executeQuery();
			ArrayList<String> custs= new ArrayList<String>();
			AccountBean a = null;
			String c = null;
			ResultSet rs2 = null;
			PreparedStatement ps2 = conn.prepareStatement(str);
			ArrayList<Integer> alreadyMade=new ArrayList<Integer>();
			while (rs.next()) {
				if(alreadyMade.contains(rs.getInt(3))==false){
					custs = new ArrayList<String>();
					str = "select * from bank_accounts where account_number = ?";
					ps2 = conn.prepareStatement(str);
					ps2.setInt(1, rs.getInt(3));
					rs2 = ps2.executeQuery();
					while (rs2.next()) {
						c = rs2.getString(2);
						custs.add(c);
					}
					a = new AccountBean(rs.getInt(3),rs.getString(4),rs.getDouble(5), custs);
					a.setUsers(custs);
					accountlist.add(a);
					alreadyMade.add(rs.getInt(3));
				}
			}
			return accountlist;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public AccountBean getAccountByAccountNumber(int acctnum) {
		Connection conn = cf.getConnection();
		String str = "select * from bank_accounts where account_number = ?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(str);
			ps.setInt(1, acctnum);
			ResultSet rs = ps.executeQuery();
			ArrayList<String> custs=new ArrayList<String>();
			AccountBean a = null;
			String type="";
			double balance=0.0;
			
			while (rs.next()) {
				type=rs.getString(4);
				balance = rs.getDouble(5);
				custs.add(rs.getString(2));
			}
			a = new AccountBean(acctnum, type, balance, custs);
			a.setUsers(custs);
			return a;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public AccountBean getApplicationByAccountNumber(int acctnum) {
		Connection conn = cf.getConnection();
		String str = "select * from bank_applications where account_number = ?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(str);
			ps.setInt(1, acctnum);
			ResultSet rs = ps.executeQuery();
			ArrayList<String> custs=new ArrayList<String>();
			AccountBean a = null;
			String type="";
			
			while (rs.next()) {
				type=rs.getString(4);
				custs.add(rs.getString(2));
			}
			a = new AccountBean(acctnum, type, 0.0, custs);
			a.setUsers(custs);
			return a;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public ArrayList<AccountBean> getAccountByUser(String user) {
		ArrayList<AccountBean> accountlist = new ArrayList<AccountBean>();
		Connection conn = cf.getConnection();
		String str = "select * from bank_accounts where username = ?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(str);
			ps.setString(1, user);
			ResultSet rs = ps.executeQuery();
			AccountBean a = null;
			while (rs.next()) {
				a = new AccountBean(rs.getInt(3), rs.getString(4), rs.getDouble(5), user);
				accountlist.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return accountlist;
	}

	@Override
	public void updateAccount(AccountBean acct) {
		Connection conn = cf.getConnection();
		String str = "update bank_accounts set balance = ? where account_number=?";
		try {
			PreparedStatement ps;
			
			ps = conn.prepareStatement(str);
			ps.setDouble(1, acct.getAccountBalance());
			ps.setInt(2, acct.getAccountNumber());
			ps.execute();
			
			ps=conn.prepareStatement("commit");
			ps.execute();
			System.out.println("Successfully updated account");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void addAccountToDatabase(AccountBean acct) {
		Connection conn = cf.getConnection();
		String str = "insert into bank_accounts values (nextval('acctseq'),?,?,?,?)";
		try {
			PreparedStatement ps;
			for (String user : acct.getUsers()) {
				ps = conn.prepareStatement(str);
				ps.setString(1, user);
				ps.setInt(2, acct.getAccountNumber());
				ps.setString(3, acct.getAccountType());
				ps.setDouble(4, acct.getAccountBalance());
				ps.execute();
			}
			ps=conn.prepareStatement("commit");
			ps.execute();
			System.out.println("Successfully added account");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void removeAccountFromDatabase(int acct) {
		Connection conn = cf.getConnection();
		String str = "delete from bank_accounts where account_number = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(str);
			ps.setInt(1, acct);
			ps.execute();
			ps=conn.prepareStatement("commit");
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void removeApplicationFromDatabase(int acct) {
		Connection conn = cf.getConnection();
		String str = "delete from bank_applications where account_number = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(str);
			ps.setInt(1, acct);
			ps.execute();
			ps=conn.prepareStatement("commit");
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void addApplicationToDatabase(AccountBean acct) {
		Connection conn = cf.getConnection();
		String str = "insert into bank_applications values (nextval('acctseq'),?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(str);
			for (String user : acct.getUsers()) {
				ps.setString(1, user);
				ps.setInt(2, acct.getAccountNumber());
				ps.setString(3, acct.getAccountType());
				ps.execute();
			}
			ps=conn.prepareStatement("commit");
			ps.execute();
			System.out.println("Successfully added application");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	

}
