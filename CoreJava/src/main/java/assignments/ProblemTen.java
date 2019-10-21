//Find the minimum of two numbers using ternary operators.

package assignments;

import java.util.Scanner;

public class ProblemTen {
	public static Scanner inputOne = new Scanner(System.in);
	public static Scanner inputTwo = new Scanner(System.in);
	public static int i1, i2;
	public static int input;
	
	public static void checkMin() {
		
		//Take in two inputs
		System.out.print("Enter the first number: ");
		i1 = Integer.parseInt(inputOne.next());
		System.out.print("Enter the second number: ");
		i2 = Integer.parseInt(inputTwo.next());
		
		//Grab the lower number of the two and display the number
		input = (i1 < i2) ? i1 : i2;
		System.out.print("The minimum of the two numbers: " + input);
	}
}
