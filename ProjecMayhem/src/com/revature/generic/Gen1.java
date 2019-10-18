package com.revature.generic;

public class Gen1<T> {
	/*
	 * Generics 
	 *	using a type as a parameter
	 *write code that can handle diff types of objects
	 *use angle brackets <> to denote 
	 */
	
	// Declare an object of type T
	T ob;
	
	Gen1(T o) {
		ob=o;
	}
	
	void showType() {
		System.out.println("Type of T is: " + ob.getClass().getName());
	}
	
	
}
