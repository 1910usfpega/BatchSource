package com.revature.assignment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q14 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		switchIt();
	}
	//method to run Main Menu in the scanner
	public static void switchIt() {
		
		int choose;
		String string;
	//loop to generate numbered options in Main Menu to choose from 
		
		do {
		System.out.println("\t Switch Cases \n 1. Find the squareroot \n 2. Display today's Date \n 3. Split a string to store each word into an array \n 4. Exit");
		System.out.println("Please enter number:");
		choose=sc.nextInt();
		
			switch(choose) {
			case 1: 
				System.out.println("Enter a number: ");
				choose=sc.nextInt();
				System.out.println("The square root of " + choose + " is " + Math.sqrt(choose));
				break;
			case 2:
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
				LocalDateTime now = LocalDateTime.now();
				System.out.println(dtf.format(now));
			break;
			case 3:
				System.out.println("Enter a word: ");
				string=sc.next();
				System.out.println(string);	
			break;	
			case 4:
				System.out.println("Goodbye");
			break; 
		}
	
}
		while (choose>=5);
}
}