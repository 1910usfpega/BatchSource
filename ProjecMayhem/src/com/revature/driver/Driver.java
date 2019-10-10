package com.revature.driver;

import com.revature.bean.*;
import com.revature.staticfun.FunWithStatic;

// Single comments 

/* 
 * Multiline comment
 * 
 * 
 * 
 */

// Package - namespace that organizes related classes/interfaces, etc 

public class Driver {
	/*Naming Conventions
	 * 
	 * classes and projects: Pascal casig - capitalize each word ex. ProjectMayhem
	 * methods and variables: camelCase, ex. firstSecondThird
	 * package names: all lowercase, separated by periods
	 * constant: ALL_CAPS
	 * 
	 * 
	 * 
	 *Code blocks - {things between curly braces}
	 */
	
	public static void main(String[] args) {
		/*
		 * public - anything can "see" it
		 * void - doesn't return anything
		 * String[] arg - parameter to be utilized in a method
		 * 
		 * The main method is the entry point for the program
		 */
		
		System.out.println("Roll Tide");
		Person a = new Person("Matt", 33, 270);
		Person b = new Person("Sam", 22, 9000);
		Person c = new Person("Stephen", 7, 27);
		
		System.out.println(a.toString());
		a.setWeight(250);
		System.out.println(a.toString());
		
		
		FunWithStatic.staticMethod();
		FunWithStatic fws = new FunWithStatic();
		fws.nonStaticMethod();
		
		
	}
	
	/* 
	 * Members of a class - can have diff forms
	 * Variables, Methods, Constructors
	 * 
	 * Instance variables - property that belongs to a specific object
	 * Static variables - property that belongs to class/all instances
	 * Instance methods – behavior related to a specific object
	 * Static methods - relative  to the entire class
	 * Constructor - instances the class using the keyword "new"
	 */
	
	
}
