//Single line comment
/* Multi
 * line
 * comment
*/

package com.revature.driver;

import java.sql.Date;

import com.revature.bean.*;
import com.revature.staticfun.FunWithStatic;

//Package- Namespace that organizes classes/interfaces, etc.

public class Driver {
	/*
	 * classes and projects: Pascal case- capitalize each word ex. ProjectMayhem
	 * methods and variables: camel case- lower case first word, all following words upper case ex. firstSecondThird
	 * package names: all lower case separated by periods ex. first.second.third
	 * constants: all caps separated by underscores ex ALL_CAPS_LOLZ
	 * 
	*/
	
	public static void main(String[] args) {
		/*
		 * public: open access
		 * void: doesn't return anything
		 * String[] args: parameter to be utilized in method
		 * 
		 * The main method is the entry point for the application/program
		*/
		
		
		System.out.println("Roll Tide");
		Person a=new Person("Matt", 33, 270);
		Person b=new Person("Guy", 24, 900);
		Person c=new Person("Gal", 25, 170);
		
		System.out.println(a.toString());
		a.setWeight(250);
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		
		//How importing works with multiple classes with the same name
		//Import one, explicitly call all others
		Date d= new Date(1);
		java.util.Date f= new Date(2);
		
		System.out.println(d.toString());
		System.out.println(f.toString());
		
		//How static methods work vs nonstatic methods
		FunWithStatic.StaticMethod();
		FunWithStatic fws = new FunWithStatic();
		fws.nonStaticMethod();
	}
	
	/*
	 * Members of a class can have different forms
	 * Variables, methods and constructors
	 * Instance Variables- property that belongs to a specific object
	 * Static Variables- property that belongs to the class/all instances
	 * Instance MEthods- Behavior related to a specific object
	 * Static Methods- Behavior relative to the entire class
	 * Constructors- Instantiates the class using the keyword "new"
	*/
}
