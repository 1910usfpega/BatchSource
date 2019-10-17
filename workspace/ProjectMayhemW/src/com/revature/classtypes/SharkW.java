package com.revature.classtypes;

public class SharkW extends FishW implements HuntW {

	@Override
	public void findPrey() {
		System.out.println("I ate fishies");
		
	}

	@Override
	public void swim() {
		System.out.println("I swim in the water and I'm terrifying");		
	}

	@Override
	public void breathe() {
		System.out.println("I breathe underwater, meeeeeegh");		
	}

}
