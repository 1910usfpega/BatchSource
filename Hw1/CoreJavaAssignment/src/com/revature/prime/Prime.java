package com.revature.prime;

import java.util.ArrayList;
import java.util.List;

public class Prime {

	public static String prime() {
		List<Integer> nums = new ArrayList<Integer>();
		List<Integer> prime = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
			nums.add(i);
		}

		for (int y : nums) {
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

		System.out.println(prime);
		return prime.toString();

	}

}
