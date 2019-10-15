package com.revature.test;
/*
 * The switch statement is a multi-way branch statement. It provides an easy way to dispatch 
 * execution to different parts of code based on the value of the expression. 
 */
public class Test {
	public static void main(String[] args) {
	int i = 0;
	
	while(i != 4) {
		switch(i) {
		case 0:
			System.out.println(0);
			break;
		case 1:
			System.out.println(1);
		default:
			System.out.println("x");
			break;
	}
	i++;
}
	}
}
