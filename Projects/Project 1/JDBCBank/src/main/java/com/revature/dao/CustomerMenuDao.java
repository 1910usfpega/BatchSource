package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Account;

public interface CustomerMenuDao {
	public void customerMenu(String currentUser, int currentAccount) throws SQLException;
	public List<Account> checkBalances(int id) throws SQLException;
	public void deposit(int accountType, int accountNum, double depositAmount) throws SQLException;
	public void withdraw(int accountType, int accountNum, double withdrawAmount) throws SQLException;
	public void makeAccount(int newAccountType) throws SQLException;
	public void howManyAccounts(int currentAccount, int currentAccountType) throws SQLException;
}
