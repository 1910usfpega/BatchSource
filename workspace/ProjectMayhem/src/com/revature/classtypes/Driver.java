package com.revature.classtypes;

import com.revature.bean.Person;

public class Driver {

	public static void main(String[] args) {

		SharkW shark= new SharkW();
		shark.breathe();
		shark.findPrey();
		shark.swim();
		
		Person p = new Person();
		p.findPrey();
	}

}
