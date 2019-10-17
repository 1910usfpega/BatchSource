package com.revature.classtypes;

/*
 * Interface
 * 	specifies what a class must do, not how to do it
 * 	special type of class that CANNOT be instantiated
 * 	lacks instance variables
 * 	can mimic multiple inheritance w/ interfaces
 * 	methods are declared w/o body
 * 	classes can implement interfaces 0+
 * 	interfaces can extend other interfaces 0+
 * 	all variables are implicitly static, public, and final (java8)
 */

public interface Hunt {
	
	void findPrey();

}
