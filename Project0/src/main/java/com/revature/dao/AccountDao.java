package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.model.Account;
import com.revature.model.User;

public interface AccountDao {
	
	public List<Account> getAllAlbums() throws SQLException;
	public List<Account> getAlbumsByID(int id) throws SQLException;
	public void insertAccount(Account account, User user) throws SQLException;
	
	

}
