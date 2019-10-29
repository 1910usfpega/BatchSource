package com.revature.bean;

public class Accounts {
	protected double balance;
	protected int accountID;
	protected String username;
	protected String password;
	double overdraftFee;

	public Accounts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Accounts(int accountID, String username, double balance) {
		super();
		this.accountID = accountID;
		this.username = username;
		this.balance = balance;
		
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
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

	

	public boolean deposit(double amount) {
		if (balance >= 0) {
			this.balance = this.balance + amount;
			return true;
		} else {
			return false;
		}

	}

	public boolean withdraw(double amount) {
		if (balance >= amount && amount > 0) {
			this.balance = this.balance - amount;
			return true;
		} else {
			return false;
		}

	}

	public void transfer(double amount) {
		withdraw(amount);
		deposit(amount);
	}
	
	public boolean delete() {
		if(balance==0) {
			return true;
		}else {
			return false;
		}
	}
	public void createNewAccount(double amount) {
		deposit(amount);
		
	}


	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", username=" + username + ", password=" + password
				+ ", overdraftFee=" + overdraftFee + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountID;
		long temp;
		temp = Double.doubleToLongBits(overdraftFee);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Accounts other = (Accounts) obj;
		if (accountID != other.accountID)
			return false;
		if (Double.doubleToLongBits(overdraftFee) != Double.doubleToLongBits(other.overdraftFee))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	

	
}