package main.java.programstart;

import java.util.Scanner;

import main.java.accounts.AccountManagement;
import main.java.bean.User;
import main.java.users.UserAccountManager;
import main.java.users.UserAccountManagerTest;

public class ProgramStart {
	
	//PSEUDOCODE IS IN ALL CAPS
		//OR ACTUALLY COMMENTS THAT AREN'T JUST COMMENTED OUT CODE
		
		//creates scanner for user input
		static Scanner input = new Scanner(System.in);
		
		static int pwAttempts; //LIMITS PASSWORD TRY ATTEMPTS, CAN BE ALTERED IF WE WANT
		
		
		//BASICALLY START
		public static void startProgram() {
			
			pwAttempts = 3;
			
			System.out.println("Welcome to DeoliRight Bank! \n");
			System.out.println("Do you have an account with us? Y/N");
			String answer = input.nextLine(); //USER INPUT OF Y/N
			System.out.println();
			
			//Y WILL SEND TO LOGINUSERNAME() METHOD
			if (answer.equals("y") || answer.equals("Y")) {
				login();
			}
			//N WILL SEND TO NOACCOUNT() METHOD
			else if (answer.equals("n") || answer.equals("N")) {
				noAccount();	
			}
			//USER INPUTS INVALID RESPONSE, RESTARTS
			else {
				System.out.println("Invalid input.\n");
				System.out.println("////////////////////\n");
				startProgram();
			}
		
		}
		
		//ASKS TO ENTER YOUR USERNAME
		public static void login() {
			System.out.println("Enter your Username: ");
			String user = input.nextLine();
			System.out.println();
			System.out.print("Enter your Password: ");
			System.out.println();
			String pw = input.nextLine();
			System.out.println();
			if(UserAccountManagerTest.isAccountValid(user, pw) == true) {
				System.out.println("Login Success!\n");
//				UserAccountManager.getAccountType(user);
//				if (UserAccountManager.getAccountType(user) == "Administrator") {
//					adminMenu();
//				}
//				else if (UserAccountManager.getAccountType(user) == "Customer") {
//					customerMenu(user);
//				}
//				else if (UserAccountManager.getAccountType(user) == "Employee") {
//					employeeMenu();
//				}
			}
			else if(UserAccountManagerTest.isAccountValid(user, pw) == false) {
				pwAttempts--;
				if(pwAttempts > 0) {
					System.out.println("Username and/or Password is incorrect! Please try again\n");
					login(); //LETS YOU TRY TO LOGIN AGAIN W/ ONE LESS ATTEMPT
				}
				else {
					System.out.println("Too many failed login attempts; please try again later.\n");
					System.out.println("////////////////////\n");
					startProgram();
					//THIS RESTARTS THE PROGRAM/SENDS BACK TO MAIN MENU
				}
			}
		}
		
		//ASKS IF YOU WANT TO MAKE A NEW ACCOUNT
		public static void noAccount() {	
			System.out.println("Would you like to create an account? Y/N");
			String answer = input.nextLine();
			//SENDS YOU TO CREATNEWACCOUNT()
			if (answer.equals("y") || answer.equals("Y")) {
				createNewAccount();
			}
			//UH WHY ARE YOU HERE, RESTARTS PROGRAM
			else if (answer.equals("n") || answer.equals("N")) {
				System.out.println();
				System.out.println("////////////////////\n");
				startProgram();
			}
			//USER INPUTS INVALID RESPONSE, ASKS AGAIN
			else {
				System.out.println("Invalid input.\n");
				System.out.println("////////////////////\n");
				noAccount();
			}
		}
		
		public static void createNewAccount() {
			System.out.println("Please enter a Username for your new account: ");
			String user = input.nextLine();
			//doesUsernameExist();

			//VALIDATES PASSWORD IN CASE USER FAT FINGERED
			int passCheck = 0;
			String pw = "";
			String pwc = "";
			while(passCheck == 0) {
				System.out.println("Please enter a Password for your new account: ");
				pw = input.nextLine();
				System.out.println("Please confirm your Password for your new account: ");
				pwc = input.nextLine();
					if (pw.equals(pwc)) {
						passCheck = 1;
					}
					else {
						System.out.println("Passwords did not match! Please try again!\n");
						System.out.println("////////////////////\n");
						pw = "";
						pwc = "";
						continue;
					}
			}
			
			System.out.println("Please enter your full name (First Last) for your new account: ");
			String name = input.nextLine();
			
			//CONFIRMS ALL INFORMATION IS CORRECT
			int inputCheck = 0;
			while(inputCheck == 0) {
				System.out.println("Is the following information correct?\n Username: " + user + "\n Password: " + pw + "\n Full Name: " + name);                               
				String answer = input.nextLine();
				//SENDS YOU TO CUSTOMER MENU()
				if (answer.equals("y") || answer.equals("Y")) {
					inputCheck = 1;
				}
				//INCORRECT INFO, TRY AGAIN
				else if (answer.equals("n") || answer.equals("N")) {
					System.out.println();
					System.out.println("////////////////////\n");
					user = "";
					pw = "";
					pwc = "";
					name = "";
					inputCheck = 2;
				}
				//USER INPUTS INVALID RESPONSE, ASKS AGAIN
				else {
					System.out.println("Invalid input.\n");
					System.out.println("////////////////////\n");
					continue;
				}
			}
			if(inputCheck == 1) {
				UserAccountManagerTest.userList.add(new User(user, pw, name, 2));
				UserAccountManagerTest.writeUserFile();
				customerMenu(user);
			}
			else if(inputCheck == 2) {
				createNewAccount();
			}
		}
		
		public static void doesUsernameExist() {
			//SOMETHING ABOUT CHECKING IF USERNAME ALREADY EXISTS
			//INCOMPLETE STUFF, DONE FOR NOW
			int temp = 0;
			if (temp == 1) {
				System.out.println("That username is taken! Please try a different username!\n");
				System.out.println("////////////////////\n");
				createNewAccount();
			}
		}
		
		public static void adminMenu() {
			
		}
		
		public static void customerMenu(String user) {
			System.out.println("Welcome " + user + "!");
			System.out.println("What would you like to do?");
			System.out.println("1. Withdraw\n 2. Deposit\n 3. Transfer Between Accounts\n 4. Open a New Account");
			System.out.println();
			String answer = input.nextLine();
			//1 WILL SEND TO Withdraw() METHOD
			if (answer.equals("1")) {
				//withdraw
			}
			//N WILL SEND TO NOACCOUNT() METHOD
			else if (answer.equals("2")) {
				//deposit	
			}
			else if (answer.equals("3")) {
				//transfer between accounts
			}
			else if (answer.equals("4")) {
				System.out.println("Would you like to create a single or joint account?");
				String choice = input.nextLine();
				if (choice.equals("1")) {
					AccountManagement.CreateSinglePersonAccount(user);
				}
				else if (choice.equals("2")) {
					//AccountManagement.CreateJointAccount(user, username02);
				}
				else {
					System.out.println("Invalid input.\n");
					System.out.println("////////////////////\n");
					customerMenu(user);
				}
			}
			//USER INPUTS INVALID RESPONSE, RESTARTS
			else {
				System.out.println("Invalid input.\n");
				System.out.println("////////////////////\n");
				startProgram();
			}
			
			
		}

		public static void employeeMenu() {
	
		}
		
	}

