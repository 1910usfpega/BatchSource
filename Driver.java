package com.revature.bean;

public class Driver {
	
	public static void main(String[] args) {
		//Instantiate 5 RocketShips
		RocketShip[] rocket = new RocketShip[5];
		for(int i = 0; i < 5; i++) {
			if(i == 0)
				rocket[i] = new RocketShip(2,"Red","HMS-9900",false);
			else if(i == 1)
				rocket[i] = new RocketShip(4,"Blue","JME-8500",true);
			else if(i == 2)
				rocket[i] = new RocketShip(3,"Green","JAS-8740",true);
			else if(i == 3) 
				rocket[i] = new RocketShip(4,"Orange","KDO-1820",false);
			else if(i == 4)
				rocket[i] = new RocketShip(3,"White","KJF-9432",true);
			System.out.println("RocketShip " + (i+1) + ": [" + rocket[i].toString());
		}
		
		//Checking to see if rocket 3 is equal to rocket 4
		System.out.println("Rocket 3 is equal to Rocket 4: " + rocket[2].equals(rocket[3]));
		
		//Changing the fields of rocketship 3 to match rocketship 4
		System.out.println("Changing Rocketship 3 to match Rocketship 4...");
		rocket[2].setNumOfRockets(rocket[3].getNumOfRockets());
		rocket[2].setColor(rocket[3].getColor());
		rocket[2].setModel(rocket[3].getModel());
		rocket[2].setHasMiniFridge(rocket[3].getHasMiniFridge());
		System.out.println("RocketShip 3" + ": [" + rocket[2].toString());
		
		//Checking to see if rocket 3 is equal to rocket 4 now
		System.out.println("Rocket 3 is equal to Rocket 4: " + rocket[2].equals(rocket[3]));
	}
}
