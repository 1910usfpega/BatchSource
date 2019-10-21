package com.revature.assignment;

import java.util.Scanner;

public class Q6 {
	public static void even() {
	Scanner sc = new Scanner(System.in);
	int number = 0;
	System.out.println("Enter a number to check whether it is \"even\" or \"odd\":");
	number = sc.nextInt();
	if(((number/2)*2)==number) {
		System.out.println("The number entered \"" + number + "\" is even");}
	else {
		System.out.println("The number entered \"" + number + "\" is odd");
	}
	}
}
