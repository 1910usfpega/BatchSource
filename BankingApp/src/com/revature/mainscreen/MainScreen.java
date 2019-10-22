package com.revature.mainscreen;

import java.util.Scanner;

import com.revature.storage.Bank;
import com.revature.storage.ExportData;
import com.revature.storage.Import;
import com.revature.user.Admin;
import com.revature.user.Employee;

public class MainScreen {
	private static String input = "";

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank = Import.read();
		
		bank.addEmp(new Employee("GregSmith","1234"));
		bank.newEmployee("GregSmith", "1234");
		bank.addEmp(new Employee("DerronMarshall","2552"));
		bank.newEmployee("DerronMarshall", "2552");
		bank.addEmp(new Employee("SamuelFulton","4321"));
		bank.newEmployee("SamuelFulton", "4321");
		bank.addEmp(new Employee("Bob","111"));
		bank.newEmployee("Bob", "111");
		bank.addEmp(new Admin("TheBoss","admin"));
		bank.newEmployee("TheBoss", "admin");
		
		
		
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
				NewCustomerLoop.newCustomerLoop(sc,bank);
				break;
			case "2":
				CustomerLoop.customerLoop(sc,bank);
				break;
			case "3":
				EmployeeLoop.employeeLoop(sc,bank);
				break;
			case "4":
				AdminLoop.adminLoop(sc,bank);
				break;
			case "5":
				ExportData.write(bank);
				input = "EXIT";
				break;
			default:
				System.out.println("That is not a 1, 2, 3, 4 or 5. Try again");
			}
		}
		sc.close();
	}
}
