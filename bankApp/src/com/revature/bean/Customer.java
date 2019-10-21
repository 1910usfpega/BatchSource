package com.revature.bean;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person{
	List<bankAccount> bAccount = new ArrayList<>();

public Customer(String name, String last, String username,String password) {
	super(name, last,username,password);
	this.addBankAccount();
	list.add(this);
}
public void addBankAccount() { // adds brand new account
	bankAccount a = new bankAccount(Person.getBankAccountsForIDCheck());
	bAccount.add(a);
	bankAccounts.add(a);
}
public boolean addBankAccount(bankAccount c) { //adds an existing account
	if(bankAccounts.contains(c)) {
	pending.add(this);
	return true;
	}
	return false;
}
public void viewAccount() {
	bankAccount [] b =this.allAccounts(this);
	for(bankAccount x: b)
		System.out.print(x.getAccountNumber());
	}

	public double viewAccountBalance(bankAccount account) { // check cash amount
		if(bAccount.contains(account))
			return account.getBalance();
		return -1;
	}

	public boolean transfer(double amount ,bankAccount takeAccount, bankAccount giveAccount) { 
		if(bAccount.contains(takeAccount)) {
			if(bAccount.contains(giveAccount)) {
				if(checkMoney(takeAccount, amount)) {
				takeAccount.withdraw(amount, takeAccount);
				giveAccount.deposit(amount);
				return true;
				}
			}
		}	
		return false;
	}
	
	
	public boolean jointAccount(Customer a ,bankAccount c) { //apply for
		if(cInfo.containsKey(a.getUsername())) {
			if(bankAccounts.contains(c)) {
	 pendingJoint.put(a, c);
			return true;
			}
		}
		return false;
	}
	public bankAccount [] allAccounts(Customer a) { // returns all account that the user has 
		bankAccount[] Array = new bankAccount[a.bAccount.size()];
		if(!a.bAccount.isEmpty()) {
			int i = 0;
			for(bankAccount x :this.bAccount ) {
				Array[i] = x;
				i++;
			}
		}
		return Array;
	}
}
