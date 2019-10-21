package com.revature.exercises;

public class Q4 {
	public static int factorial() {
		 int i,fact=1;  
	     int number=5;//It is the number to calculate factorial    
	     for(i=1;i<=number;i++){    
	         fact=fact*i;    
	     }    
	     System.out.println("Factorial of "+number+" is: "+fact);
		return fact; 
	     
	 }

}
