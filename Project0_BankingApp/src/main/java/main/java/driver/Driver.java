package main.java.driver;

import main.java.accounts.AccountManagement;
import main.java.programstart.ProgramStart;
import main.java.users.UserAccountManager;

public class Driver {
	public static void main(String[] args) {
		//ProgramStart.startProgram();
		//AccountManagement.CreateSinglePersonAccount("Bob");
		System.out.println(UserAccountManager.isAccountValid("Bob", "FlatMap"));
	}
}
