package com.revature.nFactorial;

import java.util.Scanner;


public class Nfactorial {
	public static Scanner sc= new Scanner(System.in);

	
	@SuppressWarnings("unused")
	public static void fact() {
		// TODO Auto-generated method stub
		System.out.println("Input the factorial number: ");
		String contents=sc.nextLine();
		int f = Integer.parseInt(contents);
		for (int i = f-1; i>=1; i--) {
			f=f*i;
		}
		System.out.println(f);


	}



}

