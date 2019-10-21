package com.revature.switchCase;

import java.time.LocalDateTime;

public class Switch {

	public static void switchCase(){
		
		for( int i = 1; i <=3; i++) {
		
			switch(i) {
			
			case 1: 
				System.out.println("The Square root of 10 is: "+ Math.sqrt(10));
				break;
			case 2:
				System.out.println(LocalDateTime.now());
				break;				
			case 3:
				String case3 = "I am learning Core Java";
			      String[] newString = case3.split(" ");
			      //List<String> itemList = Arrays.asList(items);
			      System.out.println(newString[0]);		
			      System.out.println(newString[1]);	
			      System.out.println(newString[2]);	
			      System.out.println(newString[3]);	
			      System.out.println(newString[4]);	
				break;			
			default:
				break;				
			}	
		}
		
	}

}
