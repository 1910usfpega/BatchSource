package com.revature.assignment;

import java.util.ArrayList;

public class Q8 {
	public static void main(String[] args) {
		ArrayList<String> pal = new ArrayList<>();
		pal.add("Karan");
		pal.add("madam");
		pal.add ("tom");
		pal.add ("civic");
		pal.add ("jimmy");
		pal.add ("kayak");
		pal.add ("john");
		pal.add ("refer");
		pal.add ("billy");
		pal.add("did");
	System.out.println(pal);	
	ArrayList<String> store = new ArrayList<>();
	
	for (int i = 0; i < pal.size(); ++i) {
	    String longestPalindrome = null;
	    String candidate = "";
	    for (int j = i; j < pal.size(); ++j) {
	        candidate += pal.get(j);
	        if (candidate != null)
	            longestPalindrome = candidate;
	    }

	    if (longestPalindrome != null)
	       store.add(longestPalindrome);
	}
	System.out.println(store);
	
}
	}