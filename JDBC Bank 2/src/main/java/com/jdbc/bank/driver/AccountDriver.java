package com.jdbc.bank.driver;

import java.sql.SQLException;
import java.util.ArrayList;

import com.jdbc.bank.bean.Account;
import com.jdbc.bank.bean.User;
import com.jdbc.bank.dao.AccountDao;
import com.jdbc.bank.exception.OverDraftException;

public class AccountDriver implements AccountDao {
	
	//account of tyoe Account 
	static Account account ;
	
	public AccountDriver() {
		super();
	}

	public void AccountDriver(Account account) {
		this.account = account;
	}
	
	private static AccountDriver atm = new AccountDriver();
	

	public static boolean deposit(double depAmount) {
		
		if (depAmount <= 0) {
			System.out.println("Deposit transaction cannot be completed." +
					"/n Deposit amount cannot be 0 or a negative transaction.");
			return false;
		} else {
//			updates balance after deposit
			account.setBalance(account.getBalance() + depAmount);
			System.out.println("Desposit successful" + account.getBalance());
			return true;
		}
	}		
	
		public boolean withdraw(double wAmount) throws OverDraftException {
			double overDraftFee = 50;
			if (wAmount <= 0) {
				System.out.println("Withdrawal amount is invalid");
				return false;
		
			} else if (wAmount > account.getBalance()) {
		try {	account.setBalance(account.getBalance() - (wAmount + overDraftFee));
				}
			catch (RuntimeException e) {
				e.printStackTrace();
				System.out.println("OverDraftFeeApplied!" + " A fee of $50 has been applied.");
				System.out.println("OverDraft Exception made.");
			}
		
			} else if (wAmount <= account.getBalance()) {
				account.setBalance(account.getBalance() - wAmount);
				System.out.println("Current Balance:" + account.getBalance());
			}
			return true;
		}
	
	
	public static boolean transfer(Account accID, double transferAmount) {
		// atm goes here
		if (transferAmount <= 0) {
			System.out.println("Transfer amount is invalid");
			return false;
		} 
		
		return false;
	}

	@Override
	public ArrayList<Account> getAllAccId(ArrayList<Account> uName) throws SQLException {
		ArrayList<Account> accID = new ArrayList<Account>();
		for(Account i : accID)
			System.out.println(i);
//		for (int i = 0; i < accID.size() ; i++)  
//            System.out.print(accID.get(i) + " "); 
		if (accID.equals(uName)) {
			System.out.println("Account found asscoiated with Username");
			return uName;
		}
		return null;
	}
	  

	@Override
	public ArrayList<Account> getAccType(boolean type) throws SQLException {
		return null;
	}

	@Override
	public void removeAccount(Account closedAccount) throws SQLException {
		
	}

	@Override
	public void reviseAccounts(Account reviseAccount) throws SQLException {
		
	}

	@Override
	public void createAccounts(Account newAccout) throws SQLException {
		
	}
}
