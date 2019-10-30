package com.bank.bean;


public class Accounts {

	private int accountid;
	private int userid;
	private int adminid;
	private String accountType;
	private int accountnumber;
	private double balance;
	
	public Accounts() {
		
	}

	public int getAccountid() {
		return accountid;
	}

	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}

	public String getAccountname() {
		return accountType;
	}

	public void setAccountname(String accountType) {
		this.accountType = accountType;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Accounts(int accountid, int userid, int adminid, String accountType, int accountnumber, double balance) {
		super();
		this.accountid = accountid;
		this.userid = userid;
		this.adminid = adminid;
		this.accountType = accountType;
		this.accountnumber = accountnumber;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Accounts [accountid=" + accountid + ", userid=" + userid + ", adminid=" + adminid + ", accountname="
				+ accountType + ", accountnumber=" + accountnumber + ", balance=" + balance + "]";
	}
	
	
}
