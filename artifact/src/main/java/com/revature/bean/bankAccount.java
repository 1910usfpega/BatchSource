package com.revature.bean;
import java.sql.SQLException;
import java.util.ArrayList;


import com.revature.daoimpl.BankDaoImpl;

public class bankAccount {
	static BankDaoImpl a = new BankDaoImpl();
	double amount;
	int ACCOUNTNUMBER;
	
	public bankAccount() {
		this.amount = 0;
		this.ACCOUNTNUMBER = 0;

	}
	public bankAccount(int a, double b) {
		this.amount = b;
		this.ACCOUNTNUMBER = a;

	}

	
	public boolean checkMoney(double money) {
		if(this.getBalance()>=  money)
			return true;
		return false;
	}
	
	public static bankAccount getBankAccount(int number) throws SQLException {
		
		
		return a.getAccount(number);
	}		
	
	public static ArrayList<bankAccount> getBankAccounts(String username) throws SQLException {
		return a.getAllAccounts(username);
	}		
	
	public void withraw(double amount) throws SQLException {
		if (this.checkMoney(amount)) {
			a.withdraw(amount, this.getAccountNumber());
		}
	}

	public void deposit(double deposit) throws SQLException {
		a.deposit(deposit, this.getAccountNumber());
	}
	
	public int getAccountNumber() {
		return this.ACCOUNTNUMBER;
	}
	
	public double getBalance() {
		return amount;
}
	

}

