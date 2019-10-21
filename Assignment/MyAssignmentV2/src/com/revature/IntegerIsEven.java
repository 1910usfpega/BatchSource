package com.revature;

public class IntegerIsEven {
	
	
		
		public static boolean testEvenNumber(int number) {
			
			System.out.println("Number :"+ number + " is ");
			 int result= (number/2)*2;
			 if(result==number) {
				 System.out.println("even number");
				 return true;
			 } else {
			 System.out.println(" ");
			 return false;
			 }
		}

	
}

