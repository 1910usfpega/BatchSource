package com.revature.voodoo;

import java.lang.reflect.Constructor;

public class ReflectionsDemo {
	/*
	 * reflection api- a way for java to inspect itself at runtime. 
	 * breaks encapsulation. 
	 * contains methods for the runtime inspection of objects. 
	 * i.e Class of object, fields, methods, and constructors. Includes private members. 
	 * can also instantiate things and invoke those methods.
	 * java.lang.reflect
	 */

	public static void main(String[] args) {
		
		try {
			Class<?> c = Class.forName("javax.swing.JFrame");
			
			System.out.println("Constructors: ");
			
			Constructor<?>[] con = c.getConstructors();
			
			for(int i=0; i<con.length; i++) {
				System.out.println(con[i]);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
