package com.revature.model;

public abstract class Account {

	protected int accountNumber;
	protected String username;
	protected String password;
	protected boolean approved;
	protected double balance;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accouuntNumber) {
		this.accountNumber = accouuntNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//check if acct approved?
	public void depositMoney(Double amountToDeposit){
		if (amountToDeposit >0) {
		balance += amountToDeposit;
		System.out.println("\nyour new balance is: "
				+ "" + getBalance());
		} else {
			System.out.println("Amount must be greater than 0");
		}
	}
	
	public void withdrawMoney(Double amountToWithdraw){
		if(getBalance() < amountToWithdraw && amountToWithdraw < 0 ){
			System.out.println("Invalid withdrawal request");
			
		}else
			setBalance(getBalance()-amountToWithdraw);
		System.out.println("\nyour new balance is: " + getBalance());
	}
	
	public void transfer(Account to, Account from, double transferAmount) {}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", username=" + username + ", approved=" + approved
				+ ", balance=" + balance + "]";
	}
	
	
}

