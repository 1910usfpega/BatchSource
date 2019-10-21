package com.revature.homework;

import java.util.Scanner;

public class Question10 {
	public static int j1, j2;
	public static int input;
	public static void Kareem() {
		System.out.println("Enter first number");
		Scanner sc=new Scanner (System.in);
		
		String input1= sc.nextLine();
		j1= Integer.parseInt(input1);
		System.out.println("Enter second number");
		String input2= sc.nextLine();
		j2= Integer.parseInt(input2);
		
		input = (j1<j2) ? j1 : j2;
		
		System.out.println("Question 10");
		
		System.out.println("The minimum of two numbers");
	System.out.println(input);
	}
	
	}

