package com.revature.driver;

import com.revature.bean.*;

public class Driver {

	private static boolean[] sameRockets = {false, false, false, false, false};
	
	public static void main(String[] args) {
		
		RocketShip rocket1 = new RocketShip(4, "green", "Type I", false);
		RocketShip rocket2 = new RocketShip(8, "blue", "Type III", false);
		RocketShip rocket3 = new RocketShip(6, "pink", "Type VI", true);
		RocketShip rocket4 = new RocketShip(10, "red", "Type IX", true);
		RocketShip rocket5 = new RocketShip(12, "purple", "Type X", true);
		
		RocketShip[] rocketDock = {rocket1, rocket2, rocket3, rocket4, rocket5};
		
		for(int i=0; i<rocketDock.length-1;i++) {
			for(int j=rocketDock.length-2; j>i; j--) {
				if(rocketDock[i].equals(rocketDock[j+1])) {
					System.out.println("Rocket" + (i+1) + " and Rocket" + (j+1) + " are equal.");
					sameRockets[j] = true;
					sameRockets[j+1] = true;
				}
				else {
					System.out.println("Rocket" + (i+1) + " and Rocket" + (j+1) + " are not equal.");
				}
			}
		}
		
		if(sameRockets[0] == false && sameRockets[1] == false && sameRockets[2] == false && sameRockets[3] == false 
				&& sameRockets[4] == false) {
			System.out.println("No same rockets. Remodeling oldest rocket...");
			rocket1.remodel(rocket5);
			System.out.println("Remodel complete!");
			if(rocket1.equals(rocket5)) {
				System.out.println("Rocket1 and Rocket5 are equal.");
			}
		}
		else {
			System.out.println("Like rockets exist.");
		}

	}

}
