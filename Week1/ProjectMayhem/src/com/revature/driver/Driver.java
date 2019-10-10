package com.revature.driver;

import java.sql.Date;

import com.revature.bean.Person;

//ctrl + shift + o generates imports for you

public class Driver {
	public static void main(String[] args) {
		
		System.out.println("Hello, World");
		
		Person a = new Person("Andy", 21, 265);
		System.out.println(a.toString());
		
		a.setWeight(250);
		System.out.println(a.toString());
		
		//to call a static field, no object you use the class
		System.out.println(Person.getHomeplanet());
		
	}

	
}

