package com.revature.homework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Q15. Write a program that defines an interface having the following methods:
 * addition, subtraction, multiplication, and division. Create a class that
 * implements this interface and provides appropriate functionality to carry out
 * the required operations. Hard code two operands in a test class having a main
 * method that calls the implementing class.
 * 
 * @author Bryan Wood
 *
 */
class Question15Test {
	private static int a = 5;
	private static int b = 25;

	@Test
	void test() {
	}
	
public static void main(String[] args) {
	Question15 q= new Question15();
	System.out.println("My adder states 5+25= "+q.addition(a, b));
	System.out.println("My subtractor states 25-5= "+q.subtraction(b,a));
	System.out.println("My multiplier states 5+25= "+q.multiplication(a, b));
	System.out.println("My divider states 5+25= "+q.division(b, a));
	
}
}
