package com.revature.rocket;

public class Driver {

	public static void main(String[] args) {
		RocketShip a = new RocketShip(5, "Green", "rx8", true);
		RocketShip b = new RocketShip(2, "Red", "rx8", true);
		RocketShip c = new RocketShip(5, "Green", "rt8", true);
		RocketShip d = new RocketShip(5, "Green", "rx8", false);
		RocketShip e = new RocketShip(5, "Yellow", "ty9", true);
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
		System.out.println(e.toString());
		if (a.equals(b) == false){
			b.setNumOfRockets(a.getNumOfRockets());;
			b.color = a.color;
			b.model = a.model;
			b.hasMiniFridge = a.hasMiniFridge;
		}
		if (a.equals(c) == false){
			c.setNumOfRockets(a.getNumOfRockets());;
			c.color = a.color;
			c.model = a.model;
			c.hasMiniFridge = a.hasMiniFridge;
		}
		if (a.equals(d) == false){
			d.setNumOfRockets(a.getNumOfRockets());;
			d.color = a.color;
			d.model = a.model;
			d.hasMiniFridge = a.hasMiniFridge;
		}
		if (a.equals(e) == false){
			e.setNumOfRockets(a.getNumOfRockets());;
			e.color = a.color;
			e.model = a.model;
			e.hasMiniFridge = a.hasMiniFridge;
		}
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(a.equals(e));
		System.out.println(b.equals(c));
		System.out.println(b.equals(d));
		System.out.println(b.equals(e));
		System.out.println(c.equals(d));
		System.out.println(c.equals(e));
		System.out.println(d.equals(e));

	
	}
	
	
}
