package com.revature.driver;

import com.revature.dream.RocketShip;

public class Driver {

	public static void main(String[] args) {
		RocketShip rocket1 = new RocketShip(2, "red", "wrangler", true);
		RocketShip rocket2 = new RocketShip(2, "red", "wrangler", true);
		RocketShip rocket3 = new RocketShip(2, "blue", "highlander", false);		
		RocketShip rocket4 = new RocketShip(2, "red", "denali", true);
		RocketShip rocket5 = new RocketShip(2, "red", "rubicon", true);
		
		System.out.println("is rocket1 equals rocket 2 " + rocket1.equals(rocket2) + "\n");
		System.out.println("is rocket2 equals rocket 3 " + rocket2.equals(rocket3) + "\n");
		
		System.out.println("now will use setters to make the rocket2 and rocket3 equals");
		
		rocket2.setNumOfRockets(1);
		rocket3.setNumOfRockets(rocket2.getNumOfRockets());
		
		rocket2.setColor("blue");
		rocket3.setColor(rocket2.getColor());
		
		rocket2.setModel("rubicon");
		rocket3.setModel(rocket2.getModel());
		
		rocket2.setHasMiniFridge(true);
		rocket3.setHasMiniFridge(true);
		
		System.out.println("is rocket2 equals rocket 3 " + rocket2.equals(rocket3) + "\n");
		
		System.out.println("park anywhere? " + RocketShip.getPlanetParkAnywhere() + "\n");
		
		System.out.println(rocket4.toString());
		
		
		
		
	}

}
