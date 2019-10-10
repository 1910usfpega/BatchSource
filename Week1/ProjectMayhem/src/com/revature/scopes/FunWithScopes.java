package com.revature.scopes;

import com.revature.bean.Person;

public class FunWithScopes {
	static int b = 2;
	
	
	public static void main(String[] args) {
		Person p = new Person("Andy", 25, 270);
		//instance method
		p.getName();
		test();
	}
	
	public static void test() {
		int b =5;
		System.out.println(b);
	}

}
