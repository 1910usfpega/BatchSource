package com.revature.questions;

import java.util.ArrayList;

public class Q9 {
	static ArrayList<Integer> allNumbers = new ArrayList<Integer>();
	static ArrayList<Integer> primes = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		getPrimes();
		
		
	}
	
	public static int getPrimes(){
		for (int i=1;i<100;i++) {
			allNumbers.add(i);
			boolean prime=true;
			for (int j=2;j<i;j++) {
				if(i%j==0){
					prime=false;
				}
			}
			if(prime==true && i!=1) {
				primes.add(1);
				System.out.println(i);
			}
		}
		return primes.size();
	}
}
