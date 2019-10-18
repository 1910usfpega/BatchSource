package main.java.accounts;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.java.bean.User;
import main.java.programstart.ProgramStart;

public class AccountManagement {
	
	public static final String accountFile = "Account.txts";
	public static List<Account> accountList = new ArrayList<Account>();
	//Write accounts to file
	public static void writeAccountFile() {
		try(ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(accountFile));){
			objectOut.writeObject(accountList);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//Read accounts to file
	public static void readAccountFile() {
		try(ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(accountFile));){
			accountList = (ArrayList<User>) objectIn.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//Create a checking account for a single person
	public static void CreateSinglePersonCheckingAccount(String username) {
		System.out.println("Please enter initial deposit ammount.");
		Scanner scanner = new Scanner(System.in);
		accountList.add(new Account("Checking", username, scanner.nextDouble()));
		System.out.println("Account created.");
		writeAccountFile();
		ProgramStart.customerMenu(username);
	}
	//Create a Joint checking account between two people
	public static void CreateJointCheckingAccount(String usernameA, String usernameB) {
		System.out.println("Please enter initial deposit ammount.");
		Scanner scanner = new Scanner(System.in);
		accountList.add(new Account("Checking", usernameA+"/"+usernameB, scanner.nextDouble()));
		System.out.println("Account created.");
		ProgramStart.customerMenu(usernameA);
	}
	//Create a one person savings account.
	public static void CreateSinglePersonSavingsAccount(String username) {
		System.out.println("Please enter initial deposit ammount.");
		Scanner scanner = new Scanner(System.in);
		accountList.add(new Account("Savings", username, scanner.nextDouble()));
		System.out.println("Account created.");
		writeAccountFile();
		ProgramStart.customerMenu(username);
	}
	//Create a joint savings account between two people.
	public static void CreateJointSavingsAccount(String usernameA, String usernameB) {
		System.out.println("Please enter initial deposit ammount.");
		Scanner scanner = new Scanner(System.in);
		accountList.add(new Account("Savings", usernameA+"/"+usernameB, scanner.nextDouble()));
		System.out.println("Account created.");
		ProgramStart.customerMenu(usernameA);
	}
}
