package com.revature.homework;

import java.util.function.BooleanSupplier;

/******************************************************************************
 * 
 * @author Bryan Wood
 *
 *****************************************************************************/
public class Question6 {
	public Question6() {
	}

	public static boolean isEven(int x) {
		while (x > 0) {
			x -= 2;
		}

		if (x == 0) {
			return true;
		} else {
			return false;
		}

	}

}
