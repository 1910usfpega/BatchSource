package com.revature.miles;

public class CheckingAccount extends Account {
	double overdraftFee;
	
	
	
	public CheckingAccount(){
		this.accountType = "checking";
		this.username = "Username";
		this.password = "Password";
		
	}
	
	
	public CheckingAccount(String accountID, String username, String password){
		this.accountID = accountID; 
		this.username = username;
		this.password = password;
		
		
		this.accountType = "checking";
			}
		
	public CheckingAccount(double balance, double overdraftFee) {
		this.balance = balance;
		this.overdraftFee = overdraftFee;
	}
	
	

	public double getOverdraftFee() {
		return this.overdraftFee;
	}
	
	public void setOverdraftFee(double overdraftFee) {
		 this.overdraftFee = overdraftFee;
	}


	@Override
	public String toString() {
		return "CheckingAccount [overdraftFee=" + overdraftFee + "]";
	}

	
	

	
	
	
	
}
