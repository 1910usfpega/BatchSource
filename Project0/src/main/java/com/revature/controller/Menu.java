package com.revature.controller;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu extends Input {
	
	public Menu() {
		super();
	}
	
	Input input = new Input();
	
	public void welcomeMenu() throws SQLException {
		int choice;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome");
		System.out.println("1.) To create a new User Account");
		System.out.println("2.) To log in to an exisiting account");
		System.out.println("3.) Create a new Bank Account");
		System.out.println("4.) To exit the program");
		System.out.println("Please make a selection");
		
		do {
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				createUserAccount();
				System.out.println("now select 2 to log in to your account");
				break;
			case 2: 
				input.login();
				break;
			case 3:
				
				break;
			case 4:
				System.out.println("Thank you and See you soon");
				break;
				
			default:
				System.out.println("enter a choice from 1-4");
			}
		} while(choice !=4);


	}
	

}
