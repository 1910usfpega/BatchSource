package com.revature.programstart;

import java.util.Scanner;

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
			loginUsername();
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
	public static void loginUsername() {
		System.out.println("Enter your Username: ");
		String user = input.nextLine();
		System.out.println();
		//NEED SOMETHING TO CHECK IF THE USERNAME EXISTS
		//if (user.equals(REAL USERNAME){
			//loginPassword();
		//}
		//else{
			//System.out.println("Username does not exist! Please try again\n");
			//loginUsername();
		//}		
	}
	//ASKS TO ENTER YOUR PASSWORD
	public static void loginPassword() {
		System.out.print("Enter your Password: ");
		String pw = input.nextLine();
		System.out.println();
		//NEED SOMETHING TO CHECK IF PASSWORD MATCHES USERNAME
		//if (pw.equals(MATCHING PASSWORD){
			System.out.println("Login Success!\n");
			/* SOME SORT OF MAIN MENU METHOD
			 * CAN PROBABLY ALSO HAVE A CHECK IF THE ACCOUNT IS A CUSTOMER,
			*    EMPLOYEE, OR BANK ADMIN AND HAVE THEM GO TO A DIFFERENT
			*	 MENU BASED ON WHAT ACCOUNT TYPE THEY HAVE */
		//else{
			//pwAttempts--
			//if(pwAttempts > 0){
				//System.out.println("Incorrect Password! Please try again\n");
				//loginPassword()
				//THIS LETS YOU TRY AGAIN WITH ONE LESS ATTEMPT
			//}
			//else{
				//System.out.println("Too many invalid attempts, please try again later.\n");
				//System.out.println("////////////////////\n");
				//startProgram();
				//THIS RESTARTS THE PROGRAM/SENDS BACK TO MAIN MENU
			//}
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
		doesUsernameExist();			
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
	
}
