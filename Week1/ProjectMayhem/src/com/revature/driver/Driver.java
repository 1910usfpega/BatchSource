package com.revature.driver;

//import java.sql.Date;

import com.revature.bean.Person;
import com.revature.staticfun.FunWithStatic;

// Single comments
/*
 * Multiline
 * 
 * 
 * Comments
 * 
 * Woo
 */
//Package- namespace that organizes related classes/interfaces,etc
public class Driver {
 /*Naming Conventions
  * classes and projects: Pascal casing- capitlize each word ex. ProjectMayhem
  * methods and variables: camelCase, ex firstSecondThird
  * package names: all lowercase, separated by periods
  * constants:ALL_CAPS_LOLZ
  * 
  */
	
	
	public static void main(String[] args) {
		/*public- anything can "see" it
		 * void- doesn't return anything
		 * String [] arg- parameter to be utilized in a method
		 * 
		 * The main method is the entry point for the program
		 */
		System.out.println("Roll Tide");
		Person a= new Person("Matt",33,270);
		Person b= new Person("Sam", 22, 9000);
		Person c= new Person("Stephen", 7,27);
		System.out.println(a.toString());
		a.setWeight(250);
		System.out.println(a.toString());
		System.out.println(Person.getHomePlanet());
//		  Date d= new Date(1); 
//		  java.util.Date f= new Date(2);
		
		FunWithStatic.staticMethod();
		FunWithStatic fws= new FunWithStatic();
		fws.nonStaticMethod();
		
	}
	/*
	 * Members of a class- can have diff forms
	 * Variables, Methods and Constructors
	 * Instance variables- property that belongs to a specific object
	 * Static variables- property that belongs to class/all instances
	 * Instance methods- behavior related to a specific object
	 * Static methods- relative to the entire class
	 * Constructors- instantiates the class using the keyword "new"
	 */
}


