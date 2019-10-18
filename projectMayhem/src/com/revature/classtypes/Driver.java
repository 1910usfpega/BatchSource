package com.revature.classtypes;

import com.revature.bean.Person;

public class Driver {
	public static void main(String[] args) {
		Shark shark = new Shark();
		shark.breathe();
		shark.findPrey();
		
		Person p = new Person();
		p.findPrey();
	}
}
 