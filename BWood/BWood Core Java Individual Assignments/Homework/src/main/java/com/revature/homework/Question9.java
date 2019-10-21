package com.revature.homework;

import java.util.ArrayList;
import java.util.List;

/******************************************************************************
 * Create an ArrayList which stores numbers from 1 to 100 and prints out all the
 * prime numbers to the console.
 * 
 * @author Bryan Wood
 *
 *****************************************************************************/

public class Question9 {

	ArrayList<Integer> a = new ArrayList<Integer>();

	public int[] countingPrimes() {
		List<Integer> r = new ArrayList<Integer>();

		for (int i = 0; i < 100; i++) {
			boolean isNotPrime = false;
			a.add(i + 1);
			if (i >1) {
				for (int j = 2; j <= i / 2; j++) {

//					if(i==2)
//						System.out.println(i+ ": is a Prime Number.");
					if (i % j == 0) {
						isNotPrime = true;
						break;
					}
				}
				if (!isNotPrime) {
					r.add(i);
				}
			}
		}
		int[] result = new int[r.size()];
		for(int i =0;i<r.size();i++)
			result[i]= r.get(i);
		System.out.println("The Prime numbers between 1-100 are : ");
		for(int i: result)
			System.out.print(i+" ");
		System.out.println();
		return result;

	}

}
