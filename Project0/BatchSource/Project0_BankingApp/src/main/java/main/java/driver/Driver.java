package main.java.driver;

import main.java.accounts.AccountManagement;

import main.java.accounts.AccountManagement;

import main.java.bean.User;
import main.java.programstart.ProgramStart;
import main.java.users.UserAccountManagerTest;

public class Driver {
	public static void main(String[] args) {
		UserAccountManagerTest.readUserFile();
		System.out.println(UserAccountManagerTest.userList.toString());
		AccountManagement.readAccountFile();
		System.out.println(AccountManagement.accountList.toString());
		ProgramStart.startProgram();
		//AccountManagement.transferFunds("kristhian");
		//AccountManagement.CreateSinglePersonSavingsAccount("kristhian");
		//AccountManagement.getAccountsByName("kristhian");
	}
}
