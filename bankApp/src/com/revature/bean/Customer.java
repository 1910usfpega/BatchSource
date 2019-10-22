package com.revature.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Customer extends Person{
	List<bankAccount> bAccount = new ArrayList<>();
	static HashMap<String, Customer> matchUserName = new HashMap<>();
	
public Customer(String name, String last, String username,String password) {
	super(name, last,username,password);
	this.addBankAccount();
	list.add(this);
	matchUserName.put(username, this);
}

public static Customer getCustomer(String username) {
	Customer a = null;
	if(matchUserName.containsKey(username)) {
		a  = matchUserName.get(username);
	}
	return a;
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
public Integer[] viewAccount() {
	bankAccount [] b =this.allAccounts();
	Integer [] v =new Integer[b.length];
	int i = 0;
	for(bankAccount x: b) {
		v[i]=x.getAccountNumber();
		i++;
		}
	return v;
	}

public double viewAccountBalance(bankAccount account) { // check cash amount
	if(bAccount.contains(account))
		return account.getBalance();
	return -1;
}


public HashMap<Integer, bankAccount> getAccountChoose() {
	bankAccount [] b =this.allAccounts();
	
	HashMap<Integer,bankAccount> a= null;
	int j = 0;
	for(bankAccount x: b) {
		a.put(j, x);
		j++;
	}
		return a;
		}
	

	public boolean transfer(double amount ,bankAccount takeAccount, bankAccount giveAccount) { // fixit
		if(this.bAccount.contains(takeAccount)) {
			if(bankAccounts.contains(giveAccount)) {
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
	public bankAccount [] allAccounts() { // returns all account that the user has 
		bankAccount[] Array = new bankAccount[this.bAccount.size()];
		if(!this.bAccount.isEmpty()) {
			int i = 0;
			for(bankAccount x :this.bAccount ) {
				Array[i] = x;
				i++;
			}
		}
		return Array;
	}
}
