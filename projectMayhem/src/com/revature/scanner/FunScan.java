package com.revature.scanner;

import java.util.Scanner;

public class FunScan {
	public static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		//Scanner gets input from user
		String contents;
		System.out.println("What woud you like to type?");
		//contents=sc.next();
		contents=sc.nextLine();
		System.out.println("No what woud you like to type?");
		//contents=sc.next();//.next is the delimiter
		contents=sc.nextLine();
		System.out.println("You entered: "+ contents);
		System.out.println("No what woud you like to type?");
		contents=sc.nextLine();
		int i = Integer.parseInt(contents);
		System.out.println("You entered :" + i);
		
	}
	
}
