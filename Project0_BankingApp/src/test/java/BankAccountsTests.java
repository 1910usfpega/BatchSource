import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

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
	@Test
	void TransferMoneyValidation() {
		
	}
	@Test
	void WithdrawMoneyValidation() {
		
	}
	@Test
	void DepositMoneyValidation() {
		
	}
}
