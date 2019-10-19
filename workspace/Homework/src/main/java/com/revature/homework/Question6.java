package com.revature.homework;

import java.util.function.BooleanSupplier;

/******************************************************************************
 * Checks to see if the integer is even
 * @author Bryan Wood
 *
 *****************************************************************************/
public class Question6 {

	
	public static boolean isEven(int x) {
		while (x > 0) {
			x -= 2;
		}

		//if x is 0 the number passed in is even
		if (x == 0) {
			return true;
		} 
		//if the number is -1 the number is odd
		else {
			return false;
		}

	}

}
