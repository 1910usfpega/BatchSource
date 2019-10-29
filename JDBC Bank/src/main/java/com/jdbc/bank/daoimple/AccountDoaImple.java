package com.jdbc.bank.daoimple;

import java.sql.SQLException;
import java.util.ArrayList;

import com.jdbc.bank.bean.Account;
import com.jdbc.bank.dao.AccountDao;

public class AccountDoaImple implements AccountDao {

	@Override
	public ArrayList<Account> getAllAccId() {
		
		return null;
	}

	@Override
	public ArrayList<Account> getAccType(boolean type) throws SQLException {
		return null;
	}

	@Override
	public ArrayList<Account> getAllAccId(Account uName) throws SQLException {
		return null;
	}

	@Override
	public void removeAccount(Account closedAccount) throws SQLException {
		
	}

	@Override
	public void reviseAccounts(Account reviseAccount) throws SQLException {
		
	}

	@Override
	public void createAccounts(Account newAccout) throws SQLException {
		
	}
		
		
	}

}
