package yourworkhere;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Reporter {
	// Finished- field is Ledger ledger
	Ledger ledger;

	// Finished
	public Reporter(Ledger ledger) {
		// to refer to my field
		this.ledger = ledger;
	}

	
/*	public int getNumAccounts(String type) {
		int countChecking = 0;
		int countSavings = 0;
		List<Account> listOfAllAccounts = ledger.getAllAccounts();
		// this iterator will iterate over Account object
		Iterator<Account> listIter = listOfAllAccounts.iterator();
		
		while (listIter.hasNext()) {
			// this .next will move our reference along the list of items in our collection
			// it will return an item to the item it was jsut at
			Account currentAcc = listIter.next();
			if (currentAcc instanceof CheckingAccount) {
		
			}
			
		
		
	}*/
	
	int getNumAccounts() {
		return ledger.getAllAccounts().size();
	}

	public List<Account> getAccountsWithMinimum(double minimum) {
		
		List<Account> acc=new ArrayList<Account>(ledger.getAllAccounts());
		Iterator<Account> iterator = acc.iterator();
		while (iterator.hasNext()) {
			Account next = iterator.next();
			System.out.println(next);
		}
		// return a list of accounts that have the specified balance
		// make note to note use the minBalance in the savings account
		return acc;
		
	}
		
	public void printAllAccounts() {
		List<Account> acc = new ArrayList<Account>(ledger.getAllAccounts());
		Iterator<Account> iterator = acc.iterator();
		while (iterator.hasNext()) {
			Account next = iterator.next();
			System.out.println(next);
		}
		// loops through all accounts within the Ledger
		// prints the details of each account.
		// why is it useful to have overridden the toString() for the accounts??

	}
	// in the GUI the type of Account i want to report on will be given from the
		// dropdown menu
	public int getNumAccountByType(String type) {
		// return the current number of accounts within the Ledger
		int countChecking = 0;
		int countSavings = 0;
		// for loop with local variable Account currAccount
		//acc is a variable that holds the reference to the existing checkingAccounts
		for (Account acc : ledger.getAllAccounts()) {
			if (acc instanceof CheckingAccount) {
				countChecking++;
			
				//returning a value here will make the for loop stop after one acc search
				//useful if you want to search for a specific acc
			} else if(acc instanceof SavingsAccount) {
				countSavings++;
	
			}
		}
		int acc = type.equals("checking") ? countChecking : countSavings; 
		return acc;
		
	}
		// returns the number of accounts according to the type: "checking" or "savings"
	
	
}
