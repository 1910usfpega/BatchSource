package com.revature.control;

import java.awt.Component;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Driver {

	public static void main(String[] args) {

		LoginControl login = new LoginControl();
		// show accounts from accounts list and employees list for tests
       login.showTestView();
		login.addToHashMap();
		System.out.println("USERS \n"+"================================== \n"+ login.getUsers().toString());
		System.out.println(" ");
		System.out.println(" Welcome To the New Age Bank! ");
		System.out.print("1.) to Login"+"\n"+"2.) to Sign up"+"\n"+"3.) for Employees Login"+"\n"+"4. ) for Employees registration ");
		System.out.println(" \n Your choice: ");

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		switch (input) {
		case 1:
			login.loginToAccount();
			SessionControl session = new SessionControl(login.getLoggedInto(), login.getAccounts());
			while (session.getIsLoggedIn()) {
				session.displayOptions();
				session.getMenuInput();
			}
			break;
		case 2:
			login.registerAccount();

					break;
		case 3:
			login.employeeLogin();
			SessionControl employeelsc = new SessionControl(login.getEmployeeLoggedIn(), login.employeeAccts, login.accounts);
			while (employeelsc.getisEmployeeLoggedin()) {
				employeelsc.displayEmployeeOptions();
				employeelsc.getEmployeeMenuInput();
			}
			break;
		case 4:
			login.registerEmployee();
			SessionControl employeeSession = new SessionControl(login.getEmployeeLoggedIn(), login.employeeAccts, login.accounts);
			while (employeeSession.getisEmployeeLoggedin()) {
				employeeSession.displayEmployeeOptions();
				employeeSession.getEmployeeMenuInput();
			}
			break;
		default:
			return;
		}
	}
}
