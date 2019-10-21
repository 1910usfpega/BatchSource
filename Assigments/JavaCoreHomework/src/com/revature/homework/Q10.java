package com.revature.homework;

import java.util.Scanner;

public class Q10 {

	public static int Ternary() {
		int num1, num2, result, temp;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number:");
		num1 = scanner.nextInt();
		System.out.println("Enter Second Number:");
		num2 = scanner.nextInt();
		
		
		temp = num1< num2 ? num1:num2;
		result = temp;
		System.out.println("Smallest Number is: " + result);
	return result;}
}
//always run with numbers 5 and 7 for JUnit purposes.

