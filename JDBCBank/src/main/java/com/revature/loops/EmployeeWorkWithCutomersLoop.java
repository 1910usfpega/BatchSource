package com.revature.loops;

import java.util.List;
import java.util.Scanner;

import com.revature.beans.Customer;
import com.revature.daoimpl.UserDaoImpl;
import com.revature.util.GlobalStorageSingletone;

public class EmployeeWorkWithCutomersLoop {
	public static Scanner sc = new Scanner(System.in);
	public static GlobalStorageSingletone gss = GlobalStorageSingletone.getInstance();
	
	public static void start() {
		boolean EmployeeWorkWithCutomersLoopFlag = false;
		
		do {
			UserDaoImpl udi = new UserDaoImpl();
			System.out.println("\n\nALL BANK CUSTOMERS:");
			List<Customer> allBankCustomers = udi.getAllCustomers();
			
			for (Customer customer:allBankCustomers) {
				System.out.format("Id: %s (%s)| Full name: %s %s | Status: %s\n", 
						customer.getUserId(), 
						customer.getUsername(),
						customer.getFirstName(), 
						customer.getLastName(), 
						customer.getStatus()
						);
			}
			boolean stopFlag = true;
			
			while (stopFlag) {
				System.out.println("Input customer ID to work with specific customer \n"
						+ "or input X to come back to main menu");
				if (sc.hasNextInt()) {
					int customerId = sc.nextInt();
					if (checkIfCustomerIdExistsInList(customerId, allBankCustomers)) {
						EmployeeCustomerLoop.start();
						EmployeeWorkWithCutomersLoopFlag = true;
						stopFlag = false;
					}
				} else {
					String content = sc.nextLine().toLowerCase();
					if (content.equals("x")) {
						stopFlag = false;
					}
					
				}
			}
		} while (EmployeeWorkWithCutomersLoopFlag);
	}
	
	public static boolean checkIfCustomerIdExistsInList(int customerId, List<Customer> customersList) {
		for (Customer c:customersList) {
			if (c.getUserId().equals(customerId)) {
				return true;
			}
		}
		return false;
	}
}
