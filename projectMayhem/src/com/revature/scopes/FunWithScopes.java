package com.revature.scopes;
import com.revature.Person.Person;

public class FunWithScopes {
	{
		int c=4;
		System.out.println(c);
	}
	
	//b is static class scope, exists within this class 
	//all object of this type
	static int b =7;//static mans belongs to the class
	public static void main(String[] args) {
		//a is in method scope
		int a = 3;
		//System.out.println(c);
		Person p= new Person("John", 1000, 500);
		//Instance Method
		p.getName();
		Person.staticMethod();
		Person.homePlanet = "Mars";
		System.out.println(p.homePlanet);
	}
	public static void test() {
	    if(b==7) {//b belong only to a class
	    	int d = 3;
	    	System.out.println(b);
		System.out.println(d);
	    }
	}
}
