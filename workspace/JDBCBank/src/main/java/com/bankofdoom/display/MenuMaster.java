package com.bankofdoom.display;
import java.util.Scanner;
import com.bankofdoom.display.MenuMethod;
import com.bankofdoom.driver.*;
public class MenuMaster {		
	private static String s;
	
	private static String tryAgain = "Please enter Y if you have an existing"
			+ " account and wish to login\n"
			+ "Please enter N if you would like to create a new account";
	private static String thankYouMsg= "Thank you for choosing Bank of Doom for"
			+ " all your Supervillan Banking needs!";

	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//UserManager io = new UserManager();

		System.out.println("Welcome to my JDBC Bank Application!\n"+tryAgain);



		s = sc.next();
		
		s = s.toLowerCase();
		
		switch(s) {

		case "x":
			System.out.println(thankYouMsg);
			break;
		case"y":
			//if(UserManager.userLogin(sc)) MenuMethod.displayMainMenu();;
			break;
		case "n":
			
			//needs to be replaced with db calls
//			io.userPersonalInfo(sc);
//			io.writeUserFile();
			break;
		default:
			System.out.println("Invalid Option! Self-destruct sequence "
					+ "initiated!\n"+thankYouMsg);

	}
		System.out.println("Thank you for playing! Shutting down!");
	sc.close();
}
	
}

