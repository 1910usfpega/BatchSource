package com.project.users;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person{

	List<bankAccount> bAccount = new ArrayList<>();



	public double viewAccount(bankAccount account) {
		if(bAccount.contains(account))
			return account.getBalance();
		return -1;
	}
	
	public void addBankAccount() {
		bankAccount a = new bankAccount();
		bAccount.add(a);
	}
	private void addBankAccount(bankAccount c) {
		bAccount.add(c);
	}
	public boolean transfer(double amount ,bankAccount takeAccount, bankAccount giveAccount) {
		if(bAccount.contains(takeAccount)) {
			if(bAccount.contains(giveAccount)) {
				takeAccount.withdraw(amount);
				giveAccount.deposit(amount);
				return true;
			}
		}	
		return false;
	}
	
	public boolean jointAccount(Customer a, Customer b,bankAccount c  ) {
		if(cInfo.containsKey(a)) {
			if(cInfo.containsKey(b)) {
				if(bAccount.contains(bAccount)) {
					b.addBankAccount(c);
					return true;
				}
			}
		}
		return false;
	}
	
	public int [] allAccounts() {
		int[] Array = new int[bAccount.size()];
		if(!bAccount.isEmpty()) {
			int i = 0;
			for(bankAccount x :this.bAccount ) {
				Array[i] = x.getAccountNumber();
				i++;
			}
		}
		return Array;
		
	}


	
}
