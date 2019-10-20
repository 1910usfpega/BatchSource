package com.revature.interfacedemo;

public class MathImplementation implements MathInterface{

	@Override
	public Double addition(Double arg1, Double arg2) {
		return arg1 + arg2;
	}

	@Override
	public Double substraction(Double arg1, Double arg2) {
		return arg1-arg2;
	}

	@Override
	public Double multiplication(Double arg1, Double arg2) {
		return arg1*arg2;
	}

	@Override
	public Double division(Double arg1, Double arg2) {
		return arg1/arg2;
	}
	
}
