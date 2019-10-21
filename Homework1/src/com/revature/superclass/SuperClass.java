package com.revature.superclass;

public abstract class SuperClass {
	protected static String used;
	
	public SuperClass(String used) {
		this.used = used;
	}
	
	public abstract boolean hasCaps();
	
	public abstract String all_upper();
	
	public abstract int toIntPlus10();
	
}
