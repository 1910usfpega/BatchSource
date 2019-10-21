package com.revature.bean;

public class FunWithFloats {
	
	/*
	 *  Do in driver
	 *  Q11. Write a program that would access two float-variables from a class that exists in another package. 
	 *  Note, you will need to create two packages to demonstrate the solution.	
	 * 
	 * */
	
	private float a = 2.5f;
	private float b = 15.8f;
	
	
	
	public FunWithFloats() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FunWithFloats(float a, float b) {
		super();
		this.a = a;
		this.b = b;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}
	
	
	
	
	

}
