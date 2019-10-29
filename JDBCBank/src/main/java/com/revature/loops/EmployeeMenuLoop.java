package com.revature.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.beans.Employee;
import com.revature.daoimpl.AccountDaoImpl;
import com.revature.util.GlobalStorageSingletone;

public class EmployeeMenuLoop {
	public static Scanner sc = new Scanner(System.in);
	public static GlobalStorageSingletone gss = GlobalStorageSingletone.getInstance();
	
	public static void start() {
		AccountDaoImpl adi = new AccountDaoImpl();
		
		while (gss.getCurrentUser() != null) {
			Employee currentUser = (Employee) gss.getCurrentUser();
			List<String> commands = new ArrayList<String>();
			
			
			int countOfPending = adi.countOfAccountsWithStatus("pending");
			System.out.println("YOU ARE IN EMPLOYEE ACCOUNT");
			System.out.println("WELCOME, " + currentUser.getFirstName() + " " + currentUser.getLastName() + "!");
			System.out.println("There are "+countOfPending+" open applications for accounts\n");
			
			if (countOfPending > 0) {
				commands.add("Begin the account approve/deny process");
			}
			commands.add("View customers");
			commands.add("Exit");
			
			System.out.println("What would you like to do?");
			for (int i=0; i<commands.size(); i++) {
        		System.out.println((i+1) + ". "+ commands.get(i));
        	}
			System.out.print("Input number of action 1-" + commands.size()+": ");
			
			if (sc.hasNextInt()) {
        		Integer contentsFromUser = sc.nextInt();
        		if ( contentsFromUser <= commands.size() && contentsFromUser>0 ) {
        			if (commands.get(contentsFromUser-1).equals("Begin the account approve/deny process")) {
        				EmployeeApprovalLoop.start();
        			} else if (commands.get(contentsFromUser-1).equals("View customers")) {
        				EmployeeWorkWithCutomersLoop.start();
        			} else if (commands.get(contentsFromUser-1).equals("Exit")) {
        				System.out.println("You Exited from your account\n\n\n");
        				gss.setCurrentUser(null);
        				
        			}
        			
        		}
			} else {
				sc.nextLine();
			}
			
			
		}
	}
}
