package com.revature.classtypes;

public class Shark extends Fish implements Hunt {

	@Override
	public void findPrey() {
		System.out.println("I eat fishes");
		
	}

	@Override
	public void swim() {
		System.out.println("I swim in the water and i'm terrifyung");
		
	}

	@Override
	public void breath() {
		System.out.println("I can breath under water");
		
	}

}
