package com.revature.assignment;

import java.util.Scanner;

public class Q17 {
public static void interestCalc() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Calculate Simple Interest");
	System.out.println("Please enter principle amount: ");
	
	float amount = sc.nextFloat();
	
	System.err.println("Please enter time in years: ");
	float time = sc.nextFloat();
	
	System.out.println("Please enter interest rate: ");
	float rate = sc.nextFloat();

	float interest = simpleInterest(amount, time, rate);
	
	System.out.println("Simple Interest equals: " + interest);
	
}
public static float simpleInterest(float amount, float time, float rate) {
	float interest = (amount*time*rate)/100;
	return interest;
}
}
