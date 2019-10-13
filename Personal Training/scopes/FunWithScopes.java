package com.revature.scopes;

import com.revature.bean.Person;

public class FunWithScopes {
	
	{//is a block scope 
		int c=4;
		System.out.println(c);
	}
	
	//Static class Scope, exist within the class
	//(all object of this type)
	
	
	
	static int b = 7;
	
	public static void main(String[] args) {
		//a is the method scope, only exis here
		int a = 3;
		System.out.println(c);
		Person p = new Person("John", 10000, 500);
		//instanec method
		p.getName();
		
		
	}
	
	public static void test() {
		if (b==7) {
			int d= 8;
		System.out.println(b);
		}
		System.out.println();
	}

}
