package com.revature.driver;

import java.sql.Date;

import com.revature.bean.Person;
//* means to access the src of all of...(anything before the *)
import com.revature.staticfun.FunWithStatic;

//package - name space that organizes related classes interfaces,etc
//.create a folder

public class Driver {
	
	/*Naming conventions
	 * classes and projects: Pascal casing -capitlize each word ex. ProjectMayhem
	 * methods and variables: camelCase, ex firstSecondThird
	 * package names: all lowercase, seperated by periods
	 * constant: variable that does not change: ALL_CAPS_LOLZ
	 */
	
	/*Code blocks - {things between}
	 * 
	 */
	//Instance code block - Runs b4 the constructor
	{System.out.println("im in an instance code block");}
	//Static code block
	static {System.out.println("Im in a static code block");}
	
	public static void main(String[] args) {
		/* public-anyone can see
		 * void- doesnot return anything
		 * String [] args- parameter to be utilized in a method
		 * 
		 * the main method is the main entry point for the program
		 */
		System.out.println("Roll Tide Roll");
		Person a= new Person("Matt" ,33, 270);
		Person b = new Person("Sam", 22, 9000);
		Person c = new Person("Stephen", 2, 27);
		System.out.println(a.toString());
		a.setWeight(250);
		System.out.println(a.toString());
		System.out.println("Person.getHomePlanet");
		
//		Date d = new Date(1);
//		java.util.Date f= new Date(2);

		FunWithStatic.staticMethod();
		FunWithStatic fws = new FunWithStatic();
		fws.nonStaticMethhod();
		
	}
	/*Members of a class 
	 * Variables and methods and Constructors 
	 * Two types of variables-instanace var = belongs to the obj
	 * static var- property that belongs to the class /all instances
	 * Instance methods- behavior related to a specified object
	 * Static methods-relative to the entire class
	 * Constructor- instantiates the class using the keyword "new"
	 */
	

}
