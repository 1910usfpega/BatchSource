package com.revature;

import java.util.Scanner;



public class NamelessHorse {
	
	public static Scanner sc= new Scanner(System.in);
	
	public static void Horse(){
		
		System.out.println("Print String.");
		String str = sc.nextLine();
		System.out.println("Print Int.");
		int idx = sc.nextInt();
		
		System.out.println(str.substring(0, idx-1));
	}
}
