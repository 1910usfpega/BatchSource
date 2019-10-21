package com.revature.arithmatic;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math ex = new Math(5, 9);
		
		Math ex2 = new Math(18, 0);
		
		System.out.println(ex.getA() + " + " + ex.getB() + " is " + ex.addition());
		System.out.println(ex.getA() + " - " + ex.getB() + " is " + ex.subtraction());
		System.out.println(ex.getA() + " * " + ex.getB() + " is " + ex.multiplication());
		System.out.println(ex.getA() + " / " + ex.getB() + " is " + ex.division());
		
		System.out.println(ex2.getA() + " + " + ex2.getB() + " is " + ex2.addition());
		System.out.println(ex2.getA() + " - " + ex2.getB() + " is " + ex2.subtraction());
		System.out.println(ex2.getA() + " * " + ex2.getB() + " is " + ex2.multiplication());
		System.out.println(ex2.getA() + " / " + ex2.getB() + " is " + ex2.division());
	}

}
