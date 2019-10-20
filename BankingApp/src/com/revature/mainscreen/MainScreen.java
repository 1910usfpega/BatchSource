package com.revature.mainscreen;

import java.util.Scanner;

import com.revature.storage.EmployeeLoginInfo;
import com.revature.storage.EmployeeStorage;
import com.revature.user.Admin;
import com.revature.user.Employee;

public class MainScreen {
	private static String input = "";

	public static void main(String[] args) {
		EmployeeStorage.add(new Employee("GregSmith","1234"));
		EmployeeLoginInfo.newEmployee("GregSmith", "1234");
		EmployeeStorage.add(new Employee("DerronMarshall","2552"));
		EmployeeLoginInfo.newEmployee("DerronMarshall", "2552");
		EmployeeStorage.add(new Employee("SamuelFulton","4321"));
		EmployeeLoginInfo.newEmployee("SamuelFulton", "4321");
		EmployeeStorage.add(new Employee("Bob","111"));
		EmployeeLoginInfo.newEmployee("Bob", "111");
		EmployeeStorage.add(new Admin("TheBoss","admin"));
		EmployeeLoginInfo.newEmployee("TheBoss", "admin");
		
		
		
		ReadFromFile.readCustomers();

		Scanner sc = new Scanner(System.in);
		while (input != "EXIT") {

			System.out.println("Press 1 if you are not yet a customer");
			System.out.println("Press 2 if you are a customer");
			System.out.println("Press 3 if you are an employee");
			System.out.println("Press 4 if you are the admin");
			System.out.println("Press 5 to exit.");

			input = sc.nextLine();

			switch (input) {
			case "1":
				NewCustomerLoop.newCustomerLoop(sc);
				break;
			case "2":
				CustomerLoop.customerLoop(sc);
				break;
			case "3":
				EmployeeLoop.employeeLoop(sc);
				break;
			case "4":
				AdminLoop.adminLoop(sc);
				break;
			case "5":
				WriteToFile.writeCustomers();
				input = "EXIT";
				break;
			default:
				System.out.println("That is not a 1, 2, 3, 4 or 5. Try again");
			}
		}
		sc.close();
	}
}
