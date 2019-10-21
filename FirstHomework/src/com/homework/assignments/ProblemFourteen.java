//Write a program that demonstrates the switch case. Implement the following functionalities in the cases:java
//Case 1: Find the square root of a number using the Math class method.
//Case 2: Display today’s date.
//Case 3: Split the following string and store it in a string array. “I am learning Core Java”

package com.homework.assignments;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.lang.Math;

public class ProblemFourteen {

	public static void sCase() {
		boolean bool = true;
		int num;
		String string = "I am learning Core Java";
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//do while with a switch statement
		do {
			//Picking an option
			System.out.println("Pick an option.");
			System.out.println("1. Find the square root of a number.");
			System.out.println("2. Display today's date.");
			System.out.println("3. Split a string to store each word into a string array.");
			System.out.println("4. Exit.");
			System.out.print("Enter: ");
			
			switch (input.nextInt()) {
			case 1: //Entering a number and finding the square root of it
				System.out.print("Enter a number: ");
				num = input.nextInt();
				System.out.println("The square root of " + num + " is " + Math.sqrt(num));
				break;
			case 2: //Displaying the local date and time
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
				LocalDateTime now = LocalDateTime.now();
				System.out.println(dtf.format(now));
				break;
			case 3: //Breaking down the string "I am learning Core Java" into each string array
				System.out.println(string);
				String[] array = string.split(" ");
				for(String str : array) {
					System.out.println(str);
				}
				break;
			case 4: //Exit the switch statement
				bool = false;
				break;
			default:
				break;
			}
			System.out.println();
		} while (bool);
	}
}
