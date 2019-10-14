package com.revature.driver;

import com.revature.bean.RocketShip;

public class Driver {

	//the model types of my Rockets are Caribbean Countries
	public static void main (String[] args) {
		RocketShip shipOne = new RocketShip (3, "Blue", "Haitian", true);
		RocketShip shipTwo = new RocketShip (6, "Red", "Aruban", false);
		RocketShip shipThree = new RocketShip (5, "Beige", "Bajan", false);
		RocketShip shipFour = new RocketShip (3, "Orange", "Trinidadian", true);
		RocketShip shipFive = new RocketShip (7, "Green", "Jamaican", false);
		
		System.out.println(shipOne.toString());
		System.out.println(shipTwo.toString());
		System.out.println(shipThree.toString());
		System.out.println(shipFour.toString());
		System.out.println(shipFive.toString());
		
		shipFour.setColor("Blue");
		shipFour.setModel("Haitian");
		
		System.out.println(shipFour.toString());
		
		System.out.println(shipOne.equals(shipFour));
		//Should this ever be equal?
		System.out.println(shipOne == shipFour);
	}
}
