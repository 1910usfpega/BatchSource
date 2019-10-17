package com.revature.scopes;

import com.revature.bean.Person;

public class FunWithScopes {

	//b is static-- exists within the scope of class FunWithScopes (all objects of this type)
	static int b=7;
	
	{
		//c is block-- only exists within the scope of the brackets
		int c=4;
	}
	
	public static void main(String[] args) {
		//a is instance-- exists only within THIS method's scope
		int a=3;
		Person p = new Person("John", 10000, 500);
		//Instance method
		p.getName();
		//Static Methods
		Person.staticMethod();
		Person.homePlanet="Mars";
		//Works-- Displays p's home planet BUT should be called as a static reference
		System.out.println(p.homePlanet);
		//System.out.println(c);
	}
	
	public static void test() {
		if(b==7) {
		int d=8;
		System.out.println(b);
		System.out.println(d);
		}
		
	}
}
