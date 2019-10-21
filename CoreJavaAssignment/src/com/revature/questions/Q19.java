package com.revature.questions;

import java.util.ArrayList;

public class Q19 {

	public static ArrayList<Integer> main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int i=1;i<=10;i++) {
			nums.add(i);
		}
		System.out.println("Original list:");
		System.out.println(nums);
		int newnum=0;
		for (int i=1;i<=9;i+=2) {
			newnum+=nums.get(i);
		}
		System.out.println("All evens added = "+newnum);
		newnum=0;
		for (int i=0;i<=9;i+=2) {
			newnum+=nums.get(i);
		}
		System.out.println("All odds added = "+newnum);
		ArrayList<Integer> primes=new ArrayList<Integer>();
		boolean prime;
		for(int x : nums) {
			if(x==1) {
				prime=false;
			}else {
				prime=true;
			}
			for (int i =2;i<x;i++) {
				if(x%i==0) {
					prime=false;
				}
			}
			if (prime==true) {
				primes.add(x);
			}
		}
		nums.removeAll(primes);
		System.out.println("The list with primes removed:");
		System.out.println(nums);
		return nums;
		

	}

}

//Create an ArrayList and insert integers 1 through 10. Display the ArrayList. Add all the                
//even numbers up and display the result. Add all the odd numbers up and display the result.  
//Remove the prime numbers from the ArrayList and print out the remaining ArrayList.
