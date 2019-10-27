package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.model.Account;

public interface AccountDao {

	// public void insertAccount(Account account, User user) throws SQLException;

	public List<Account> getAllAccounts() throws SQLException;

	public List<Account> getAccountByID(String acct_id) throws SQLException;

	public int createAccount(Account account) throws SQLException;

	public int updateAccount(Account account) throws SQLException;

	public double getBalance(String acct_id) throws SQLException;

}
