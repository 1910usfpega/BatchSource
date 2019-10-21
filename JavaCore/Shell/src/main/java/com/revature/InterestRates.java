package com.revature;

import java.util.Scanner;

public class InterestRates {
	
	public static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args)
	{
		double principle, rate, time;
		principle = sc.nextDouble();
		rate = sc.nextDouble();
		time = sc.nextDouble();
		System.out.println(principle * (1 + rate * time));
		
		//A = P(1 + rt)
	}
}
