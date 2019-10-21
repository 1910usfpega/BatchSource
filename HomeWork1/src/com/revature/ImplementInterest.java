package com.revature;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

public class ImplementInterest {
	public double implement() {
		Scanner next = new Scanner(System.in);
        System.out.println("The principal amount is: ");
        double principle = next.nextDouble();
        System.out.println("Enter years :");
        double years = next.nextDouble();
        System.out.println("Enter annual rate: ");
        double rate = next.nextDouble();
        double interest = (principle * rate * years);
        System.out.println("Simple interest of the amount is: " + interest);
        return interest;    
	}
}
