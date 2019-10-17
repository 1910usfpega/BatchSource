package com.revature.account;

public interface Transactions {
	// Clients can withdraw from, deposit to, and transfer to and from other accounts
	
	// Employers can withdraw from, deposit to and transfer from Client accounts but not TO clients
	// Employers will transfer to the main bank
	void withdraw(int value);
		
	public void deposit(int value);
		
	public void transferTo(Account theirs, int value);
		
	public void transferFrom(Account theirs, int value);
}
