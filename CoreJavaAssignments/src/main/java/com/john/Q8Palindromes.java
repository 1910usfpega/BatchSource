package com.john;

import java.util.ArrayList;

public class Q8Palindromes {
	public static ArrayList<String> str = new ArrayList<String>();
	// Dont forget the {} BRACES! John you FOO
	public static String[] strArr = { "karan", "madam", "tim", "civic",
			"radar", "jimmy", "kayak", "john", "refer", "billy", "did" };

	public static void palindrome() {
		ArrayList<String> rts = new ArrayList<String>();
		for (String i : strArr) {
			if (i.equals(Q3ReverseString.backwards(i))) {
				rts.add(i);
				System.out.println(i);

			}
		}
	}
}
