package com.revature.classtypes;

import com.revature.bean.Person;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shark shark = new Shark();
		shark.breath();
		shark.findPrey();
		shark.swim();
		
		Person p = new Person();
		p.findPrey();
	}

}
