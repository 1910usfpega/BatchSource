package com.revature.driver;

import com.revature.bean.RocketShip;

public class Driver {

	public static void main(String[] args) {
	RocketShip alpha = new RocketShip(2,"Chrome", "Boeing", true);
	RocketShip bravo = new RocketShip(3, "Steel", "Tesla", false);
	RocketShip charlie = new RocketShip(6, "Black", "SpaceX", true);
	RocketShip delta = new RocketShip(8, "Chrome", "Virgin Galactic", true);
	RocketShip echo = new RocketShip();
	System.out.println("ALPHA: compared with Rockets B,C,D,E");
	System.out.println(alpha.equals(bravo));
	System.out.println(alpha.equals(charlie));
	System.out.println(alpha.equals(delta));
	System.out.println(alpha.equals(echo));
	System.out.println(" ");
	System.out.println("BRAVO: compared with Rockets C,D,E");
	//System.out.println(bravo.equals(alpha));
	System.out.println(bravo.equals(charlie));
	System.out.println(bravo.equals(delta));
	System.out.println(bravo.equals(echo));
	System.out.println(" ");
	System.out.println("Charlie: compared with Rockets D, E");
	//System.out.println(charlie.equals(alpha));
	//System.out.println(charlie.equals(bravo));
	System.out.println(charlie.equals(delta));
	System.out.println(charlie.equals(echo));
	System.out.println(" ");
	System.out.println("Delta: compared with Rocket E");
	//System.out.println(delta.equals(alpha));
	//System.out.println(delta.equals(bravo));
	//System.out.println(delta.equals(charlie));
	System.out.println(delta.equals(echo));
	System.out.println(" ");
//	System.out.println(alpha.hashCode());
//	System.out.println(bravo.hashCode());
//	System.out.println(charlie.hashCode());
//	System.out.println(delta.hashCode());
//	System.out.println(echo.hashCode());
	System.out.println("No matches found between rockets");
	System.out.println("Rocket Echo now being modeled after Rocket Alpha");
	echo.setNumOfRockets(2);
	echo.setColor("Chrome");
	echo.setModel("Boeing");
	echo.setHasMiniFridge(true);
	System.out.println("Rocket remodeling complete.");
	System.out.println("Authenticating Rocket Congruency between A & E:");
	System.out.println(echo.equals(alpha));
	
	
	

	}

}
