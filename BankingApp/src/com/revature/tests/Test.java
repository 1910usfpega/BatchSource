package com.revature.tests;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.revature.storage.EmployeeLoginInfo;
import com.revature.storage.EmployeeStorage;
import com.revature.user.Employee;

public class Test {

	public static void main(String[] args) {
		EmployeeStorage.add(new Employee("Bob","111"));
		EmployeeLoginInfo.newEmployee("Bob", "111");
		Scanner sc = new Scanner(System.in);

		// Start by entering username and the password
		String input = "";
		Employee thisEmployee = new Employee();
		boolean loggedIn = false;
		while (loggedIn == false) {
			System.out.println("Enter your username. (Enter \"back\" to go back)");
			String ru = sc.nextLine();
			if (ru.toLowerCase().equals("back")) {
				return;
			}
			System.out.println("Enter your password.");
			String rp = sc.nextLine();
			if (EmployeeLoginInfo.checkEmployee(ru, rp) == true) {
				thisEmployee = EmployeeStorage.getThisEmployee(ru);
				loggedIn = true;
			}else {
				System.out.println("invalid username or password");
			}
		}
		
		sc.close();

	}

}
