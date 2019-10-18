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
		
		public static String currentUser;
		
		
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
				System.out.println("////////////////////\n");
				if (UserAccountManagerTest.getAccountType(user) == 1) {
					adminMenu(currentUser);
				}
				else if (UserAccountManagerTest.getAccountType(user) == 2) {
					customerMenu(currentUser);
				}
				else if (UserAccountManagerTest.getAccountType(user) == 3) {
					employeeMenu(currentUser);
				}
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
			if(UserAccountManagerTest.usernameAvailability(user) == false) {
				System.out.println("Passwords did not match! Please try again!\n");
				System.out.println("////////////////////\n");
				createNewAccount();
			}

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
				System.out.println("Is the following information correct?\n Username: " + user + "\n Password: " + pw + "\n Full Name: " + name + "\n Y/N");                               
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
		
		public static void adminMenu(String currentUser) {
			System.out.println("Welcome " + currentUser + "!");
			System.out.println("What would you like to do?");
			System.out.println(" 1. Withdraw\n 2. Deposit\n 3. Transfer Between Accounts\n 4. Open a New Account");
			System.out.println("(Please enter numerical answers only i.e. 1 or 2)");
			System.out.println();
			String answer = input.nextLine();
			//1 WILL SEND TO Withdraw() METHOD
			if (answer.equals("1")) {
				//withdraw
			}
			//2 WILL SEND TO Deposit() METHOD
			else if (answer.equals("2")) {
				//deposit	
			}
			//3 WILL SEND TO Transfer() METHOD
			else if (answer.equals("3")) {
				//transfer between accounts
			}
			//4 WILL ASK WHICH ACCOUNT TYPE THEY WOULD LIKE TO OPEN
			else if (answer.equals("4")) {
				System.out.println("Would you like to create a single or joint account?");
				System.out.println("(Please enter numerical answers only i.e. 1 or 2)");
				String choice = input.nextLine();
				if (choice.equals("1")) {
					//AccountManagement.CreateSinglePersonAccount(user);
				}
				else if (choice.equals("2")) {
					//AccountManagement.CreateJointAccount(user, username02);
				}
				else {
					System.out.println("Invalid input.\n");
					System.out.println("////////////////////\n");
					adminMenu(currentUser);
				}
			}
			//5 WILL ASK YOU TO SEARCH FOR WHICH CUSTOMER YOU ARE LOOKING FOR BY USERNAME OR NAME
			else if (answer.equals("5")) {
				System.out.println("Would you like to search by 1)Username or 2)Full Name?");
				System.out.println("(Please enter numerical answers only i.e. 1 or 2)");
				String choice = input.nextLine();
				if (choice.equals("1")) {
					System.out.println("Please enter the customer's username:");
					String choice1 = input.nextLine();
					UserAccountManagerTest.readUserFile();
					for(int i = 0; i < UserAccountManagerTest.userList.size(); i++) {
						if(UserAccountManagerTest.userList.get(i).getUser().equals(choice1)) {
							System.out.println(UserAccountManagerTest.userList.get(i).toString());
						}
					}
				}
				else if (choice.equals("2")) {
					System.out.println("Please enter the customer's full name:");
					String choice1 = input.nextLine();
					UserAccountManagerTest.readUserFile();
					for(int i = 0; i < UserAccountManagerTest.userList.size(); i++) {
						if(UserAccountManagerTest.userList.get(i).getName().equals(choice1)) {
							System.out.println(UserAccountManagerTest.userList.get(i).toString());
						}
					}
				}
			}
			//USER INPUTS INVALID RESPONSE, RESTARTS
			else {
				System.out.println("Invalid input.\n");
				System.out.println("////////////////////\n");
				adminMenu(currentUser);
			}
		}
		
		public static void customerMenu(String currentUser) {
			System.out.println("Welcome " + currentUser + "!");
			System.out.println("What would you like to do?");
			System.out.println(" 1. Withdraw\n 2. Deposit\n 3. Transfer Between Accounts\n 4. Open a New Account");
			System.out.println("(Please enter numerical answers only i.e. 1 or 2)");
			System.out.println();
			String answer = input.nextLine();
			//1 WILL SEND TO Withdraw() METHOD
			if (answer.equals("1")) {
				//withdraw
			}
			//2 WILL SEND TO Deposit() METHOD
			else if (answer.equals("2")) {
				//deposit	
			}
			//3 WILL SEND TO Transfer() METHOD
			else if (answer.equals("3")) {
				//transfer between accounts
			}
			//4 WILL ASK WHICH ACCOUNT TYPE THEY WOULD LIKE TO OPEN
			else if (answer.equals("4")) {
				System.out.println("Would you like to create a single or joint account?");
				System.out.println("(Please enter numerical answers only i.e. 1 or 2)");
				String choice = input.nextLine();
				if (choice.equals("1")) {
					//AccountManagement.CreateSinglePersonAccount(user);
				}
				else if (choice.equals("2")) {
					//AccountManagement.CreateJointAccount(user, username02);
				}
				else {
					System.out.println("Invalid input.\n");
					System.out.println("////////////////////\n");
					customerMenu(currentUser);
				}
			}
			//USER INPUTS INVALID RESPONSE, RESTARTS
			else {
				System.out.println("Invalid input.\n");
				System.out.println("////////////////////\n");
				customerMenu(currentUser);
			}
			
			
		}

		public static void employeeMenu(String currentUser) {
			System.out.println("Welcome " + currentUser + "!");
			System.out.println("What would you like to do?");
			System.out.println(" 1. Withdraw\n 2. Deposit\n 3. Transfer Between Accounts\n 4. Open a New Account\n 5. View Customer Information");
			System.out.println("(Please enter numerical answers only i.e. 1 or 2)");
			System.out.println();
			String answer = input.nextLine();
			//1 WILL SEND TO Withdraw() METHOD
			if (answer.equals("1")) {
				//withdraw
			}
			//2 WILL SEND TO Deposit() METHOD
			else if (answer.equals("2")) {
				//deposit	
			}
			//3 WILL SEND TO Transfer() METHOD
			else if (answer.equals("3")) {
				//transfer between accounts
			}
			//4 WILL ASK WHICH ACCOUNT TYPE THEY WOULD LIKE TO OPEN
			else if (answer.equals("4")) {
				System.out.println("Would you like to create a 1)single or 2)joint account?");
				System.out.println("(Please enter numerical answers only i.e. 1 or 2)");
				String choice = input.nextLine();
				if (choice.equals("1")) {
					//AccountManagement.CreateSinglePersonAccount(user);
				}
				else if (choice.equals("2")) {
					//AccountManagement.CreateJointAccount(user, username02);
				}
				else {
					System.out.println("Invalid input.\n");
					System.out.println("////////////////////\n");
					employeeMenu(currentUser);
				}
			}
			//5 WILL ASK YOU TO SEARCH FOR WHICH CUSTOMER YOU ARE LOOKING FOR BY USERNAME OR NAME
			else if (answer.equals("5")) {
				System.out.println("Would you like to search by 1)Username or 2)Full Name?");
				System.out.println("(Please enter numerical answers only i.e. 1 or 2)");
				String choice = input.nextLine();
				if (choice.equals("1")) {
					System.out.println("Please enter the customer's username:");
					String choice1 = input.nextLine();
					UserAccountManagerTest.readUserFile();
					for(int i = 0; i < UserAccountManagerTest.userList.size(); i++) {
						if(UserAccountManagerTest.userList.get(i).getUser().equals(choice1)) {
							System.out.println(UserAccountManagerTest.userList.get(i).toString());
						}
					}
				}
				else if (choice.equals("2")) {
					System.out.println("Please enter the customer's full name:");
					String choice1 = input.nextLine();
					UserAccountManagerTest.readUserFile();
					for(int i = 0; i < UserAccountManagerTest.userList.size(); i++) {
						if(UserAccountManagerTest.userList.get(i).getName().equals(choice1)) {
							System.out.println(UserAccountManagerTest.userList.get(i).toString());
						}
					}
				}
				else {
					System.out.println("Invalid input.\n");
					System.out.println("////////////////////\n");
					employeeMenu(currentUser);
				}
				//transfer between accounts
			}
			//USER INPUTS INVALID RESPONSE, RESTARTS
			else {
				System.out.println("Invalid input.\n");
				System.out.println("////////////////////\n");
				customerMenu(currentUser);
			}
		}
		
	}

