package com.revature.bean;

public class DoOperation implements Operation{

	@Override
	public void addition() {
		int a,b, res;
		a=7;
		b=10;
		res = a+b;
		
		System.out.println("Addition : " + a + " + " + b + " = " + res );
		
	}

	@Override
	public void subtraction() {
		int a,b, res;
		a=1222;
		b=10;
		res = a-b;
		
		System.out.println("Subtraction : " + a + " - " + b + " = " + res );
	}

	@Override
	public void multiplication() {
		int a,b, res;
		a=12;
		b=134;
		res = a*b;
		
		System.out.println("Multiplication : " + a + " * " + b + " = " + res );
		
	}

	@Override
	public void division() {
		int a,b, res;
		a=99;
		b=3;
		res = a/b;
		
		System.out.println("Division : " + a + " / " + b + " = " + res );
		
		
	}
	

}
