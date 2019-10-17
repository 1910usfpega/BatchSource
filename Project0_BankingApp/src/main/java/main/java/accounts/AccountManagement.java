package main.java.accounts;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import main.java.users.UserAccountManager;

public class AccountManagement {
	public static void CreateSinglePersonAccount(String username) {
			Scanner input = new Scanner(System.in);
			System.out.println("What kind of account would you like to create?");
			System.out.println("1. Checking\n 2. Savings");
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter("Accounts.txt", true));
				switch (input.nextInt()) {
				case 1:
					//Checking
					writer.append("Username: "+username+" %Checking: $0.00 \n");
					writer.close();
					break;
				case 2:
					//Savings
					writer.append("Username: "+username+" %Savings: $0.00 \n");
					writer.close();
					break;
				default:
					System.out.println("Invalid option.");
					break;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static void CreateJointAccount(String username01, String username02) {
		Scanner input = new Scanner(System.in);
		System.out.println("What kind of account would you like to create?");
		System.out.println("1. Checking\n 2. Savings");
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("Accounts.txt", true));
			switch (input.nextInt()) {
			case 1:
				//Checking
				writer.append("Username: Joint"+username01+"/"+username02+" %Checking: $0.00 \n");
				writer.close();
				break;
			case 2:
				//Savings
				writer.append("Username: Joint"+username01+"/"+username02+" %Savings: $0.00 \n");
				writer.close();
				break;
			default:
				System.out.println("Invalid option.");
				break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
