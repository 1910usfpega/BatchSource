package com.revature;

public class IntegerIsEven {
	
	public static boolean testEvenNumber(int number) {
		
		System.out.println("Number :"+ number + " is ");
		 int result= (number%2);
		 if(result==0) {
			 System.out.println("even number");
			 return true;
		 }
		 System.out.println(" ");
		 return false;
	}
}
