package com.revature.account;


import java.io.Serializable;

public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	
	String first;
	String last;	
	String employee;
	int ssn;
	double balance;
	double withdraw;
	double deposit;
	int firstDeposit;
	int accountNumber;
	int jointAccountNumber; 
	
	public Account(){
	}
	
	public Account(String first, String last, int ssn, String employee, int firstDeposit){
		this.first = first;
		this.last = last;
		this.ssn = ssn;
		this.employee = employee;
		this.balance = firstDeposit;
	}
	
	public Account(String first, String last, int ssn, int firstDeposit){
		this.first = first;
		this.last = last;
		this.ssn = ssn;
		this.firstDeposit = firstDeposit;
	}
	
	
	public int getJointAccountNumber() {
		return jointAccountNumber;
	}

	public void setJointAccountNumber(int jointAccountNumber) {
		this.jointAccountNumber = jointAccountNumber;
	}

	public int getFirstDeposit() {
		return firstDeposit;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((last == null) ? 0 : last.hashCode());
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
		if (last == null) {
			if (other.last != null)
				return false;
		} else if (!last.equals(other.last))
			return false;
		return true;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(double withdraw) {
		if(withdraw < balance) {
			balance -= withdraw;
			System.out.println("New Balance = "+ balance);
		}else {
			System.out.println("Too little funds. Balance = "+balance);
		}
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.balance += deposit;
		System.out.println("New balance = "+ balance);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Account [first=" + first + ", last=" + last + ", employee=" + employee + ", ssn=" + ssn + ", balance=" + balance+ " ]" ;
	}
	
	
	

}
