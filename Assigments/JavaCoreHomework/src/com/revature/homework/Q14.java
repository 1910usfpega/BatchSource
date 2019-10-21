package com.revature.homework;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q14 {
	public static String switchcase() {
		switch(3) {
		
		
		case 1:
			System.out.println(Math.sqrt(4));
			break;
			
		case 2:
			DateFormat df = new SimpleDateFormat("dd/MM/yy");
			Date dateobj = new Date();
			System.out.println(df.format(dateobj));
			break;
			
		case 3:
			String str = "I am learning Core Java";
			String[] arrOfStr = str.split(" ");
			
			for (String a : arrOfStr)
				System.out.println(a);
			break;
			
		}
	
		return "Switching";}

}
