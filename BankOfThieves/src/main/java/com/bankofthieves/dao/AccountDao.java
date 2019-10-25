package com.bankofthieves.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.bankofthieves.bean.Account;


public interface AccountDao {
	public List<AccId> getAllAccId(double boolean) throws SQLException;
	public List<AccType> getAccType(boolean type) throws SQLException;
	//pending who checks this and which class holds this?
	static ArrayList<Customer> pending = new ArrayList<>();
	static HashMap<Customer, Account> pendingTransaction = new HashMap<>();

	
}
