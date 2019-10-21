package com.revature;

public class InterfaceDefinition implements InterfaceQ15{

	{System.out.println("Q15");}
	
	@Override
	public int aaddition(int a, int b) {
		
		return a+b;
	}

	@Override
	public int subtraction(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int multiplication(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double division(int a, int b) {
		// TODO Auto-generated method stub
		return (double) a/b;
	}


}
