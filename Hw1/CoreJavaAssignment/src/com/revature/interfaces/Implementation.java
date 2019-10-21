package com.revature.interfaces;

public class Implementation implements Interfaces{

	@Override
	public void addition(double x, double y) {
		double z = x + y;
		System.out.println(x + " + " + y + " = " + z);
	}

	@Override
	public void subtraction(double x, double y) {
		double z = x - y;
		System.out.println(x + " - " + y + " = " + z);
		
	}

	@Override
	public void multiplication(double x, double y) {
		double z = x * y;
		System.out.println(x + " * " + y + " = " + z);
		
	}

	@Override
	public void division(double x, double y) {
		double z = x / y;
		System.out.println(x + " / " + y + " = " + z);
		
	}
	
	

}
