package com.revature.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

//import com.revature.user.User;

public class Customer extends User {
	//private ArrayList<Account> myAccounts;
	private HashMap<Integer, Account> myAccounts;
	//private Employee myEmployee;
	
	
	public Customer(String username, String password) {
		super(username, password);
	}
	
	public Customer(String username, String password, Employee employee) {
		super(username, password);
		//this.myEmployee=employee; //get rid of this??
	}
	
	public Account getThisAccount(int acct) {
		return myAccounts.get(acct);
	}

	public void addNewAccount(Account acct) {
		this.myAccounts.put(acct.getAccountNumber(),acct);
	}
	
	public void addNewAccount(String accountType, Customer ... users) {
		Account newAccount=new Account(accountType, users);
		this.myAccounts.put(newAccount.getAccountNumber(),newAccount);
	}
	public void addNewAccount(String accountType, ArrayList<Customer> users) {
		Account newAccount=new Account(accountType, users);
		this.myAccounts.put(newAccount.getAccountNumber(),newAccount);
	}
	
	public void removeAccount(Account acct) {
		this.myAccounts.remove(acct.getAccountNumber());
	}
	
	public void removeAccount(int acct) {
		this.myAccounts.remove(acct);
	}
	
	
//	public void removeAccount(int acct) {
//		this.myAccounts.remove();
//	}
	
	public Set<Integer> getAccountNumbers(){
		return myAccounts.keySet();
	}
	
	public HashMap<Integer, Account> getMyAccounts() {
		return myAccounts;
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
	
	public void transfer(double amount, Account fromAcct, Account toAcct) {
		fromAcct.withdraw(amount);
		toAcct.deposit(amount);
	}
	

	public Customer() {
		
	}
//	public Employee getMyEmployee() {
//		return myEmployee;
//	}
//
//
//
//	public void setMyEmployee(Employee myEmployee) {
//		this.myEmployee = myEmployee;
//	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
	

}
