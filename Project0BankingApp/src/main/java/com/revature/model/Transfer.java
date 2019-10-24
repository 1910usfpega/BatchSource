package com.revature.model;

import com.revature.model.Account;

public interface Transfer {
	public void transfer(Account to, Account from, double transferAmount);
}
