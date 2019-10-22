package com.revature.bean;

import java.util.Scanner;

import com.revature.io.AccountsIO;

public class Employee extends User {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5119442774955543895L;
	public static Scanner sc= new Scanner(System.in);
	
	public Employee(String username, String password) {
		super(username, password, "employee");
	}
	
	@Override
	public void showMenu() {
		AccountsIO aIO = AccountsIO.getInstance();
		
		
		Boolean emp_flag = true;
		
		while (emp_flag) {
			System.out.println("\n\n\nEMPLOYEE ACCOUNT\n"
								   + "================\n");
			System.out.println("You have "+aIO.countOfAccountsWithStatus("pending")+" pending accounts");
			System.out.println("1. Logout");
			if (aIO.countOfAccountsWithStatus("pending") > 0) {
				System.out.println("2. Start approve pending accounts");
			}
			System.out.println("Input number of action:");
			if (sc.hasNextInt()) {
				Integer contentsFromUser = sc.nextInt();
				
				if (contentsFromUser.equals(1)) {
					// Logout
					emp_flag = false;
				} else if (contentsFromUser.equals(2) && aIO.countOfAccountsWithStatus("pending") > 0) {
					// Start approve loop
					Boolean approvalExitFlag = true;
					while (aIO.countOfAccountsWithStatus("pending")>0 && approvalExitFlag) {
						for (int i = 0; i<aIO.accountList.size(); i++) {
							if (aIO.accountList.get(i).getAccountStatus().equals("pending")) {
								Account accountWorkWith = aIO.accountList.get(i);
								System.out.println("Account: "+accountWorkWith.getAccountNumber());
								System.out.println("Approve? (y/n) or input X for Exit");
								if (sc.hasNext()) {
									String approveQ = sc.nextLine();
									if (approveQ.equals("y")) {
										accountWorkWith.setAccountStatus("active");
										aIO.writeToFile();
									} else if (approveQ.equals("n")){
										accountWorkWith.setAccountStatus("canceled");
										aIO.writeToFile();
									} else if (approveQ.equals("X")){
										// TODO Exit
										approvalExitFlag = false;
									}
								}
								break;
							}
						}
					}
				}
			}
		}
	}
	
	
}
