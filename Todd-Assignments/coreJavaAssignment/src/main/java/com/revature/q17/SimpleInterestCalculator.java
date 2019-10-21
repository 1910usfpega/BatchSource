package com.revature.q17;

	/**
	 * 	Class SimpleInterestCalculator
	 * 	@author James Todd
	 * 
	 * 	SimpleInterestCalculator is a class designed to calculate interest based on 3 variables passed in by the console: principal,
	 *		time in years, and rate of interest.
	 *
	 *	One method: <method>calcInterest(int, double, int)</method>
	 *
	 *	<method>calcInterest(int, double, int)</method> is a method that accepts 3 parameters in the order of principal, rate, and time.
	 *		All 3 parameters are multiplied to calculate interest. METHOD RETURN TYPE: int interest.
	 *
	 */

public class SimpleInterestCalculator {
	
	public static double calcInterest(int principal, double rate, int time) {
		System.out.println("Q17");
		
		double interest = principal*rate*time;
		return interest;
		
		
	}

}
