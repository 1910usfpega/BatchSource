package com.revature.driver;

import com.revature.bean.RocketShip;

public class Driver {
	public static Boolean flag = false;
	
	public static void main(String [] args) {
		RocketShip r1 = new RocketShip(2, "white", false);
		RocketShip r2 = new RocketShip();
		RocketShip r3 = new RocketShip(10, "grey", true);
		RocketShip r4 = new RocketShip(2, "blue", true);
		RocketShip r5 = new RocketShip(3, "black", true);
		
		// Add all RocketShips to array
		RocketShip [] fleet = {r1, r2, r3, r4, r5};
		
		// Compare all RocketShips
		for (int i=0; i<fleet.length; i++) {
			for (int j=i+1; j<fleet.length; j++) {
				System.out.println(fleet[i].toString());
				System.out.println(fleet[j].toString());
				System.out.println("Equal: " + fleet[i].equals(fleet[j]));
				System.out.println();
				
				if (flag == true) {
					continue;
				} else {
					flag = fleet[i].equals(fleet[j]);
				}
				
			}
		}
		
		//
		if (flag) {
			System.out.println("There is same RocketShips");
		} else {
			System.out.println("No same RocketShips");
			
			System.out.println("Change numOfRockets for r1 from "+r1.getNumOfRockets() + " to 1");
			r1.setNumOfRockets(1);
			System.out.println("Equal R1, R2: " + r1.equals(r2));
		}
		
		
	}
}
