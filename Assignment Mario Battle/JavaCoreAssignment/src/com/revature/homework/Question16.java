package com.revature.homework;

import java.util.Scanner;

public class Question16 {

	public static void stringLength() {
//		for(int i = 0; i < margs.length; i++) {
//			System.out.println(margs.length);
//		}
	//	The method below WORKS
		System.out.println("Congratulations! You have reached question 16! \n Please enter a string of your choosing");
		Scanner input = new Scanner(System.in);
		String content = input.nextLine();
		System.out.println(content.length());
		
	}
}
