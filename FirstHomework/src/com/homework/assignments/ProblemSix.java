//Write a program to determine if an integer is even without using the modulus operator (%)

package com.homework.assignments;

import java.util.Scanner;

public class ProblemSix {

	public static Scanner intCheck = new Scanner(System.in);
	
	//very time consuming method if the input is a very large number
	public static void isEven() {
		boolean check = true;
		
		//Input an integer
		System.out.print("Enter an integer to see if it's even: ");
		int myInt = intCheck.nextInt();
	
			//if integer is greater than 0, decrement and alternate the check from true to false
			if(myInt > 0) {
				for(int i = myInt; i > 0; i--) {
					check = !check;
				}
			}
			//If input is below 0, increment; alternate true/false each time
			else {
				for(int i = myInt; i < 0; i++) {
					check = !check;
				}
			}
		
		//If the check comes out true, it's even, else false
		if(check == true) {
			System.out.println(myInt + " is even");
		}
		else {
			System.out.println(myInt + " is odd");
		}
	}
}
