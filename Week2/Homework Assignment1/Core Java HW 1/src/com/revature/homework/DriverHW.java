package com.revature.homework;

import java.util.Arrays;

public class DriverHW {

	public static void main(String[] args) {
		
		int[]ar = {1,0,5,6,3,2,3,7,9,8,4};
		Question1.sortMe(ar);
		System.out.println(Arrays.toString(ar));
		
		Question2.fibonacci();
		int e1= 0;
		int e2= 1;
		int e3=e1+e2;
		System.out.println(e1+" "+e2);
		System.out.println(" "+e3);
		
		Question3.Kobe("Kobe is the greatest of all time");
		
		String str = null;
		Question4.Factorial(str);
		String fact = null;
		System.out.println("factorial="+fact);
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


	}

	