package com.revature.homework;

import java.util.Date;

public class Question14 {
	public static void doTheThing(String thing) {
		switch(thing) {
		case "one":
			int a=64;
			System.out.print("the magic number is: "+a+"; ");
			System.out.println("the square root of the magic number is: "+ Math.sqrt(a));
			break;
		case "two":
			Date date = java.util.Calendar.getInstance().getTime();
			System.out.println(date);
			break;
		case "three":
			String core="I am learning Core Java";
			char [] c= core.toCharArray();
			for(int i=0; i<13;i++) {
			System.out.print(c[i]);
				}
			break;
		}
		
	}
}
