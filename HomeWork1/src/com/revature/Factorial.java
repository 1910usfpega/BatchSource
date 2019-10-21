package com.revature;
public class Factorial {
 public void factorialGo() {
	 int i=1;
	 int fac=1;  
     int number=5;//It is the number to calculate factorial    
     for(i=1;i<=number;i++){    
         fac=fac*i;    
     }    
     System.out.println("Factorial of "+number+" is: "+fac); 
 }
}
