package com.revature.assignment;


public class ImplementInterface implements Q15 {
	double num = 22;
	double num2=4;
	@Override
	public void add() {
		System.out.println("Implement addition: " + num +"+" + num2 + "=" + (num + num2));
		
	}

	@Override
	public void subtract() {
		System.out.println("Implement subtraction: " + num +"-" + num2 + "=" + (num - num2));
		
	}

	@Override
	public void multiply() {
		System.out.println("Implement multiplication: " + num +"x" + num2 + "=" + (num * num2));
		
	}

	@Override
	public void divide() {
		System.out.println("Implement division: " + num +"/" + num2 + "=" + (num / num2));
		
	}

}
