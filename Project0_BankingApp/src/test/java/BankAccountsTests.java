import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import javax.sql.rowset.spi.TransactionalWriter;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import main.java.bean.*;
import main.java.programstart.ProgramStart;
import main.java.accounts.Account;
import main.java.accounts.AccountManagement;
class BankAccountsTests extends AccountManagement{
	
	//Runs before each test start to open the file
	@Before public void Initialize() {
		readAccountFile();
	}
	//Check to make sure their are accounts stored in file
	@Test
	void VerifyAccountExists() {
		for (Account account : accountList) {
			if(account.getUsername() == null) {
				fail("Username of value: null exists. | Unexpected Behavior.");
			}
		}
	}
	//Verifies that transfering money work by setting a predetermined balance and accounts.
	@Test
	void TransferMoneyValidation() {
		readAccountFile();
		int numOfaccounts = 0;
		 ArrayList<Double> tempBal = new ArrayList<>();//Holds account ballance of current ammount.
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getUsername().contains("example")) {
				numOfaccounts = i;
				tempBal.add(accountList.get(i).getAccountBalance());
			}
		}
		int fromAcct = 0;
		if (fromAcct <= numOfaccounts) {
			int toAcct = 1;
			double dollarAmt = 0.0;
			if (toAcct <= numOfaccounts) {
				dollarAmt = 150.25;
			}
			for (int j = 0; j < accountList.size(); j++) {
				if (dollarAmt <= accountList.get(j).getAccountBalance()) {
					accountList.get(toAcct).setAccountBalance(accountList.get(toAcct).getAccountBalance()+dollarAmt);//adds funds to account
					accountList.get(fromAcct).setAccountBalance(accountList.get(fromAcct).getAccountBalance()-dollarAmt);//Remove funds from account.
					writeAccountFile();
				}
			}
		}
		//confirm money has been changed
		readAccountFile();
		for (Double Bal : tempBal) {
			for (Account account : accountList) {
				if(Bal == account.getAccountBalance()) {
					fail("Transaction failed: Money did not transfer successfuly.");
				}else {
					//Transaction successfully worked.
				}
			}
		}
	}
	@Test
	void WithdrawMoneyValidation() {
		readAccountFile();
		int numOfAccounts = 0;
		double dollarAmt = 0.0;
		ArrayList<Double> listAcct = new ArrayList<>();//Stores customers account temperately for functionality.
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getUsername().contains("example")) {
				listAcct.add(accountList.get(i).getAccountBalance());
			}
		}
		
			int selectedAcct = 1;//Money will be withdrawn from "example" account 1
			dollarAmt = 4.99;
			for (int j = 0; j < accountList.size(); j++) {
				for (int i = 0; i < listAcct.size(); i++) {
						if(accountList.get(j).getAccountBalance() == listAcct.get(selectedAcct)) {
							if(accountList.get(j).getAccountBalance() >= dollarAmt) {
								accountList.get(selectedAcct).setAccountBalance(accountList.get(selectedAcct).getAccountBalance()-dollarAmt);
							}else {
								fail("Transaction failed: Withdraw unscuccessful.");
							}
						}
					}
			}
			writeAccountFile();
	}
	
	@Test
	void DepositMoneyValidation() {
		readAccountFile();
		int numOfAccounts = 0;
		double dollarAmt = 0.0;
		ArrayList<Double> listAcct = new ArrayList<>();//Stores customers account temperately for functionality.
		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getUsername().contains("example")) {
				listAcct.add(accountList.get(i).getAccountBalance());
			}
		}
		
			int selectedAcct = 1;//Money will be deposited from "example" account 1
			dollarAmt = 150.79;
			for (int j = 0; j < accountList.size(); j++) {
				for (int i = 0; i < listAcct.size(); i++) {
						if(accountList.get(j).getAccountBalance() == listAcct.get(selectedAcct)) {
							if(dollarAmt >= 0.0) {
								accountList.get(selectedAcct).setAccountBalance(accountList.get(selectedAcct).getAccountBalance()+dollarAmt);
							}else {
								fail("Transaction failed: Withdraw unscuccessful.");
							}
						}
					}
			}
			writeAccountFile();
	
	}
	
}
