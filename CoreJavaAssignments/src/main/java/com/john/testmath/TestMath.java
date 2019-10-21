package com.john.testmath;

import com.john.Q15BasicArithmetic;

public class TestMath {
	public static void main(String[] args) {
		
		Q15BasicArithmetic callMath = new Q15BasicArithmetic();
		System.out.println(callMath.addition(3, 4));
		System.out.println(callMath.division(4, 6));
		System.out.println(callMath.multiplication(3, 6));
		System.out.println(callMath.substraction(4, 5));
	}
}
