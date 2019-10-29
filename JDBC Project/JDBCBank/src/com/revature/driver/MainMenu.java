package com.revature.driver;

import java.util.Scanner;

import com.revature.bean.Accounts;

import com.revature.bean.Users;

public class MainMenu {

	public static void main(String[] args) {

		System.out.println("Welcome to JDBC Bank!");
		System.out.println("New User or Returning User?");
		System.out.println("Enter 1 for User");

		System.out.println("Enter 2 for Admin");

		Scanner in = new Scanner(System.in);

		int key = in.nextInt();

		switch (key) {
		case 1:
			MainLoop.customerchoice(in);
			break;

		case 2:
			AdminLoop.adminchoice(in);
			break;

		default:
			System.out.println("Invalid Menu Option!");

		}

	}

}
