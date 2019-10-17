package com.revature.voodoo;

import java.lang.reflect.Constructor;

public class ReflectionDemo {

	public static void main(String[] args) {
		/*
		 * Reflection API- a way for java to inspect itself at runtime
		 * Breaks encapsulation!
		 * Contains methods for runtime inspection of objects
		 * i.e Class of object, fields, methods, constructors
		 * This includes private members!
		 * Can also instantiate things and invoke methods
		 * Package- java.lang.reflect
		*/
		
		
		try {
			Class<?> c = Class.forName("javax.swing.JFrame");
			System.out.println("Constructors:");
			Constructor <?>[] con = c.getConstructors();
			for(int i=0; i<con.length; i++) {
				System.out.println(con[i]);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
