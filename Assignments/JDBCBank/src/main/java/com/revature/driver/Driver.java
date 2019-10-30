package com.revature.driver;

import java.util.Scanner;

import com.revature.menuinterface.LogIn;
import com.revature.menuinterface.Registration;

public class Driver {

	public static void main(String[] args) {
		
		String input = "";
		Registration r = new Registration();
		LogIn l = new LogIn();
			
		Scanner sc = new Scanner(System.in);
		
			while (input != "EXIT") {
				
				LogIn.clearScreen();

				System.out.println("||*****************************************||");
				System.out.println("||     Please enter a menu option:         ||");
				System.out.println("||=================***=====================||");
				System.out.println("|| Press 1 - Register                      ||");
				System.out.println("|| Press 2 - Log In                        ||");
				System.out.println("|| Press 3 - Exit                          ||");
				System.out.println("||*****************************************||");

				input = sc.nextLine();

				switch (input) {
				case "1":
					r.register(sc);
					break;
				case "2":
					l.logInto(sc);
					break;
				case "3":
					System.out.println("GoodBYE.");
					input = "EXIT";
					break;
				default:
					System.out.println("!!!!! INVALID INPUT !!!!!");
					System.out.println("(:--PLease Try Again--:)");
				}
			}
			sc.close();
		}
	
	
	

	

}
