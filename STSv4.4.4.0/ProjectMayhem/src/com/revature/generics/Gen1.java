package com.revature.generics;

public class Gen1<T> {

	/*
	 * Generics
	 * 	using a type as a class parameter
	 * 	write code that can handle different types of objects
	 * 	use angle brackets <> to denote that something is generic
	 * 	allows us to ensure safety
	 * 	adds stability and reusability to our code
	 * 	Placeholder (T, E, ?, etc.) - use instead of explicit type
	 */
	
	T ob;
	
	Gen1(T o){ ob=o; }
	
	T getob() {
		return ob;
	}
	
	void showType() {
		System.out.println("Type of T is: " + ob.getClass());
	}
	
}
