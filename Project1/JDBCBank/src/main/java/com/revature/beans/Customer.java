package com.revature.beans;

import java.util.List;

public class Customer {

	private int customer_id;
	private String user;
	private String pw;
	private String fName;
	private String lName;
	private List<BankAccount> accounts;

	public Customer() {
		super();
	}//End of no-arg constructor

	public Customer(int customer_id, String user, String pw, String fName, String lName) {
		super();
		this.customer_id = customer_id;
		this.user = user;
		this.pw = pw;
		this.fName = fName;
		this.lName = lName;
	}//End of full arg constructor

	public int getCustomer_id() {
		return customer_id;
	}//End of getter getCustomer_id

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}//End of setter setCustomer_id

	public String getUser() {
		return user;
	}//End of getter getUser

	public void setUser(String user) {
		this.user = user;
	}//End of setter setUser

	public String getPw() {
		return pw;
	}//End of getter getPw

	public void setPw(String pw) {
		this.pw = pw;
	}//End of setter setPw

	public String getFName() {
		return fName;
	}//End of getter getFName

	public void setFName(String fName) {
		this.fName = fName;
	}//End of setter setFName

	public String getLName() {
		return lName;
	}//End of getter getLName

	public void setLName(String lName) {
		this.lName = lName;
	}//End of setter setLName

	public List<BankAccount> getAccounts() {
		return accounts;
	}//End of getter getAccounts

	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}//End of setter setAccounts
	
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", user=" + user + ", pw=" + pw + ", fName=" + fName
				+ ", lName=" + lName + "]";
	}//End of method toString
	
	public void addAccount() {
		this.accounts.add(new BankAccount());
	}//End of method addAccount
	
	public void addAccount(int account_num, double balance, String user) {
		this.accounts.add(new BankAccount(account_num, balance, user));
	}//End of method with args addAccount
	
	//Return a formatted string used for displaying all accounts tied to this customer
	public String viewAccounts(){
		String accountString = "";
		accountString.concat("Accounts:\n"); 
		for(BankAccount b : this.accounts) {accountString.concat(b.getAccount_num() + "\n");};
		return accountString;
	}//End of method viewAccounts
	
}//End of Class Customer