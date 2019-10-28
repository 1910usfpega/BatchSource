package com.revature.beans;

import com.revature.exception.WithdrawTooMuchException;

public class Accounts {

	private String accounts_username;
	private int accounts_accountnumber;
	private double accounts_accountbalance;
	private String accounts_accounttype;
	
	public void Deposit(double amount) {
		this.accounts_accountbalance= this.accounts_accountbalance+amount;
	}
	
//	public void Withdraw(double amount) {
//		this.accounts_accountbalance= this.accounts_accountbalance-amount;
	
	public void withdraw(double amount1) throws WithdrawTooMuchException {
        double maxWithdrawAmount = accounts_accountbalance;
        if (amount1 < 0) {
            System.out.println("Cannot withdraw negative number");
        } else if (amount1 <= accounts_accountbalance) {
            accounts_accountbalance -= amount1;
            System.out.println("New Balance = " + accounts_accountbalance);
        } else if(amount1 > maxWithdrawAmount) {
            //throw a custom exception here
            throw new WithdrawTooMuchException(amount1 + " exceeds the max withdraw limit of: " + maxWithdrawAmount);
        }
        
}
	public Accounts(String type, String name) {
		this.accounts_accounttype= type;
		this.accounts_username= name;
		this.accounts_accountbalance=0.00;
		this.accounts_accountnumber= (int) (Math.random()*10000);
		
	}
	
	public String getAccounts_username() {
		return accounts_username;
	}
	public void setAccounts_username(String accounts_username) {
		this.accounts_username = accounts_username;
	}
	public int getAccounts_accountnumber() {
		return accounts_accountnumber;
	}
	public void setAccounts_accountnumber(int accounts_accountnumber) {
		this.accounts_accountnumber = accounts_accountnumber;
	}
	public double getAccounts_accountbalance() {
		return accounts_accountbalance;
	}
	public void setAccounts_accountbalance(double accounts_accountbalance) {
		this.accounts_accountbalance = accounts_accountbalance;
	}
	public String getAccounts_accounttype() {
		return accounts_accounttype;
	}
	public void setAccounts_accounttype(String accounts_accounttype) {
		this.accounts_accounttype = accounts_accounttype;
	}
	@Override
	public String toString() {
		return "Accounts [accounts_username=" + accounts_username + ", accounts_accountnumber=" + accounts_accountnumber
				+ ", accounts_accountbalance=" + accounts_accountbalance + ", accounts_accounttype="
				+ accounts_accounttype + "]";
	}
	public Accounts(String accounts_username, int accounts_accountnumber, double accounts_accountbalance,
			String accounts_accounttype) {
		super();
		this.accounts_username = accounts_username;
		this.accounts_accountnumber = accounts_accountnumber;
		this.accounts_accountbalance = accounts_accountbalance;
		this.accounts_accounttype = accounts_accounttype;
	}
	public Accounts() {
		super();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public Accounts(String accounttype, int accountnumber, double accountbalance, String users_username,
//			int users_usertype_id) {
//		super();
//		this.accounttype = accounttype;
//		this.accountnumber = accountnumber;
//		this.accountbalance = accountbalance;
//		this.users_username = users_username;
//		this.users_usertype_id = users_usertype_id;
	}
	
//	
//	public String getUsers_username() {
//		return users_username;
//	}
//	public void setUsers_username(String users_username) {
//		this.users_username = users_username;
//	}
//	public int getUsers_usertype_id() {
//		return users_usertype_id;
//	}
//	public void setUsers_usertype_id(int users_usertype_id) {
//		this.users_usertype_id = users_usertype_id;
//	}
//	public String getAccounttype() {
//		return accounttype;
//	}
//	public void setAccounttype(String accounttype) {
//		this.accounttype = accounttype;
//	}
//	public int getAccountnumber() {
//		return accountnumber;
//	}
//	public void setAccountnumber(int accountnumber) {
//		this.accountnumber = accountnumber;
//	}
//	public double getAccountbalance() {
//		return accountbalance;
//	}
//	public void setAccountbalance(double accountbalance) {
//		this.accountbalance = accountbalance;
//	}
//	@Override
//	public String toString() {
//		return "Account [accounttype=" + accounttype + ", accountnumber=" + accountnumber + ", accountbalance="
//				+ accountbalance + ", users_username=" + users_username + ", users_usertype_id=" + users_usertype_id
//				+ "]";
//	}
//	
//	public Accounts() {
//		super();
//		
//	}
//	
//
//}
