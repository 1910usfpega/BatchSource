package main.java.accounts;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.PublicKey;
import java.util.Scanner;

import main.java.programstart.ProgramStart;
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
					System.out.println("Checking account created successfully! \\n 1. Go to main menu \\n2. Add funds \\n");
					Scanner userInput = new Scanner(System.in);
					switch (userInput.nextInt()) {
					case 1:
						ProgramStart.startProgram();
						break;
					case 2:
						System.out.println("How much would you like to deposit?");
						Scanner getAmt = new Scanner(System.in);
						AddfundsToCheckingAccount(username, getAmt.nextDouble());
					default:
						break;
					}
					break;
				case 2:
					//Savings
					writer.append("Username: "+username+" %Savings: $0.00 \n");
					writer.close();
					System.out.println("Savings account created successfully! \n 1. Go to main menue \n2. Add funds \n");
					Scanner userInput02 = new Scanner(System.in);
					switch (userInput02.nextInt()) {
					case 1:
						ProgramStart.startProgram();
						break;
					case 2:
						System.out.println("How much would you like to deposit?");
						Scanner getAmt = new Scanner(System.in);
						AddfundsToSavingsAccount(username, getAmt.nextDouble());
						break;
					default:
						break;
					}
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
	public static void AddfundsToCheckingAccount(String Username, double ammount) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("Accounts.txt", true));
			Scanner reader = new Scanner(new File("Accounts.txt"));
			do {
				String line = reader.nextLine();
				double currentLineValue = reader.nextDouble();
				if (line.contains(Username) && line.contains("%Checking")) {
					currentLineValue+=ammount;
					line.replaceFirst(Double.toString(currentLineValue), Double.toString(ammount));
				} else {
					System.out.println("The username has no checking account.");
					
				}
			} while (reader.hasNextLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void AddfundsToSavingsAccount(String Username, double ammount) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("Accounts.txt", true));
			Scanner reader = new Scanner(new File("Accounts.txt"));
			do {
				String line = reader.nextLine();
				double currentLineValue = reader.nextDouble();
				if (line.contains(Username) && line.contains("%Savings")) {
					currentLineValue+=ammount;
					line.replaceFirst(Double.toString(currentLineValue), Double.toString(ammount));
				} else {
					System.out.println("The username has no checking account.");
					
				}
			} while (reader.hasNextLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
