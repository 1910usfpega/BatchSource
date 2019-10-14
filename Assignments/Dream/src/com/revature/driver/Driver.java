package com.revature.driver;

import java.util.ArrayList;

import com.revature.bean.RocketShip;

public class Driver {
	
	public static void main(String[] args) {
		/*public- anything can "see" it
		 * In a Driver class, which should be in a different class, instantiate 5 RocketShips and 
		 * then see if any of those objects match.
			If none match, use the appropiate steps to change the fields for 1 object to match another.
			Push this project to your branch on the batch repository
		 */
		
		RocketShip a = new RocketShip(4, "blue", "USF",true);
		RocketShip b = new RocketShip(5, "red", "NASA",false);
		RocketShip c = new RocketShip(2, "green", "RCA",false);
		RocketShip d = new RocketShip(15, "fuschia", "UTECH",true);
		RocketShip e = new RocketShip(8, "lavender", "UWI",false);
		
		ArrayList<RocketShip> rocketShipList = new ArrayList<RocketShip>();
		
		rocketShipList.add(a);
		rocketShipList.add(b);
		rocketShipList.add(c);
		rocketShipList.add(d);
		rocketShipList.add(e);
		
		System.out.println(" ");
		
		for(int i = 0; i<rocketShipList.size(); i++) {			
			System.out.println(rocketShipList.get(i).toString());					
		}
		
		
		for(int x = 0; x<rocketShipList.size()-1; x++) {
			for(int z = x+1; z<rocketShipList.size(); z++) {
//				System.out.println(" ");
//				System.out.println("x- "+ x);
//				System.out.println("z- "+ z);
				if (rocketShipList.get(z).equals(rocketShipList.get(x))) {
					System.out.println(" ");
					System.out.println("Match Found");
					System.out.println(rocketShipList.get(x).toString());
					System.out.println(rocketShipList.get(z).toString());
				}
			
				if (x == rocketShipList.size()-2){
					rocketShipList.get(z).setNumOfRockets(rocketShipList.get(x).getNumOfRockets());
					rocketShipList.get(z).setColor(rocketShipList.get(x).getColor());
					rocketShipList.get(z).setModel(rocketShipList.get(x).getModel());
					rocketShipList.get(z).setHasMiniFridge(rocketShipList.get(x).isHasMiniFridge());
					
					System.out.println(" ");
					
					for(int n = 0; n<rocketShipList.size(); n++) {
						System.out.println(rocketShipList.get(n).toString());		
					}
				}
			}
		}
		
		
		

		
	}

}
