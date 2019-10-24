package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.revature.bean.Account;
import com.revature.bean.Users;
import com.revature.dao.GroupDao;
import com.revature.util.Factory;

public class GroupDaoImpl implements GroupDao{
public static Factory cf = Factory.getInstance();
	
	public void insertAccount(double balance, boolean accountType) throws SQLException {
		Connection conn = cf.getConnection();
		String input = "insert into account values(nextval(\'accseq\',?,?";
		PreparedStatement ps = conn.prepareStatement(input);
		ps.setDouble(1, balance);
		ps.setBoolean(2, accountType);
		ps.executeUpdate();
	}
	
	public void insertUser(String username, String pw) throws SQLException {
		Connection conn = cf.getConnection();
		String input = "insert into account values(nextval(\'userseq\',?,?";
		PreparedStatement ps = conn.prepareStatement(input);
		ps.setString(1, username);
		ps.setString(2, pw);
		ps.executeUpdate();
	}

	public List<Account> getAllAlbums() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Users> getAlbumsByID(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
