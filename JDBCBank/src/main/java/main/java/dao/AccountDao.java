package main.java.dao;

import java.sql.SQLException;
import java.util.List;

import main.java.accounts.Account;

public interface AccountDao {
	List<Account>getAllAccounts() throws SQLException;
	public void addAccount(String accountType, String username, Double accountBalance) throws SQLException;
}
