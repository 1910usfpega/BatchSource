package com.revature.driver;
import com.revature.Person.Person;
import com.revature.staticfun.FunWithStatic;

public class Driver {
	/*Naming conventions 
	 * * classes and projects: Pascal casing- capitalize each word ex. ProjectMayhem
	 * methods and variables: camelCase, ex firstSeconThird
	 * package names: all lower case, separate by periods
	 * constants: ALL_CAPS_LOLZ
	 * 
	 */
	
	public static void main(String[] args) {//method signature
		/*
		 * public : anything can see it 
		 * void- doesn't return anything 
		 * String[] arg- parameter to be utilized in a method
		 * 
		 * The main method is the entry point for the project
		 */
		System.out.println("Roll Tide");{
			Person a = new Person("Matt", 33, 270);
			System.out.println(a.toString());
			a.setweight(250);
			System.out.println(a.toString());
			Person b = new Person("Sam", 22, 9000);
			System.out.println(b.toString());
			Person c = new Person("Stephen", 7,27 );
			System.out.println(c.toString());

			//Date d= new Date(10);
			//java.util.Date f= new Date(2);
			
			FunWithStatic.staticMethod();
			
	}
		/*
		 * Members of a class can have different forms 
		 * Variables, methods and Constructors
		 * Instance variables- property that belongs to a specific object
		 * Static variables - property that belongs to class/all instance
		 * Instance methods- behavior related to a specific object 
		 * Static methods- relative to the entire class
		 * Constructors- instantiates the class using the keyword "new"
		 */

	}
}
