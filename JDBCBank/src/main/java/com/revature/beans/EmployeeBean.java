package com.revature.beans;

import com.revature.daoimpl.AccountDaoImpl;

public class EmployeeBean extends UserBean{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4256248722180794907L;

	public EmployeeBean() {
		
	}
	
	public EmployeeBean(String username,String password) {
		super(username,password);
	}
	
	public void approveAccount(AccountBean acct) {
		AccountDaoImpl adi = new AccountDaoImpl();
		adi.removeApplicationFromDatabase(acct.getAccountNumber());
		adi.addAccountToDatabase(acct);
	}
	
	public void denyAccount(AccountBean acct) {
		AccountDaoImpl adi = new AccountDaoImpl();
		adi.removeApplicationFromDatabase(acct.getAccountNumber());
	}
	

	
	
}
