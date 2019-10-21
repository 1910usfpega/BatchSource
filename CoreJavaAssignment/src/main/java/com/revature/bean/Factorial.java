package com.revature.bean;

public class Factorial {
	
	public void computeFactorial(int n) {
		
		 int i, factorialNum=1; 
		    
		  for(i=1;i<=n;i++)
		  {    
			  factorialNum = factorialNum * i;    
		  }    
		  System.out.println("The factorial of "+n+" is: "+factorialNum); 
	}

}
