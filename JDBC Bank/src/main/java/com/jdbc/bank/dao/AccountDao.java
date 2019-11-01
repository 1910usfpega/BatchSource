package com.jdbc.bank.dao;

import java.sql.SQLException;

import java.util.List;

import com.jdbc.bank.bean.Account;

public interface AccountDao {
	
	//result set to handle and store 
	//method use to handle whatever data structure
	public List<Account> getAllAccounts() throws SQLException;
	public List<Account> getAccId(String  uName) throws SQLException;
	public Account getAcct(int acct_number,  String uName) throws SQLException;
	
	public void updateAccount(Account account) throws SQLException;

//	decided to take this section out due to time.
	//pending who checks this and which class holds this?
	//give the BankAdmin the role to use these methods
	//static ArrayList<Customer> pending = new ArrayList<>();
	//static HashMap<String, Double> pendingTransaction = new HashMap<>();
	public void removeAccount(Account closedAccount) throws SQLException;
	public void createAccount(Account newAccount) throws SQLException;
	public double getBalance(int bank_account_id) throws SQLException;
	public void reviseAccountBalance(Account reviseAccount) throws SQLException;

	
}
