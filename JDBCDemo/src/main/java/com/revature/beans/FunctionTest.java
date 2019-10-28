package com.revature.beans;

public class FunctionTest {
	private String f1;
	private int f2;
	
	public FunctionTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FunctionTest(String f1, int f2) {
		super();
		this.f1 = f1;
		this.f2 = f2;
	}

	public String getF1() {
		return f1;
	}

	public void setF1(String f1) {
		this.f1 = f1;
	}

	public int getF2() {
		return f2;
	}

	public void setF2(int f2) {
		this.f2 = f2;
	}

	@Override
	public String toString() {
		return "FunctionTest [f1=" + f1 + ", f2=" + f2 + "]";
	}
	
	
	
	
	
}
