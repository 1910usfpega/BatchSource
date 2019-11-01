package com.jdbc.bank.bean;

public class Account {
	private int accID;
	private String acct_uname;
	private String accType;
	private double balance;

	public Account() {
		super();
	}

	public Account(int accID, String acct_uname, String accType, double balance) {
		super();
		this.accID = accID;
		this.acct_uname = acct_uname;
		this.accType = accType;
		this.balance = balance;
	}

	public int getAccID() {
		return accID;
	}

	public String getAcct_uname() {
		return acct_uname;
	}

	public String getAccType() {
		return accType;
	}

	public double getBalance() {
		return balance;
	}

	public void setAccID(int accID) {
		this.accID = accID;
	}

	public void setAcct_uname(String acct_uname) {
		this.acct_uname = acct_uname;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accID;
		result = prime * result + ((accType == null) ? 0 : accType.hashCode());
		result = prime * result + ((acct_uname == null) ? 0 : acct_uname.hashCode());
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (accID != other.accID)
			return false;
		if (accType == null) {
			if (other.accType != null)
				return false;
		} else if (!accType.equals(other.accType))
			return false;
		if (acct_uname == null) {
			if (other.acct_uname != null)
				return false;
		} else if (!acct_uname.equals(other.acct_uname))
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [accID=" + accID + ", acct_uname=" + acct_uname + ", accType=" + accType + ", balance="
				+ balance + "]";
	}

	
}
