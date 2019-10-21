package com.john;
/**
 * Write a program that defines an interface
 *  having the following methods:
 *   addit	ion, subtraction, multiplication, and division.
 *    Create a class that implements this interface
 *     and provides appropriate functionality
 *      to carry out the required operations.
 *       Hard code two operands in a test class
 *        having a main method that calls the implementing class.
 * @author johnljennings
 *
 */

public class Q15BasicArithmetic implements DoMath {

	
	public double addition(int add1, int add2) {
		return	add1 += add2;
	}

	
	public double substraction(int sub1, int sub2) {
		return sub1 -= sub2;
	}

	
	public double multiplication(double multi1, double multi2) {
		return multi1 *= multi2;
	}

	
	public double division(double div1, double div2) {
		return div1 /= div2;
	}


	
}
