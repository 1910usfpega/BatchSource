package com.revature.arithmatic;

public class Math implements Arithmatic{
	private int a;
	private int b;
	
	public Math(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public int addition() {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public int subtraction() {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public int multiplication() {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public int division() {
		// TODO Auto-generated method stub
		int answer;
		
		if (b == 0) {
			answer = 999999999;
		}
		else {
			answer = a / b;
		}
		return answer;
	}
}
