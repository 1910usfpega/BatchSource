package com.revature.voodoo;
 
import java.lang.reflect.Constructor;

public class ReflectionDemo {
	
	public static void main(String[] args) {
		/*
		 * reflexion api - 
		 * a way for java to inspect itself at runtime 
		 * breaks encapsulation!
		 * Contains methods for runtime inspection of objects
		 * i.e class of object, fields methods constructors
		 * this includes private members!  
		 * can also instantiate things and invoke methods
		 * java.lang.reflect
		 */
		

		try {
		Class<?> c=Class.forName("javax.swing.JFrame");//making a new class object 
		System.out.println("Constructors:");
		Constructor <?>[] con = c.getConstructors();//getConstructors is instance because forName, we are making a new array in Constructor object 
		for(int i=0;i<con.length;i++) {
			System.out.println(con[i]);
		}
		}
		catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		
		
	}
}
