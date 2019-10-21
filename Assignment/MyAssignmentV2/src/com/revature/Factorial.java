package com.revature;

public class Factorial {
 public void factorialGo() {
	 int i1,fact=1;  
     int number=5;//It is the number to calculate factorial    
     for(i1=1;i1<=number;i1++){    
         fact=fact*i1;    
     }    
     System.out.println("Factorial of "+number+" is: "+fact); 
     
 }
}
