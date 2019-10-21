package com.revature.assignment;

import java.util.Scanner;

public class Q10 {

	public static void ternary() {
		Scanner sc = new Scanner(System.in);
		int num1,num2,result;
		
		System.out.println("\t \t Finding The Minimum");
		System.out.println("Enter first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		num2 = sc.nextInt();
		sc.close();
		
		result = num1 < num2 ? num1 : num2;
		System.out.println("The smalles number is: "+result);
	}
	}
