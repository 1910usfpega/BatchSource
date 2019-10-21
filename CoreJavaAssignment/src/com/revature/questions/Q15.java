package com.revature.questions;

import com.revature.differentpackage.Implementor;
public class Q15 {

	public static double main(String[] args) {
		double a=7.0;
		double b=3.5;
		
		Implementor imp=new Implementor();
		
		System.out.println(imp.addition(a, b));

		System.out.println(imp.subtraction(a, b));

		System.out.println(imp.multiplication(a, b));

		System.out.println(imp.division(a, b));
		return imp.addition(a, b);

	}

}
