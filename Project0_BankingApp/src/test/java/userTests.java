import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.internal.runners.InitializationError;
import org.junit.jupiter.api.Test;
import org.junit.platform.launcher.listeners.TestExecutionSummary.Failure;

import main.java.users.UserAccountManagerTest;

class userTests extends UserAccountManagerTest{

	//Runs before each test start to open the file
	@Before public void Initialize() {
		readUserFile();
	}
	//Testing to ensure that user "kristhian" exists in the Users.txt file.
	@Test
	void identifyUsers() {
	if(isAccountValid("kristhian", "password") == false) {
		fail("ERROR: User not identified in Users.txt");
		}	
	}
	//Testing to ensure that the account type is returning expected value.
	@Test
	void isAccountTypeValid() {
		if(getAccountType("example") != 2) {
			fail("ERROR: AccountType validation failed");
		}
	}
}
