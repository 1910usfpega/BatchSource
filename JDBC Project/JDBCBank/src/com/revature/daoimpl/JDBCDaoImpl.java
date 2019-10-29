package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.bean.Accounts;
import com.revature.bean.Users;
import com.revature.dao.JDBCDao;
import com.revature.util.ConnFactory;

public class JDBCDaoImpl implements JDBCDao {
	public static ConnFactory cf= ConnFactory.getInstance();
	
	@Override
	public ArrayList<Users> getAllUsers() throws SQLException{
		ArrayList<Users> usersList= new ArrayList<Users>();
		Connection conn= cf.getConnection();
		String str = "Select * from users";
		PreparedStatement stmt= conn.prepareStatement(str);
		ResultSet rs= stmt.executeQuery();
		Users u=null;
		while(rs.next()) {
			u= new Users(rs.getString(2), rs.getString(3));
			usersList.add(u);
		}
		return usersList;
		
	}
	public String checkPassword(String username) {
		Connection conn= cf.getConnection();
		String str = "Select * from users where customer_username = ?";
		try {
			PreparedStatement stmt= conn.prepareStatement(str);
			stmt.setString(1, username);
			ResultSet rs= stmt.executeQuery();
			while(rs.next()) {
				return rs.getString(3);
			}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	public void uploadNewUser(Users u) {
		Connection conn = cf.getConnection();
		String str = "insert into users values (nextval('nextuser'),?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(str);
			//ps.setInt(1, "nextval('nextuser')");
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			ps.execute();
			ps.getConnection().prepareStatement("commit");
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public List<Accounts> getAllAccounts() throws SQLException{
		List<Accounts> AccountsList= new ArrayList<Accounts>();
		Connection conn= cf.getConnection();
		String str = "Select * from accounts";
		PreparedStatement stmt= conn.prepareStatement(str);
		ResultSet rs= stmt.executeQuery();
		Accounts a=null;
		while(rs.next()) {
			a= new Accounts(rs.getInt(2), rs.getString(3), rs.getDouble(4));
			AccountsList.add(a);
		}
		return AccountsList;
	}
	public void uploadNewAccount(String a) {
		Connection conn = cf.getConnection();
		
		
		
		String str = "insert into accounts values (currval('nextaccount'),?,?,?)";
		try {
			PreparedStatement p = conn.prepareStatement("select nextval ('nextaccount')");
			ResultSet rs = p.executeQuery();
			int id = 0;
			while(rs.next()) {
				id = rs.getInt(1);
				
			}Accounts ac = new Accounts(id, a, 0);
			
			
			PreparedStatement ps = conn.prepareStatement(str);
			
			ps.setInt(1, ac.getAccountID());
			ps.setString(2, ac.getUsername());
			ps.setDouble(3, ac.getBalance());
			ps.execute();
			ps.getConnection().prepareStatement("commit");
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void updateAccount(Accounts acct) {
		Connection conn= cf.getConnection();
		String str = "update accounts set balance = ? where account_id=?";
				try {
				PreparedStatement ps;
				
				ps = conn.prepareStatement(str);
				ps.setDouble(1, acct.getBalance());
				ps.setInt(2, acct.getAccountID());
				ps.execute();
				ps = conn.prepareStatement("commit");
				ps.execute();
				}catch (SQLException e) {
					e.printStackTrace();
				}
	
				
	}
	
	
	public Users getAUsers(String username) throws SQLException{
		Connection conn= cf.getConnection();
		String str = "Select * from users where customer_username = ?";
		PreparedStatement stmt= conn.prepareStatement(str);
		stmt.setString(1, username);
		ResultSet rs= stmt.executeQuery();
		Users u=null;
		while(rs.next()) {
			u= new Users(rs.getString(2), rs.getString(3));
			return u;
		}
		return u;
		
	}
	
	public Accounts getAnAccounts(int id) throws SQLException{
		Connection conn= cf.getConnection();
		String str = "Select * from accounts where account_id = ?";
		PreparedStatement stmt= conn.prepareStatement(str);
		stmt.setInt(1, id);
		ResultSet rs= stmt.executeQuery();
		Accounts u=null;
		while(rs.next()) {
			u= new Accounts(rs.getInt(1), rs.getString(3),rs.getDouble(4));
			return u;
		}
		return u;
		
	}
	
	public void deleteAccount(int a) {
		Connection conn = cf.getConnection();
		String str = "delete from accounts where account_id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(str);
			ps.setInt(1, a);
			ps.execute();
			ps.getConnection().prepareStatement("commit");
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
}
	}
}
