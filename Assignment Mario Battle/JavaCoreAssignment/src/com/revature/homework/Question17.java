package com.revature.homework;

import java.util.Scanner;

public class Question17 {

	public static void interest() {
		System.out.println("Now we're calculating interest please enter a Principal amount");
		Scanner sc = new Scanner(System.in);
		double principal = sc.nextDouble();
		System.out.println(" Now enter the interest rate:");
		double interestRate = sc.nextDouble();
		System.out.println("Finally enter the number of years across which interest will accrue.");
		int years = sc.nextInt();
		double interest = principal*interestRate*.01*years;
		//double interest= principal-balance;
		//System.out.println(balance);
		System.out.println("After "+years+" years you will have accrued $"+interest+" of interest");
	
	}
}
