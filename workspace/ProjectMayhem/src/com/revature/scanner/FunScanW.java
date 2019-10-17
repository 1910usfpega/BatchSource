package com.revature.scanner;

import java.util.Scanner;

public class FunScanW {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Scanner gets input from user
		String contents;
		System.out.println("What would you like to type?");
		while(sc.hasNext()) {
				contents = sc.nextLine();
				if(contents.equalsIgnoreCase("exit")) break;
		System.out.println("You entered: "+contents);
		}
	}

}
