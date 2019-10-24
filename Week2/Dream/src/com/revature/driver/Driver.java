package com.revature.driver;

import com.revature.bean.RocketShip;

public class Driver {

	public static void main(String[] args) {
		RocketShip[] rocketShips = {new RocketShip(5, "Blue", "One", false),
							  		new RocketShip(4, "Orange", "Two", false),
							  		new RocketShip(3, "Green", "Three", true),
							  		new RocketShip(2, "White", "Four", true),
							  		new RocketShip(1, "Black", "Five", true)};
		
		for(int i = 0; i < 5; i++) {
			System.out.println(rocketShips[i].toString());
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(rocketShips[i] == rocketShips[j] && i != j) {
					break;
				}
				else {
					rocketShips[0] = rocketShips[4];
				}
			}
		}
		
		System.out.println();
		for(int i = 0; i < 5; i++) {
			System.out.println(rocketShips[i].toString());
		}
		
		//Instance code block
		{System.out.println("I'm in an instance code block!");}
	}
	
	//Static code block
	static {System.out.println("I'm in an static code block!");}
	
}
