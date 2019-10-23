package com.revature.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Scanner;

public class FunWithJavaWeekB {

	static Scanner sc = new Scanner (System.in);
	static char [] nameString;
	static String anotherString;
	
	//Q1. Perform a bubble sort on the following integer array:  1,0,5,6,3,2,3,7,9,8,4
	public static String bubbleSort (int[] k) {
		//place to store numbers while switching them around
		int bucket = 0;
		//
		for (int i = 1; i < k.length; i++) {
			for (int j = 0; j < k.length - i; j++) {
				if (k[j] > k[j + 1]) {
					bucket = k[j]; 
					k[j] = k[j + 1];
					k[j + 1] = bucket;
					System.out.println(Arrays.toString(k));
				} 
			} 
		
		System.out.println("Attempt #" + i);
	} 
		return "hello";
}


	
	//Q2. Write a program to display the first 25 Fibonacci numbers beginning at 0.
	//fibonacci adds the previous number in the sequence with the following number
	//in the sequence (Xn + 2 = Xn+1 + Xn / Xn = Xn-1 + Xn-2)
	public static int fibonacci (int l) {
		
		for (int i = 0; i <= 26; i++) {
		if(i >= 0) 
			System.out.print(i + " ");
		    l = (i-1) + (i-2);
		
		}
		return l++;
	
	}
	
	
	
	//Q3. Reverse a string without using a temporary variable.  
	//Do NOT use reverse() in the StringBuffer or the StringBuilder APIs.
	/*step 1: create a random string
	 *step 2: decrement the string 
	 *step 3: look at all the string commands 
	 */
	
	static String teehee = "Are we not drawn onward to new era?";
	
	public static String reverseString (int a) {
		char[] reversal = teehee.toCharArray(); 
		for (a = reversal.length - 1; a > 0; a--) {
			
			System.out.println(reversal[a]);
		}
		return "The string is reversed";
	}
	
	
	
	//Q4. Write a program to compute N factorial.
	
	
	public static int factorial (int n) {
		if (n == 0)
		{
			return 1;
		}
		else 
		{
			return n* factorial(n - 1);
		}
	}
	
	
	
	/*Q5. Write a substring method that accepts a string str and an 
	 * integer idx and returns the substring contained between 0 and 
	 * idx-1 inclusive. Do NOT use any of the existing substring methods 
	 * in the String, StringBuilder, or StringBuffer APIs.
	 */
	
	public static String stringInclusive (String str, int idx) {
		char [] b = str.toCharArray();
		
		if (idx > 0 && idx < str.length()) {
			nameString = Arrays.copyOfRange(b, 0, idx);
			anotherString = new String (nameString); 
	} return anotherString;
	}
	
	
	/*Q6. Write a program to determine if an integer is even without using
	 * the modulus operator (%).
	 * 
	 */
	
	public static boolean evenThough (int even) {
		
		boolean isDefinitelyEven = true;
		for (int s = 1; s <= even; s++)
			isDefinitelyEven = !isDefinitelyEven;
		
			return isDefinitelyEven;
	}
	
	
	/*Q7. Sort two employees based on their  name, department, and age using 
	 * the Comparator interface.
	 * 
	 */
	
	
	/*Q8. Write a program that stores the following strings in an ArrayList 
	 * and saves all the palindromes in another ArrayList. 
	 * “karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, 
	 * “kayak”, “john”,  “refer”, “billy”, “did”
	 */
	
	/*The code is saying while were in the array list called firstList, print out each word.
	 * If the word matches the word before it, then stop the loop, but if the word matches itself
	 * then make a new String and copy the word using the copyValueOf method, and place it in the palindromeList.
	 * 
	 */
	
	public static char palindromes (int p) {
		ArrayList <String> palindromeList = new ArrayList <> ();
		
		palindromeList.add("karan");
		palindromeList.add("madam");
		palindromeList.add("tom");
		palindromeList.add("civic");
		palindromeList.add("radar");
		palindromeList.add("jimmy");
		palindromeList.add("kayak");
		palindromeList.add("john");
		palindromeList.add("refer");
		palindromeList.add("billy");
		palindromeList.add("did");
		
		
		ListIterator <String> listOWords= palindromeList.listIterator();
		p = 0;
		char[] reversing = listOWords.toCharArray(); 
		
		while ((reversing.length - p - 1) > 0 ) {
			if (!(reversing[p] == reversing[reversing.length - i - 1])) {
				break;
			}
			
			if ((reversing.length - p - 1) == p) {
				String word = String.copyValueOf(reversing);
				palindromeList.add(word);
			}
			p++;
		}
		return palindromeList;	
	}
	
	
	/*Q9. Create an ArrayList which stores numbers from 1 to 100 and prints out all 
	 * the prime numbers to the console.
	 * 
	 */
	
	public static int isPrimey (int lePrime) {
		
		int primeEnough = 1;
		for (int reallyPrime = 2; reallyPrime <= lePrime; reallyPrime++) {
			for (int primeCheck = 2; primeCheck <= reallyPrime/2; primeCheck++) {
				if (reallyPrime % primeCheck == 0) 
				{
					primeEnough = 0;
					break;
				}
		}
			if (primeEnough == 1) 
			{
				System.out.println(reallyPrime + " ");
			}
			return reallyPrime;
	}
	
	
	

	
	
}
	
}
	


