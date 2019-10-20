package com.revature.miles;

public abstract class Transfer implements AccountManager {
	public static void transfer(AccountManager from, AccountManager to, double amount)
	{
	    from.withdraw(amount);
	    to.deposit(amount);
	}

}
