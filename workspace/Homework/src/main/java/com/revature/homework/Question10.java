package com.revature.homework;


/******************************************************************************
 * Q10. Find the minimum of two numbers using ternary operators.
 * @author Bryan Wood
 *
 *****************************************************************************/
public class Question10 {

	public Number getMin(Number x,  Number y) {
		
		return x.longValue()<=y.longValue()?x:y;
	}
}
