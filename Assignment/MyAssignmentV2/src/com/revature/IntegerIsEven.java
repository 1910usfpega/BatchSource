package com.revature;

public class IntegerIsEven {
	
	public static int testEvenNumber(int number) {
		
		System.out.println("Number :"+ number + " is ");
		 int result= (number/2)*2;
		 if(result==number) {
			 System.out.println("even number");
		 }
		 System.out.println(" ");
		return result;
	}
}
