package com.revature.bean;

public class Account {
	
	private int bank_Acc_ID;
	private int user_ID;
	private int accountType;
	private double accBalance;
	

	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int bank_Acc_ID, int user_ID, int accountType, double accBalance) {
		super();
		this.bank_Acc_ID = bank_Acc_ID;
		this.user_ID = user_ID;
		this.accountType = accountType;
		this.accBalance = accBalance;
	}

	public int getBank_Acc_ID() {
		return bank_Acc_ID;
	}

	public void setBank_Acc_ID(int bank_Acc_ID) {
		this.bank_Acc_ID = bank_Acc_ID;
	}

	public int getUser_ID() {
		return user_ID;
	}

	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}

	public int getAccountType() {
		return accountType;
	}

	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

	@Override
	public String toString() {
		return "Account [bank_Acc_ID=" + bank_Acc_ID + ", user_ID=" + user_ID + ", accountType=" + accountType
				+ ", accBalance=" + accBalance + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(accBalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + accountType;
		result = prime * result + bank_Acc_ID;
		result = prime * result + user_ID;
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
		Account other = (Account) obj;
		if (Double.doubleToLongBits(accBalance) != Double.doubleToLongBits(other.accBalance))
			return false;
		if (accountType != other.accountType)
			return false;
		if (bank_Acc_ID != other.bank_Acc_ID)
			return false;
		if (user_ID != other.user_ID)
			return false;
		return true;
	}
	
	
	

	

	

}
