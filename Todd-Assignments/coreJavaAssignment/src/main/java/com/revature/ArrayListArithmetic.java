package com.revature;

import java.util.ArrayList;

/**
 * Class ArrayListArithmetic
 * 
 * @author James Todd
 * 
 *         ArrayListArithmetic is a method designed to add up and display the
 *         even numbers, add up and display the odd numbers, and remove the
 *         prime numbers, given an ArrayList of Integers.
 * 
 *         Contains 4 methods: <method>arithmetic()</method>
 *         <method>addEven(ArrayList)</method>,
 *         <method>addOdd(ArrayList)</method>,
 *         <method>removePrime(ArrayList)</method>
 * 
 *         <method>arithmetic()</method> is a method that instantiates and
 *         populates the ArrayList to be used in addEven, addOdd, and
 *         removePrime. Also calls other methods.
 * 
 *         <method>addEven(ArrayList)</method> is a method that accepts an
 *         ArrayList and displays the sum of all even Integers within the
 *         ArrayList
 * 
 *         <method>addOdd(ArrayList)</method> is a method that accepts an
 *         ArrayList and displays the sum of all odd Integers within the
 *         ArrayList
 * 
 *         <method>removePrime(ArrayList)</method> is a method that accepts an
 *         ArrayList and removes all prime numbers from the ArrayList. METHOD
 *         RETURN TYPE ArrayList
 *
 */

public class ArrayListArithmetic {

	public static void arithmetic() {
		System.out.println("Q19");

		ArrayList<Integer> numbers = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			numbers.add(new Integer(i));
		}

		addEven(numbers);
		addOdd(numbers);
		numbers = removePrime(numbers);
		System.out.println("No prime ArrayList: " + numbers.toString() + "\n");

	}

	public static void addEven(ArrayList<Integer> o) {
		int total = 0;
		for (int i = 0; i < o.size(); i++) {
			if (o.get(i) % 2 == 0) {
				total += o.get(i);
			}
		}
		System.out.println("Even sum: " + total);

	}

	public static void addOdd(ArrayList<Integer> o) {
		int total = 0;
		for (int i = 0; i < o.size(); i++) {
			if (o.get(i) % 2 == 1) {
				total += o.get(i);
			}
		}
		System.out.println("Odd sum: " + total);
	}

	public static ArrayList<Integer> removePrime(ArrayList<Integer> o) {
		int count = 0;
		// Checks to see how many times a number is evenly divisible. Prime numbers can
		// only be evenly divided twice,
		// by 1 and by itself, with the exception of 1.
		for (int i = 0; i < o.size(); i++) {
			for (int j = 1; j <= o.get(i)/2; j++) {
				if (o.get(i) % j == 0) {
					count++;
				}
			}
			// 1 is a prime number. Display 1
			if (i == 1) {
				o.remove(i);
			}
			// Remove prime numbers
			if (count == 2) {
				o.remove(i);
			}
			count = 0;
		}
		return o;
	}
}
