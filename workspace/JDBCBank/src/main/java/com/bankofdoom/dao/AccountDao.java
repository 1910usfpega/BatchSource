package com.bankofdoom.dao;

import java.sql.SQLException;
import java.util.List;

import com.bankofdoom.bean.Account;

public interface AccountDao {

	public List<Account> getAllAccount() throws SQLException;

	public void removeAccount(Account closedAccount) throws SQLException;

	public void updateAccounts(Account updateAccout) throws SQLException;

	public void createAccounts(Account newAccout) throws SQLException;
}
