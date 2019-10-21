//Write a program to display the number of characters for a string input. 
//The string should be entered as a command line argument using (String [ ] args).

package com.homework.assignments;

public class ProblemSixteen {

	public static void main(String[] args) {
		int cNum = 0;
		System.out.print("Input String: ");
		for (String input : args) { //Go through each word in the string
			System.out.print(input + " "); //print out the string
			char[] array = input.toCharArray();
			for (int i = 0; i < array.length; i++) {
				cNum++; //increment a counter each time a character is read
			}
		}
		//print out the counter showing how many character there are in the string
		System.out.println("\nNumber of characters in the input string: " + cNum);
	}
}