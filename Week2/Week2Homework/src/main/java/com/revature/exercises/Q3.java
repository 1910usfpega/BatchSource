package com.revature.exercises;

public class Q3 {
	public static String reverseMe(String reverse) {
		for (int i = 0; i < reverse.length(); i++) {
			reverse = reverse.substring(1, reverse.length() - i) + reverse.substring(0, 1)
					+ reverse.substring(reverse.length() - i, reverse.length());
		}
		System.out.println(reverse);
		return reverse;
	}

}
