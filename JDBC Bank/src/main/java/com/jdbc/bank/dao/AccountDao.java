package com.jdbc.bank.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.jdbc.bank.bean.Account;
import com.jdbc.bank.people.Customer;


public interface AccountDao {
	
	//result set to handle and store 
	//method use to handle whatever data structure
	public ArrayList<AccountDao> getAllAccId(double accType) throws SQLException;
	public ArrayList<Account> getAccType(boolean type) throws SQLException;
	//pending who checks this and which class holds this?
	//give the BankAdmin the role to use these methods
	static ArrayList<Customer> pending = new ArrayList<>();
	static HashMap<String, Double> pendingTransaction = new HashMap<>();
	public void removeAccount(Account closedAccount) throws SQLException;
	public void reviseAccounts(Account reviseAccount) throws SQLException;
	public void createAccounts(Account newAccout) throws SQLException;

	
}
