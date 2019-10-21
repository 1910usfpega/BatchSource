package com.revature.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {

		List<Integer> numbs = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			numbs.add(i);
		}

		System.out.println("Original list: " + numbs.toString());

		int even = 0;
		int odd = 0;
		for (int i = 0; i < 10; i++) {
			if (numbs.get(i) % 2 == 0) {
				even += numbs.get(i);
			} else {
				odd += numbs.get(i);
			}
		}
		System.out.println("The even number sum is: " + even);
		System.out.println("The odd number sum is: " + odd);

		
		List<Integer> prime = new ArrayList<Integer>();
		for (int y : numbs) {
			int count = 0;
			for (int n = y; n >= 1; n--) {
				if (y % n == 0) {
					count += 1;
				}
			}
			if (count == 2) {
				prime.add(y);
			}
		}
		numbs.removeAll(prime);
		System.out.println("Non primes: " + numbs);

	}

}
