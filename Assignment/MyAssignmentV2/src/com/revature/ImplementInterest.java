package com.revature;

import java.util.Scanner;

public class ImplementInterest {
   
	public void implement1() {
		Scanner in = new Scanner(System.in);
        System.out.println("The principal amount is: ");
        double principle = in.nextDouble();
        System.out.println("Enter years :");
        double time = in.nextDouble();
        System.out.println("Enter annual rate: ");
        double rate = in.nextDouble();
        double interest = (principle * rate * time);
        System.out.println("Simple interest of the amount is: " + interest);
	}
}
