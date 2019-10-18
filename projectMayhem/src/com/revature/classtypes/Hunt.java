package com.revature.classtypes;
/*
 * (abstraction) specify what a class must do, but not how it does it
 * special type of class that cannot be instantiated
 * lack instance variables 
 * can mimic multiple inheritance w/ interfaces 
 * methods are declared w/o body 
 * classes can implement interfaces 0+
 * interfaces can extend other interfaces 0+
 * All variables are implicitly static, public and final (java8)
 */

public interface Hunt {
	void findPrey();
	
}
