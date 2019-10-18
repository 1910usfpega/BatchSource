package com.revature.user;

import java.util.ArrayList;

//import com.revature.user.User;

public class Customer extends User {
	private ArrayList<Account> myAccounts;
	private Employee myEmployee;
	
	
	
	public Customer(String username, String password, Employee employee) {
		super(username, password);
		this.myEmployee=employee; //get rid of this??
	}
	
	

	public void addNewAccount(Account acct) {
		this.myAccounts.add(acct);
	}
	
	public void addNewAccount(String accountType, Customer user1, boolean joint) {
		Account newAccount=new Account(accountType, user1, joint);
		this.myAccounts.add(newAccount);
	}
	public void addNewAccount(String accountType, Customer user1, boolean joint, Customer user2) {
		Account newAccount=new Account(accountType, user1, joint, user2);
		this.myAccounts.add(newAccount);
	}
	
	public void removeAccount(Account acct) {
		this.myAccounts.remove(acct);
	}
	
//	public void removeAccount(int acct) {
//		this.myAccounts.remove();
//	}
	
	
	public ArrayList<Account> getMyAccounts() {
		return myAccounts;
	}





	public void setMyAccounts(ArrayList<Account> myAccounts) {
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
	

	public Employee getMyEmployee() {
		return myEmployee;
	}



	public void setMyEmployee(Employee myEmployee) {
		this.myEmployee = myEmployee;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
	

}
