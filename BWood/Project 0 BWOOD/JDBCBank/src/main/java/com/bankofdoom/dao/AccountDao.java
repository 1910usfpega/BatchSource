package com.bankofdoom.dao;

import java.sql.SQLException;
import java.util.List;

import com.bankofdoom.bean.Account;
import com.bankofdoom.bean.User;

public interface AccountDao {

	public List<Account> getAllAccount() throws SQLException;

	public boolean removeAccount(Account closedAccount) throws SQLException;

	public void updateAccount(Account updateAccout) throws SQLException;

	public void createAccount(Account newAccout) throws SQLException;

	public List<Account> getAccounts(User u) throws SQLException;
	
}
