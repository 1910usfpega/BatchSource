package com.revature.questions;

import java.util.ArrayList;

public class Q12 {
	/*
	 * Makes an arraylist of numbers 1 to 100
	 * then makes another array with only the evens.
	 * 
	 */

	public static ArrayList<Integer> main(String[] args) {
		int [] allNumbers= new int[100];
		for(int i=0;i<100;i++) {
			allNumbers[i]=i+1;
		}
		ArrayList<Integer> evens=new ArrayList<Integer>();
		for(int i:allNumbers) {
			if(i%2==0) {
				evens.add(i);
				System.out.println(i);
			}
		}
		return evens;

	}

}
