package com.revature.controller;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu extends Input {
	
	public Menu() {
		super();
	}
	
	Input input = new Input();
	
	public void initialMenu() throws SQLException {
		int choice;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to your Bank");
		System.out.println("1.) To Sign up for a new user account");
		System.out.println("2.) To Log in to an exisiting account");
		System.out.println("3.) To exit the program");
		System.out.println("Please make a selection");
		
		do {
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				createUserAccount();
				System.out.println("now select 2 to log in to your account");
				break;
			case 2: 
				input.userLogin();
				break;
			case 3:
				System.out.println("Thank you and See you soon");
				break;
				
			default:
				System.out.println("enter a choice from 1 to 3");
			}
		} while(choice !=3);


	}
	

}
