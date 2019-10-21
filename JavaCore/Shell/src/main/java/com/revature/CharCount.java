package com.revature;

import java.util.Scanner;

public class CharCount {
	public static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int count;
		String str = "";
		str = sc.nextLine();
		count = str.length();
		System.out.println(count);
	}
}
