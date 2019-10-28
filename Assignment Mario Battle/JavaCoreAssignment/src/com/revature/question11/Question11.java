package com.revature.question11;

public class Question11 {
static 	float a = 55f;
	static float b = 21f;

	public static void getA() {
		System.out.println(a);
	}

	public static void getB() {
		System.out.println(b);
	}


	@Override
	public String toString() {
		return "AccessFloat [a=" + a + ", b=" + b + "]";
	}
}
