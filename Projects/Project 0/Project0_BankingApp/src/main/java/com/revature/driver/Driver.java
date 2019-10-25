package com.revature.driver;

import com.revature.accounts.AccountManagement;
import com.revature.programstart.ProgramStart;
import com.revature.users.UserAccountManagerTest;

public class Driver {
	public static void main(String[] args) {
		UserAccountManagerTest.readUserFile();
		System.out.println(UserAccountManagerTest.userList.toString());
		AccountManagement.readAccountFile();
		System.out.println(AccountManagement.accountList.toString());
		ProgramStart.startProgram();
	}
}
