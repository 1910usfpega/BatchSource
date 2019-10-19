package main.java.driver;

import main.java.accounts.AccountManagement;
<<<<<<< HEAD
import main.java.accounts.AccountManagementTest;
=======
>>>>>>> 345b7060f35c1b983db8784ff0a6dcad13624c5c
import main.java.bean.User;
import main.java.programstart.ProgramStart;
import main.java.users.UserAccountManagerTest;

public class Driver {
	public static void main(String[] args) {
		UserAccountManagerTest.readUserFile();
		System.out.println(UserAccountManagerTest.userList.toString());
		//ProgramStart.startProgram();
		//AccountManagement.transferFunds("kristhian");
		//AccountManagement.CreateSinglePersonSavingsAccount("kristhian");
		AccountManagement.getAccountsByName("kristhian");
	}
}
