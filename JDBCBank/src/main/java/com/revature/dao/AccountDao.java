package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import com.revature.beans.AccountBean;

public interface AccountDao {
	public ArrayList<AccountBean> getAllApplications();
	public List<AccountBean> getAllAccounts();
	public AccountBean getAccountByAccountNumber(int acctnum);
	public AccountBean getApplicationByAccountNumber(int acctnum);
	public ArrayList<AccountBean> getAccountByUser(String user);
	public void updateAccount(AccountBean acct);
	public void addAccountToDatabase(AccountBean acct);
	public void removeAccountFromDatabase(int acct);
	public void removeApplicationFromDatabase(int acct);
	public void addApplicationToDatabase(AccountBean acct);


}
