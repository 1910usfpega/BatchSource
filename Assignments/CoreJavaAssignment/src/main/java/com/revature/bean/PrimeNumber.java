package com.revature.bean;

import java.util.ArrayList;

public class PrimeNumber {
	/*
	 * Q9. Create an ArrayList which stores numbers from 1 to 100 and prints out all the prime numbers to the console
	 * 
	 * Q19. Create an ArrayList and insert integers 1 through 10. Display the ArrayList. 
	 * Add all the even numbers up and display the result. Add all the odd numbers up and display the result. 
     * <<Remove the prime numbers from the ArrayList and print out the remaining ArrayList.>>

	 * */
	public void runPrimecheck(int n) {
		ArrayList<Integer> i = new ArrayList<Integer>();
		
		for(int j =1; j <= n; j++) {
			i.add(j);
			
		}
		
		for(int x: i) {
			checkPrime(x);
		}
		
		
	}
	
	
	public void checkPrime(int n){  
		int i,z=0,flag=0;      
	
		z=n/2;      
		if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		}
		else{  
			for(i=2;i<=z;i++){      
				if(n%i==0){      
			
					System.out.println(n+" is not prime number");      
					flag=1;      
					break;      
				}      
			}      
		if(flag==0)  { System.out.println(n+" is prime number"); }  
		} 
	}
	
	

	public boolean checkPrimeTest(int n){  
		int i,z=0,flag=0;      
	
		z=n/2;      
		if(n==0||n==1){    
			return false;
		}
		else{  
			for(i=2;i<=z;i++){      
				if(n%i==0){       
					
					flag=1;      
					return false;
				}      
			}      
		if(flag==0)  { return true; }  
		}
		return false; 
	}
	
	
	
	public ArrayList<Integer> delPrimeNum(ArrayList<Integer> i ){
		
		ArrayList<Integer> idx = new ArrayList<Integer>();
		
		for(int x = 0; x < i.size(); x++) {
			if(checkPrimeTest(x) == true) {
				idx.add(i.get(x));
			}
			
		}
		for(int x = 0; x < i.size(); x++) {
			if(idx.get(x)==i.get(x)){i.remove(x);}
		}
		
		return i;
		}

}
