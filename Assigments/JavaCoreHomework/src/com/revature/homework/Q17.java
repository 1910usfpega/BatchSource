package com.revature.homework;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		interest(100);
	}
	
	public static String interest(int i) {
		float p, r, t, sinterest;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Principal : ");
		p = scan.nextFloat();
		System.out.print("Enter the Interest Rate : ");
		r = scan.nextFloat();
		System.out.print("Enter the Time Period: ");
		t = scan.nextFloat();
		scan.close();
		
		sinterest = (r * t * p) / 100;
		System.out.print("The Simple Interest is : " + sinterest);
	
		return "sinterest";}
}
