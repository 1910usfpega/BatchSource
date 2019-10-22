package com.revature.user;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import com.revature.storage.Bank;


public class Customer extends User {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2627095195643602020L;
	//private ArrayList<Account> myAccounts;
	private HashMap<Integer, Account> myAccounts= new HashMap<Integer, Account>();
	private HashMap<Integer, Account> myApplications= new HashMap<Integer, Account>();
	
	
	public Customer(String username, String password) {
		super(username, password);
	}
	
	
	public Account getThisAccount(int acct) {
		return myAccounts.get(acct);
	}

	public Account getThisApplication(int acct) {
		return myApplications.get(acct);
	}
	
	public void addNewApplication(Account acct) {
		this.myApplications.put(acct.getAccountNumber(),acct);
	}

	public void addNewAccount(Account acct) {
		this.myAccounts.put(acct.getAccountNumber(),acct);
	}
	
	public void addNewAccount(Bank bank,String accountType, Customer ... users) {
		Account newAccount=new Account( bank, accountType, users);
		this.myAccounts.put(newAccount.getAccountNumber(),newAccount);
	}
	public void addNewAccount(Bank bank,String accountType, ArrayList<Customer> users) {
		Account newAccount=new Account(bank, accountType, users);
		this.myAccounts.put(newAccount.getAccountNumber(),newAccount);
	}
	
	public void removeAccount(Account acct) {
		this.myAccounts.remove(acct.getAccountNumber());
	}
	
	public void removeAccount(int acct) {
		this.myAccounts.remove(acct);
	}
	public void removeApplication(Account acct) {
		this.myApplications.remove(acct.getAccountNumber());
	}
	
	public void removeApplications(int acct) {
		this.myApplications.remove(acct);
	}
	
	
	public Set<Integer> getAccountNumbers(){
		return myAccounts.keySet();
	}
	
	public HashMap<Integer, Account> getMyAccounts() {
		return myAccounts;
	}
	
	public Collection<Account> getOnlyAccounts() {
		return myAccounts.values();
	}


	public Collection<Account> getOnlyApplications() {
		return myApplications.values();
	}

	public HashMap<Integer, Account> getMyApplications() {
		return myApplications;
	}


	public void setMyApplications(HashMap<Integer, Account> myApplications) {
		this.myApplications = myApplications;
	}


	public void setMyAccounts(HashMap<Integer, Account> myAccounts) {
		this.myAccounts = myAccounts;
	}

	public double withdraw(double amount, Account acct) {
		return acct.withdraw(amount);
	}
	
	public double deposit(double amount, Account acct) {
		return acct.deposit(amount);
	}
	
	public Customer() {
		
	}
}
