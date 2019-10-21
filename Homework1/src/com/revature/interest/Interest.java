package com.revature.interest;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is the principal?");
		int principal = in.nextInt();
		
		System.out.println("What is the interest rate?");
		float rate = in.nextFloat();
		
		System.out.println("What is the time you will invest it for (in years)?");
		int time = in.nextInt();
		
		float interest = principal * rate * time;
		
		System.out.println("Your total interest is " + interest + ".");
	
		in.close();
	}
}
