package main.java.programstart;

import java.security.InvalidAlgorithmParameterException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import main.java.accounts.Account;
import main.java.accounts.AccountManagement;
import main.java.bean.User;
import main.java.implementations.AccountDaoImpl;
import main.java.implementations.UserDaoImpl;
import main.java.users.UserAccountManager;

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
			System.out.println("Welcome to JDBCBank! \n");
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
			if(UserAccountManager.isAccountValid(user, pw) == true) {
				System.out.println("Login Success!\n");
				System.out.println("////////////////////\n");
				if (UserAccountManager.getAccountType(user) == 1) {
					adminMenu(currentUser);
				}
				else if (UserAccountManager.getAccountType(user) == 2) {
					customerMenu(user);
				}
				else if (UserAccountManager.getAccountType(user) == 3) {
					employeeMenu(currentUser);
				}
			}
			else if(UserAccountManager.isAccountValid(user, pw) == false) {
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
			if(UserAccountManager.usernameAvailability(user) == false) {
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
				//UserAccountManagerTest.userList.add(new User(user, pw, name, 2));
				UserDaoImpl userDao = new UserDaoImpl();
				try {
					userDao.insertAccount(user, pwc, name, 2);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//UserAccountManagerTest.writeUserFile();
				customerMenu(user);
			}
			else if(inputCheck == 2) {
				createNewAccount();
			}
		}
		
		public static void adminMenu(String currentUser) {
			System.out.println("Welcome " + currentUser + "!");
			System.out.println("What would you like to do?");
			System.out.println(" 1. Withdraw\n 2. Deposit\n 3. Transfer Between Accounts\n 4. Open a New Account\n 5. Search users\n 6. Delete a user.\n 7. Logoff");
			System.out.println("(Please enter numerical answers only i.e. 1 or 2)");
			System.out.println();
			String answer = input.nextLine();
			//1 WILL SEND TO Withdraw() METHOD
			if (answer.equals("1")) {
				AccountManagement.withdraw(currentUser);
			}
			//2 WILL SEND TO Deposit() METHOD
			else if (answer.equals("2")) {
				AccountManagement.deposit(currentUser);
			}
			//3 WILL SEND TO Transfer() METHOD
			else if (answer.equals("3")) {
				AccountManagement.transferFunds(currentUser);
			}
			//4 WILL ASK WHICH ACCOUNT TYPE THEY WOULD LIKE TO OPEN
			else if (answer.equals("4")) {
				System.out.println("Would you like to create a single or joint account?");
				System.out.println("(Please enter numerical answers only i.e. 1 or 2)");
				String choice = input.nextLine();
				if (choice.equals("1")) {
					System.out.println("Select the account type you would like to create\n1: Savings\n2:Checking");
					int selection = input.nextInt();
					if (selection==1) {
						AccountManagement.CreateSinglePersonSavingsAccount(currentUser);
					}
					else if(selection == 2) {
						AccountManagement.CreateSinglePersonCheckingAccount(currentUser);
					}else {
						System.out.println("Invalid selection.");
						adminMenu(currentUser);
					}
				}
				else if (choice.equals("2")) {
					System.out.println("Enter second participents username");
					String secondUser = input.next();
					System.out.println("What kind of account would you like to create\n1: Savings\n2: Checking");
					int selection = input.nextInt();
					if(selection == 1) {
						AccountManagement.CreateJointSavingsAccount(currentUser, secondUser);
					} else if(selection == 2) {
						AccountManagement.CreateJointCheckingAccount(currentUser, secondUser);
					}else {
						System.out.println("Invalid option.");
						employeeMenu(currentUser);
					}				}
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
					UserDaoImpl dao = new UserDaoImpl();
					System.out.println();
					try {
						List<User> userList = dao.getAllUsers();
						for (User user : userList) {
							if(user.getUser().toLowerCase().contains(choice1.toLowerCase())) {
								System.out.println(user.toString());
							}else {
								System.out.println("****************************************************Invalid search****************************************************");
								adminMenu(currentUser);
							}
						}
						System.out.println();
						adminMenu(currentUser);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else if (choice.equals("2")) {
					System.out.println("Please enter the customer's full name:");
					String choice1 = input.nextLine();
					UserDaoImpl dao = new UserDaoImpl();
					try {
						List<User> userList = dao.getAllUsers();
						for (User user : userList) {
							if(user.getName().toLowerCase().equals(choice1.toLowerCase())) {
								System.out.println(user.toString());
							} else {
								System.out.println("****************************************************Invalid search****************************************************");
								adminMenu(currentUser);
							}
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			//Delete a user
			else if (answer.equals("6")) {
				UserDaoImpl dao = new UserDaoImpl();
				AccountDaoImpl daoAccounts = new AccountDaoImpl();
				Scanner input = new Scanner(System.in);
				System.out.println("WARNING -> Deleting a user removes the user account FOREVER.\n Including all bank accounts related to this user");
				System.out.println("*************************************************************************************************************************************");
				System.out.println("Enter the username of the user you would like to delete.");
				String usernameToDelete = input.nextLine();
				System.out.println("*************************************************************************************************************************************");
				try {
					List<User> userList = dao.getAllUsers();
					for (User user : userList) {
						if(user.getUser().equals(usernameToDelete)) {
							System.out.println(user.toString());
						}
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("*************************************************************************************************************************************");
				System.out.println("ARE YOU SURE YOU WANT TO DELETE THE USER LISTED ABOVE?????\n 1. Yes \t 0. No");
				int confirmDeletion = input.nextInt();
				if (confirmDeletion == 1) {
					try {
						dao.deleteAccount(usernameToDelete);//Deletes user account from DB
						daoAccounts.deleteBankAccount(usernameToDelete);//Deletes accounts belonging to said user
						System.out.println("User account "+usernameToDelete+" is now deleted from the JDBCBank system");
					} catch (SQLException e) {
						System.out.println("Failed to delete user account");
						System.out.println("*************************************************************************************************************************************");
						employeeMenu(currentUser);
					}
					if(confirmDeletion == 0) {
						adminMenu(currentUser);
					}
				}else {
					adminMenu(currentUser);
				}
			}
			else if(answer.endsWith("7")) {
				startProgram();
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
			System.out.println(" 1. Withdraw\n 2. Deposit\n 3. Transfer Between Accounts\n 4. Open a New Account\n 5. Logout");
			System.out.println("(Please enter numerical answers only i.e. 1 or 2)");
			System.out.println();
			String answer = input.nextLine();
			//1 WILL SEND TO Withdraw() METHOD
			if (answer.equals("1")) {
				AccountManagement.withdraw(currentUser);
			}
			//2 WILL SEND TO Deposit() METHOD
			else if (answer.equals("2")) {
				AccountManagement.deposit(currentUser);
			}
			//3 WILL SEND TO Transfer() METHOD
			else if (answer.equals("3")) {
				AccountManagement.transferFunds(currentUser);
			}
			//4 WILL ASK WHICH ACCOUNT TYPE THEY WOULD LIKE TO OPEN
			else if (answer.equals("4")) {
				System.out.println("Would you like to create a single or joint account?");
				System.out.println("(Please enter numerical answers only i.e. 1 or 2)");
				String choice = input.nextLine();
				if (choice.equals("1")) {
					System.out.println("Select the account type you would like to create\n1: Savings\n2:Checking");
					int selection = input.nextInt();
					if (selection==1) {
						AccountManagement.CreateSinglePersonSavingsAccount(currentUser);
					}
					else if(selection == 2) {
						AccountManagement.CreateSinglePersonCheckingAccount(currentUser);
					}else {
						System.out.println("Invalid selection.");
						customerMenu(currentUser);
					}
				}
				else if (choice.equals("2")) {
					System.out.println("Enter other participent's username");
					String secondUser = input.next();
					System.out.println("What kind of account would you like to create\n1: Savings\n2: Checking");
					int selection = input.nextInt();
					if(selection == 1) {
						AccountManagement.CreateJointSavingsAccount(currentUser, secondUser);
					} else if(selection == 2) {
						AccountManagement.CreateJointCheckingAccount(currentUser, secondUser);
					}else {
						System.out.println("Invalid option.");
						customerMenu(currentUser);
					}				}
				else {
					System.out.println("Invalid input.\n");
					System.out.println("////////////////////\n");
					customerMenu(currentUser);
				}
			}
			else if (answer.equals("5")) {
				startProgram();
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
			System.out.println(" 1. Withdraw\n 2. Deposit\n 3. Transfer Between Accounts\n 4. Open a New Account\n 5. View Customer Information\n 6. Delete a user\n 7. Logout");
			System.out.println("(Please enter numerical answers only i.e. 1 or 2)");
			System.out.println();
			String answer = input.nextLine();
			//1 WILL SEND TO Withdraw() METHOD
			if (answer.equals("1")) {
				AccountManagement.withdraw(currentUser);
			}
			//2 WILL SEND TO Deposit() METHOD
			else if (answer.equals("2")) {
				AccountManagement.deposit(currentUser);	
			}
			//3 WILL SEND TO Transfer() METHOD
			else if (answer.equals("3")) {
				AccountManagement.transferFunds(currentUser);
			}
			//4 WILL ASK WHICH ACCOUNT TYPE THEY WOULD LIKE TO OPEN
			else if (answer.equals("4")) {
				System.out.println("Would you like to create a 1)single or 2)joint account?");
				System.out.println("(Please enter numerical answers only i.e. 1 or 2)");
				String choice = input.nextLine();
				if (choice.equals("1")) {
					System.out.println("Select the account type you would like to create\n1: Savings\n2:Checking");
					int selection = input.nextInt();
					if (selection==1) {
						AccountManagement.CreateSinglePersonSavingsAccount(currentUser);
					}
					else if(selection == 2) {
						AccountManagement.CreateSinglePersonCheckingAccount(currentUser);
					}else {
						System.out.println("Invalid selection.");
						employeeMenu(currentUser);
					}
				}
				else if (choice.equals("2")) {
					System.out.println("Enter username of account participent");
					String secondUser = input.next();
					System.out.println("What kind of account would you like to create\n1: Savings\n2: Checking");
					int selection = input.nextInt();
					if(selection == 1) {
						AccountManagement.CreateJointSavingsAccount(currentUser, secondUser);
					} else if(selection == 2) {
						AccountManagement.CreateJointCheckingAccount(currentUser, secondUser);
					}else {
						System.out.println("Invalid option.");
						employeeMenu(currentUser);
					}
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
					
					UserDaoImpl dao = new UserDaoImpl();
					try {
						List<User> userList = dao.getAllUsers();
						for (User user : userList) {
							if(user.getUser() == choice1) {
								System.out.println(user.toString());
							}
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else if (choice.equals("2")) {
					System.out.println("Please enter the customer's full name:");
					String choice1 = input.nextLine();
					UserDaoImpl dao = new UserDaoImpl();
					try {
						List<User> userList = dao.getAllUsers();
						for (User user : userList) {
							if(user.getName() == choice1) {
								System.out.println(user.toString());
							}
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else {
					System.out.println("Invalid input.\n");
					System.out.println("////////////////////\n");
					employeeMenu(currentUser);
				}
				//transfer between accounts
			}
			//Option to delete users
			else if (answer.equals("6")) {
				UserDaoImpl dao = new UserDaoImpl();
				AccountDaoImpl daoAccounts = new AccountDaoImpl();
				Scanner input = new Scanner(System.in);
				System.out.println("WARNING -> Deleting a user removes the user account FOREVER.\n Including all bank accounts related to this user");
				System.out.println("*************************************************************************************************************************************");
				System.out.println("Enter the username of the user you would like to delete.");
				String usernameToDelete = input.nextLine();
				System.out.println("*************************************************************************************************************************************");
				try {
					List<User> userList = dao.getAllUsers();
					for (User user : userList) {
						if(user.getUser().equals(usernameToDelete)) {
							System.out.println(user.toString());
						}
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("*************************************************************************************************************************************");
				System.out.println("ARE YOU SURE YOU WANT TO DELETE THE USER LISTED ABOVE?????\n 1. Yes\t 0. No");
				int confirmDeletion = input.nextInt();
				if (confirmDeletion == 1) {
					try {
						dao.deleteAccount(usernameToDelete);//Deletes user account from DB
						daoAccounts.deleteBankAccount(usernameToDelete);//Deletes bank accounts related to said user
						System.out.println("User account "+usernameToDelete+" is now deleted from the JDBCBank system");
					} catch (SQLException e) {
						System.out.println("Failed to delete user account");
						System.out.println("*************************************************************************************************************************************");
						employeeMenu(currentUser);
					}
					if(confirmDeletion == 0) {
						employeeMenu(currentUser);
					}
				}else {
					employeeMenu(currentUser);
				}
			}
			//Lofoff functionality
			else if (answer.equals("7")) {
				startProgram();
			}
			//USER INPUTS INVALID RESPONSE, RESTARTS
			else {
				System.out.println("Invalid input.\n");
				System.out.println("////////////////////\n");
				customerMenu(currentUser);
			}
		}
		
	}

