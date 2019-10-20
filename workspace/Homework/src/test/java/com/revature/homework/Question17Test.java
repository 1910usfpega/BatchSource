package com.revature.homework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * Q17. Write a program that calculates the simple interest on the principal, 
 *  	 rate of interest and number of years provided by the user. Enter 
 *  	 principal, rate and time through the console using the Scanner class.
 *  	 Interest = Principal* Rate* Time
 *  
 * @author Bryan Wood
 *
 */
class Question17Test {

	@Test
	static void test() {
		Question17 q = new Question17();
		q.calculateMoneyThings();
	}

}
