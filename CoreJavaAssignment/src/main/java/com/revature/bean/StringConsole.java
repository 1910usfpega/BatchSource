package com.revature.bean;

import java.util.Scanner;

public class StringConsole {
	
	/*
	 * 
	 * Q16. Write a program to display the number of characters for a string input.
	 *  The string should be entered as a command line argument using (String [ ] args).
	 * */
	

	public static void main(String[] args) {
		
		int snum = 0;
		
		System.out.println("Please Enter a string: ");
		for(String inputString : args) {
			System.out.print(inputString + " ");
			snum = snum + inputString.length();
		}
		
		System.out.println("Number of characters is : " + snum);

	}

}
