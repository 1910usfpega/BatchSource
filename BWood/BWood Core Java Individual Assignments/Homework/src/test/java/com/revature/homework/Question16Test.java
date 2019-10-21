package com.revature.homework;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

/**
 * 
 * Q16. Write a program to display the number of characters for a string input.
 *  	 The string should be entered as a command line argument using 
 *  	 (String [ ] args).
 * @author Bryan Wood
 * 
 */
class Question16Test {

	@Test
	static
	void test() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a command!");
		String[] test = sc.nextLine().split("");
		//Question16 q = new Question16();
		Question16.main(test);
		sc.close();
		
	}
public static void main(String[] args) {
	test();	
	}

}
