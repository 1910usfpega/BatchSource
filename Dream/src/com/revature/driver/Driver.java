//inside java project called: Dream
package com.revature.driver;

import com.revature.bean.RocketShip;

public class Driver {	
	
	public static void main(String[] args) {		
		
		RocketShip[] space = new RocketShip[5];
			
//instantiating 5 RocketShips
		space[0] = new RocketShip(10, "orange", "speedster", true);
		space[1] = new RocketShip(6, "red", "zipper", false); 
		space[2] = new RocketShip(15, "green", "zoom", false); 
		space[3] = new RocketShip(20, "blue", "flash", true);
		space[4] = new RocketShip(6, "red", "zipper", false);
		
			
//checking to see if there is a match 
		for(int i =0; i < space.length; i++) {
			for(int z = i+1; z < space.length; z++) {
				if(space[i].equals(space[z])) {
					System.out.println("There is a match!");
				}
			}
		}

	}
}
