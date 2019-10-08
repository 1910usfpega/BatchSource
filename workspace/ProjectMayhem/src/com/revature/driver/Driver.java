package com.revature.driver;

import java.sql.Date;

import com.revature.bean.Person;

// Single comment
/*
 * Multiline comment
 * 
 * 
 */
//Package - name-space that organizes related classes,interface, etc.
/**
 * @author space
 *
 */
public class Driver {
	/*Naming conventions 
	 * 
	 * classes and projects: Pascal casing - capitalizing each word ex: ProjectMayhem
	 * methods and variables: camelCase - ex: firstSecondThirdFourthFifth
	 * package names: all lowercase delimited by periods
	 * constants: ALL_CAPS usually delimited by underscores
	 * 
	 */




	public static void main(String[] args) {
		/* public - anything can 'see' it
		 * void - returns void
		 * String[] args - parameter to be utilized in a method
		 * 
		 * The main method os the entry point for the program
		 */
		System.out.println("Droll Tide!");
		Person a= new Person("Bryan", 35, 185);
		System.out.println(a.toString());
		a.setWeight(200);
		System.out.println(a.toString());
		Date d= new Date(1);
		java.util.Date f = new Date(2);
		
		System.out.println(d.toString());
		System.out.println(f.toString());
	}
	/*
	 * Members of a class - class can have diff forms
	 * Constructors, Variables, and Methods
	 * Instance Variables - property that belongs to a specific object
	 * Static Variables - property that belongs to the class/all instances
	 * Instance Methods - behavior related to a specific object
	 * Static Methods - behavior that belongs to the entire class/all instances
	 * Constructors - instantiate class using the keyword "new"
	 */
}
