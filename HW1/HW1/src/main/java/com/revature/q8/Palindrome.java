package com.revature.q8;

import java.util.ArrayList;

public class Palindrome {
	
	public static ArrayList<String> myArrayList = new ArrayList<>();
	public static ArrayList<String> myPalindromeList = new ArrayList<>();
	
	public static void palinDrome(){

		myArrayList.add("karan"); myArrayList.add("madam"); myArrayList.add("tom");
		myArrayList.add("civic"); myArrayList.add("radar"); myArrayList.add("jimmy");
		myArrayList.add("kayak"); myArrayList.add("john"); myArrayList.add("refer");
		myArrayList.add("billy"); myArrayList.add("did");
		
		for (int i = 0; i < myArrayList.size(); i++) {
			boolean isPalindrome = true;
			int j = 0;
			int k = myArrayList.get(i).length() - 1;
			while (j < k) {
				if (myArrayList.get(i).charAt(j) != myArrayList.get(i).charAt(k)) {
					isPalindrome = false;
					break;
					}
				else {
					j++;
					k--;
				}
			}
			if (isPalindrome == true) {
				myPalindromeList.add(myArrayList.get(i));
			}
		}
		
		System.out.println("Original ArrayList: " + myArrayList);
		System.out.println("\tPalindrome ArrayList: " + myPalindromeList);
	}
}

