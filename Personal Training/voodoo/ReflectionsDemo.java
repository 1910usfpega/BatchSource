package com.revature.voodoo;

import java.lang.reflect.Constructor;

public class ReflectionsDemo {

	public static void main(String[] args) {
		/*reflection API
		 * a way for java to inspect itself at runtime 
		 * breaks encapsulation!!
		 * Contains methods for runtime inspection for objects 
		 * i.e Class of object, fields methods constructors 
		 * this includes private members
		 * can also instantiate things and invoke methods
		 * java.lang.reflect		 
		 */
		
		try {
			Class<?>c = Class.forName("Javax.swing.JFrame");
		
		System.out.println("Construtors:");
		Constructor <?> [] con = c.getConstructors();
		for(int i=0; i<con.length; i++) {
			System.out.println(con[i]);
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
