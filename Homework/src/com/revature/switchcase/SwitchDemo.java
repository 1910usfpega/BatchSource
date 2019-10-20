package com.revature.switchcase;

import java.util.Arrays;
import java.util.Date;

public class SwitchDemo {
	public static void demo(Integer i) {
		switch (i) {
			case 1:
				Double num = 16.0;
				System.out.format("Square root of a %s is: %s\n", num, (Math.sqrt(num)));
				break;
				
			case 2:
				Date today = new Date();
				System.out.println("Today’s date: " + today.toString());
				break;
				
			case 3:
				String in_ss = "I am learning Core Java";
				System.out.println("Split string: " + in_ss);
				System.out.println("Splitted string: " + Arrays.toString(in_ss.split(" ")));
				break;
				
			default:
				break;
		}
	}
}
