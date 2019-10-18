package com.revature.design;

public class Singleton {
	/*
	 * Singleton design Patern
	 * 	ensure a class only has one instance and provides
	 * "global" access to it 
	 */
	//private static instance of the self class
	private static Singleton instance;
	//private constructor
	private Singleton() {
		//logic here 
		
	}
	//public static synchronized method to get the unique instance - 
	//if it does not exist we will create it 
	public static synchronized Singleton getInstance() {//sync means one thread per instance(s)
		if(instance ==null) {
			instance = new Singleton();
		}
		return instance;
	}
	public void doSomething() {
		//what the object should do
	}
	

}
