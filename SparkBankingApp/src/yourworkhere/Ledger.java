package yourworkhere;

import java.util.ArrayList;
//JUST FILL IN EACH METHOD
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import java.util.List;

public class Ledger {
	// single instance of Ledger
	private static final Ledger instance = new Ledger();
	private Map<String, Account> accounts = new HashMap<>();

	// no-args constructor
	private Ledger() {
	}

	// to return a single instance of Ledger
	public static Ledger getInstance() {
		return instance;
	}

	// THIS METHOD IS FINISHED
	public boolean store(Account account) {
		if (accounts.containsKey(account.accountID)) {
			accounts.put(account.accountID, account);
			System.out.println("Contains an account: account updated:" + account.accountID);
			return false;
		} else {
			accounts.put(account.accountID, account);
			System.out.println("New account added:" + account.accountID);
			return true;
		}
	}

	// NOT FINISHED
	public Account retrieve(String accountID) {
		// How to I set of the if statement?
		if(accounts.get(accountID) != null) {
			return accounts.get(accountID);
		} else {	
			// if none is found return null	
			return null;
		}
			
	}

	// NOT FINISHED
	public Account createAccount(String type, String firstName, String lastName) {
		switch (type.trim().toLowerCase()) {
		case "checking":
			// create new account and returns new Account object with the parameters above
			// You have to create the project indirectly
			Account checkingAccount = new CheckingAccount(instance.getNextAccountID(), firstName, lastName);
			// TODO: Based on type
			// call the CheckingAccount constructor
			instance.store(checkingAccount);
			return checkingAccount;
			
		case "savings":
			// or the SavingsAccount constructor
			Account savingsAccount = new CheckingAccount(instance.getNextAccountID(), firstName, lastName);
			// call the constructors that take in id, firstName, lastName
			// id should come from getNextAccountID()

			// need to store the new account within the account map
			instance.store(savingsAccount);
			return savingsAccount;
		default:
			return null;
		}
	}

	public String getNextAccountID() {
		// finds the next accountID within the map
		// return the size of account Map plus one
		return Integer.toString(accounts.size() + 1);
		// ++ was invalid
	}

	public List<Account> getAllAccounts() {
		// returns a list of all of the Accounts within the account Map
		return new ArrayList<Account>(accounts.values());
	}

}
