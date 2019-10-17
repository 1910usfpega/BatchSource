package com.revature.scopes;

import com.revature.bean.Person;

public class FunWithScopes {
	{//c is block scope
		int c=4;
		System.out.println(c);
	}
	//b is static/class scope, exists within this class(all objects of this type)
	static int b=7;
	
	
	public static void main(String[] args) {
		// a is method scope, only exists in this method
		int a=3;
//		System.out.println(c);
		Person p = new Person("John", 10000, 500);
		System.out.println(p.getName());
		System.out.println(Person.getHomePlanet());
		System.out.println(p.toString());
		Person.setHomePlanet("Mars");
		System.out.println(Person.getHomePlanet());
	}
	
	public static void test() {
		System.out.println(b);
	}
}
