package com.revature;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ShowCase {
	public static void Show() {
		String Input = "R";
		double a = 9;
		//ArrayList<String> split = new ArrayList<>();
		
		String seperate = ("I am learning Core Java");
		
		switch(Input) {
		case "R":
			System.out.println(Math.sqrt(a));
			break;
		case "D":
			System.out.println(LocalDateTime.now());
			break;	
		case "S":
			String[] split = seperate.split(" ", 0);
			for (String b:split) 
			{System.out.println(b);}
			break;
		}
	}
}
