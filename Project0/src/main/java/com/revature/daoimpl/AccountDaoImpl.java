package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.revature.dao.AccountDao;
import com.revature.model.Account;
import com.revature.model.User;
import com.revature.util.ConnFactory;

public class AccountDaoImpl implements AccountDao {
	public static ConnFactory cf = ConnFactory.getInstance();

	public List<Account> getAllAlbums() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Account> getAlbumsByID(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertAccount(Account a, User u) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "Insert into student values(nextval (\'stuseq\'),?,?)";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		//we set the name (String) index one and value then same
		ps.setDouble(1, a.getBalance());
		ps.setString(2, a.getType());
		
		ps.executeUpdate();
		
		String sql2 = "INSERT INTO users_accounts (username, acct_id) VALUES (?, ?)";
	
				PreparedStatement ps2 = conn.prepareStatement(sql2); 
			ps2.setInt(1, a.getId());
			ps2.setString(2, u.getUsername());
			ps2.executeUpdate();

	}

}
