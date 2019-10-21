package com.revature;

public class Palindrome {

static boolean isPalindrome(String entry) {
  for (int i = 0; i < entry.length(); i++) {
      if (entry.charAt(i) != entry.charAt(entry.length() - 1 - i)) {
      return false;
      }
  }
  return true;
	}
}
