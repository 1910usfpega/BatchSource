package com.revature.staticfun;

public class FunWithStatic {
	public void nonStaticMethod() {
		System.out.println("Not static, belongs to an object");
	}
	
	public static void StaticMethod() {
		System.out.println("Is static, belongs to class");
	}
	
}
