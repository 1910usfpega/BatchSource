package com.revature.design;

public class Singleton {
	/*
	 * Singleton Design Pattern ensure a class only has one instance and provides
	 * "global" access to it
	 * 
	 */
//	private static instance of the self class
	private static Singleton instance;

	// private constructor
	private Singleton() {
		// logic goes here
	}

	// public static synchronized method to get the unique instance
	public static synchronized Singleton getInstance() {
		// if it does not exist, we will create it
		if (instance == null)
			instance = new Singleton();

		return instance;
	}
	
	public void doSomething() {
		//what the object should do
	}
	
}
