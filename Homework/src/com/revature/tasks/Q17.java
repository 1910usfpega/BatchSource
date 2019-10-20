package com.revature.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q17 {
	/*
	 * Write a program that calculates the simple interest on the principal, rate of
	 * interest and number of years provided by the user. Enter principal, rate and
	 * time through the console using the Scanner class.
	 * 
	 * Interest = Principal* Rate* Time
	 */

	public static Scanner sc = new Scanner(System.in);

	public static void driver() {

		System.out.println();
		System.out.println("==> Q17");

		List<Number> interest_variables = new ArrayList<Number>();

		interest_variables = getPrincipal(interest_variables);
		System.out.println("Cool! You principal is: $" + interest_variables.get(0).toString());

		interest_variables = getInterestRate(interest_variables);
		System.out.println("Your Rate is: " + interest_variables.get(1).toString() + "%");

		interest_variables = getTime(interest_variables);
		System.out.println("Your Time is: " + interest_variables.get(2).toString());

		System.out.println();
		System.out.println("Your interest is: $" + (interest_variables.get(0).doubleValue()
				* (interest_variables.get(1).doubleValue() / 100) * interest_variables.get(2).doubleValue()));
	}

	private static List<Number> getTime(List<Number> interest_variables) {
		System.out.println("Input your time:");

		while (true) {
			if (sc.hasNextDouble()) {
				interest_variables.add(sc.nextDouble());
				break;
			} else if (sc.hasNextInt()) {
				interest_variables.add(sc.nextInt());
				break;
			} else {
				String content;
				content = sc.nextLine();
			}
			System.out.println("Time shoud be number more than 0. Try again:");
		}

		return interest_variables;
	}

	private static List<Number> getPrincipal(List<Number> interest_variables) {
		System.out.println("Input your principal:");
		while (true) {
			if (sc.hasNextDouble()) {
				interest_variables.add(sc.nextDouble());
				break;
			} else if (sc.hasNextInt()) {
				interest_variables.add(sc.nextInt());
				break;
			} else {
				String content;
				content = sc.nextLine();
			}
			System.out.println("Principal shoud be number more than 0. Try again:");
		}

		return interest_variables;
	}

	private static List<Number> getInterestRate(List<Number> interest_variables) {
		System.out.println("Input your Rate in %:");
		while (true) {
			if (sc.hasNextDouble()) {
				interest_variables.add(sc.nextDouble());
				break;
			} else if (sc.hasNextInt()) {
				interest_variables.add(sc.nextInt());
				break;
			} else {
				String content;
				content = sc.nextLine();
				if (content.contains("%")) {
					System.out.println("Enter only value without % symbol. Ex: 10.0 or 10");
				}
			}
			System.out.println("Principal shoud be number more than 0. Try again:");
		}

		return interest_variables;
	}
}
