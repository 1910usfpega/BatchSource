package com.revature.evenoddandprime;

import java.util.ArrayList;

public class EvenOddAndPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> tenints = new ArrayList<Integer>();
		ArrayList<Integer> evens = new ArrayList<Integer>();
		ArrayList<Integer> odds = new ArrayList<Integer>();
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		for(int i = 1; i <= 10; i++) {
			tenints.add(i);
		}
		
		
		for(int oneint : tenints) {
			if(oneint % 2 == 0) {
				evens.add(oneint);
			}
			else {
				odds.add(oneint);
			}
		}
		
		for( int oneint : tenints) {
			boolean foundadiv = false;
			for(int i = 2; i <= oneint/2; i++) {	
				if(oneint % i == 0) {
					foundadiv = true;
					break;
				}
			}
			if(foundadiv == false) {
				primes.add(oneint);
			}
		}
		
		System.out.println("Even numbers:");
		for(int even : evens) {
			System.out.println(even);
		}
		
		System.out.println("Odd numbers:");
		for(int odd : odds) {
			System.out.println(odd);
		}
		
		System.out.println("Prime numbers:");
		for(int prime : primes) {
			System.out.println(prime);
		}
		
	}

}
