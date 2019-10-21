package com.revature.min;

import java.util.Scanner;

public class Minimum {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give me two integers");
		int a = in.nextInt();
		int b = in.nextInt();
		
		if(a == b) {
			System.out.println("These numbers are equal");
		}
		else if( a > b) {
			System.out.println(b + " is the minimum");
		}
		else if(a < b) {
			System.out.println(a + " is the minimum.");
		}
		
		in.close();
	}
}
