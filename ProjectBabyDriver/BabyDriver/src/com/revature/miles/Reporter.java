package com.revature.miles;

import java.util.ArrayList;
import java.util.List;

public class Reporter {
	 public Ledger ledger;
	 

	 	public Reporter(Ledger ledger) {
	 		this.ledger = ledger;
	 	}
	 	public int getNumAccounts() {
	 		int accounts = 0;
	 		for(Account currAccount: ledger.getAllAccounts()) {
	 		accounts++;
	 		}
	 		return accounts;
	 	}
	 	
	 	public int getNumAccountsByType(String type) {
	 		int countChecking = 0;
	 		int countSavings = 0;
	 		
	 		for (Account currAccount: ledger.getAllAccounts()) {
	 		if(currAccount instanceof CheckingAccount ) {
	 				countChecking++;
	 				
	 			}else if (currAccount instanceof SavingsAccount){countSavings++;
	 				}
	 		}
	 		if (type == "checking") {
	 			return countChecking;
	 		} else {
	 			return countSavings;
	 		}
	 		
	 		
	 		
	 		}
	 	public List<Account> getAccountsWithMinimum(double min){
	 		List<Account> accounts = new ArrayList();

	 		for(Account currAccount: ledger.getAllAccounts()) {
	 			if(currAccount.balance >= min) {
	 				accounts.add(currAccount);
	 			}
	 		}
	 		return accounts;
	 	}
	 	public void printAllAccounts() {
	 		
	 		List<Account> listOfAllAccounts = ledger.getAllAccounts();
	 		System.out.println(listOfAllAccounts);
	 	}
}
