package com.revature.control;

import java.util.Scanner;

import com.revature.control.LoginControl;
import com.revature.control.SessionControl;

public class Driver {

	public static void main(String[] args) {

		LoginControl login = new LoginControl();
		// show accounts from accounts list and employees list for tests
		login.showTestView();

		login.addToHashMap();
		System.out.println(login.getUsers().toString());
		System.out.print("1.) to Login \t 2.) to Sign up \t 3.) for Employees Login \t4) for Employees registration ");
		System.out.println(" \nYour choice: \n");

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
