package com.revature.driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Homework 1 | Iskandar Bakhtizin");
		System.out.println("===============================");
		
		
		// Perform a bubble sort on the following integer array:  1,0,5,6,3,2,3,7,9,8,4
		System.out.println();
		System.out.println("==> Q1");
		int [] myArray = {1,0,5,6,3,2,3,7,9,8,4};
		System.out.println("Input: " + Arrays.toString(myArray));
		BubbleSort.sortMe(myArray);
		
		
		// Write a program to display the first 25 Fibonacci numbers beginning at 0
		System.out.println();
		System.out.println("==> Q2");
		PrintFib.start(25);
		
		
		// Reverse a string without using a temporary variable.  Do NOT use reverse() in the StringBuffer or the StringBuilder APIs.
		System.out.println("\n");
		System.out.println("==> Q3");
		ReversString.start("Revature");
		
		
		// Write a program to compute N factorial.
		System.out.println();
		System.out.println("==> Q4");
		Integer n = 5;
		Factorial.start(n);
		
		/*
		 * Write a substring method that accepts a string str and an integer idx 
		 * and returns the substring contained between 0 and idx-1 inclusive.  
		 * 
		 * Do NOT use any of the existing substring methods 
		 * in the String, StringBuilder, or StringBuffer APIs.
		 */
		System.out.println();
		System.out.println("==> Q5");
		String ss_in = "SomeStringString";
		Integer idx = 3;
		String ss_out = SubStringFun.substring(ss_in, idx);
		System.out.println("Sustring of string \""+ ss_in + "\" is: " + ss_out);
		
		
		// Write a program to determine if an integer is 
		// even without using the modulus operator (%)
		System.out.println();
		System.out.println("==> Q6");
		n = 6;
		
		if ((n / 2) * 2 == n) {
			System.out.println(n + " is Even");
		} else {
			System.out.println(n + " is Odd");
		}
		
		// Sort two employees based on their  name, department, and age 
		// using the Comparator interface.
		System.out.println();
		System.out.println("==> Q7 (not emplemented yet)");
		
		
		// Write a program that stores the following strings in an ArrayList 
		// and saves all the palindromes in another ArrayList.
		System.out.println();
		System.out.println("==> Q8");
		
		List<String> words = Stream.of("karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john",  "refer", "billy", "did").collect(Collectors.toList());
		System.out.println("Input: "+words.toString());
		List<String> palindromes = new ArrayList<String>();
		
		for (String word:words) {
			if (Palindrome.isPalindrome(word)) {
				palindromes.add(word);
			}
		}
		
		System.out.println("Palindromes: " + palindromes.toString());

		
		
		// Create an ArrayList which stores numbers from 1 to 100 and 
		// prints out all the prime numbers to the console.
		System.out.println();
		System.out.println("==> Q9");
		List<Integer> listOfIntegers = new ArrayList<Integer>();
		for (int i=1; i<101; i++) {
			listOfIntegers.add(i);
		}
		
		System.out.print("Prime numbers: ");
		for (Integer num:listOfIntegers) {
			if (PrimeNumber.checkPrime(num)) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
		
		
		//Find the minimum of two numbers using ternary operators
		System.out.println();
		System.out.println("==> Q10");
		
		int n1 = 1, n2 = 3, min;
		
		min = n1 < n2 ? n1 : n2;
		
		System.out.println("Min of "+n1+" and "+n2+" is "+min);
		
		
		
		
		

	}

}
