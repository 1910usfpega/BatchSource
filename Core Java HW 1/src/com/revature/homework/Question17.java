package com.revature.homework;
import java.util.Scanner;

public class Question17 {
	public static void PhilJackson (String str) {
	
	
	
		
			double PAmount, ROI, TimePeriod, simpleInterset;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Question17");
			
			System.out.print(" Please Enter the Principal Amount : ");
			PAmount = sc.nextDouble();
			
			System.out.print(" Please Enter the Rate Of Interest : ");
			ROI = sc.nextDouble();
			
			System.out.print(" Please Enter the Time Period in Years : ");
			TimePeriod = sc.nextDouble();
			
			simpleInterset = (PAmount * ROI * TimePeriod) / 100;
			
			System.out.println("\n The Simple Interest for Principal Amount " + PAmount + " is = " + simpleInterset);
		}
	}

	


