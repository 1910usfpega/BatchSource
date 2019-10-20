package com.revature.miles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Ledger {
	private static final Ledger instance = new Ledger();
	 HashMap <String, Account> accounts = new HashMap<String, Account>();
		    
		private Ledger() {}

		
		public static Ledger getInstance(){
		    return instance;
		}
		public boolean store(Account account) {
			Set<String> keys = accounts.keySet();
			String key = account.getAccountID();
			for(String i : keys) {
				if(i == key) {
					System.out.println("Duplicate Account ID is not allowed");
					return false; 
				}
			}
			accounts.put(key,account);
			return true;
		}
		public Account retrieve(String accountID) {
			String key = accountID;
			Account account = accounts.get(key);
			return account;
		}
		public Account createAccount(String type, String password, String username) {
			
			String accountID = getNextAccountID();
			
			if(type == "checking") { 
				CheckingAccount account = new CheckingAccount(accountID, username, password);
				return account;
			}else
				
				{
				SavingsAccount account = new SavingsAccount(accountID, username, password, 0);
				return account;
				}	
		}
		public String getNextAccountID() {
			int size = accounts.size();
			String nextID = Integer.toString(size);
			return nextID;
		}
		public List<Account> getAllAccounts() {
			//return accounts.entrySet(); 
			List<Account> allAccounts = new ArrayList(accounts.values());
			return allAccounts;
		}

}
