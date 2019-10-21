//Write a program to compute N factorial

package com.homework.assignments;

import java.util.Scanner;

public class ProblemFour {

	public static Scanner myNum = new Scanner(System.in);

	public static void nFactorial() {

		long factorial = 0;
		
		//Inputting an integer
		System.out.print("Enter an integer to compute the factorial: ");
		int myInt = myNum.nextInt();
		
		//Decrement from the input integer down to 1
		factorial = myInt;
		if (myInt == (int) myInt) {
			for (int i = myInt; i > 1; i--) {
				factorial = factorial * (i - 1);
			}
			//Displaying the factorial
			if (myInt == 0)
				System.out.println("Factorial of " + myInt + " is: 1");
			else
				System.out.println("Factorial of " + myInt + " is: " + factorial);
		}
	}
}
