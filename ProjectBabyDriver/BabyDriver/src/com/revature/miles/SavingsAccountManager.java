package com.revature.miles;

public abstract class SavingsAccountManager implements AccountManager {
	@Override
	public boolean deposit( double amount) {
		double balance = amount;
		return false;
	}
	@Override
	public boolean withdraw( double amount) {
		
				double balance = 0;
				if (balance - amount <= 50) {
					System.out.println("Savings balance must be greater than $50");
					return false;
				}
			
			balance -= amount;
			return true;
	}

}
