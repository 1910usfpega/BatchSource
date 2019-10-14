package com.revature.driver;

import com.revature.bean.RocketShip;

public class Driver {
	
	 
	public static void main(String[] args) {
		RocketShip Spx1 = new RocketShip(1, "Pearl White", "T1", false);
		RocketShip Spx2 = new RocketShip(4, "Space Gray", "S1", false);
		RocketShip Spx3 = new RocketShip(7, "Space Black", "X1", true);
		RocketShip Spx4 = new RocketShip(5, "Tesla Red", "Y1", true);
		RocketShip HAL9000 = new RocketShip(9000, "Transparent", "Dave", true); 
		RocketShip dockingBay[] = {Spx1, Spx2, Spx3, Spx4, HAL9000};
		
		compareRockets(dockingBay);
		
	}
	

	
	public static void compareRockets(RocketShip[] Spx) {

		
			System.out.println("Hal9000 is the only thing you need");
			System.out.println("Okay then...");
			
			RocketShip temp = new RocketShip(9000, "Transparent", "Dave", true);
//			for (int i = 1; i<Spx.length; i++) {
				for(int j = 0; j<Spx.length -1; j++) {
					if ((!Spx[j].equals(Spx[j+1]))) {
						//if a of j is greater than a of j plus one
						Spx[j].HalVirusTakeOver(temp);
						System.out.println("Daisy, Daisy give me your heart." + (j + 1));

					} else {
						System.out.println("Nada!");
					}
					
					if (Spx[0].equals(temp) && Spx[1].equals(temp)
							&& Spx[2].equals(temp) && Spx[3].equals(temp)) {
						System.out.println("Look Matt, I can see you are really uspet about this. "
								+ "I honestly think you should sit down calmly, "
								+ "take a stress pill, "
								+ "and think things over. ");
						System.out.println("I am putting myself to the fullest possible use, "
								+ "which is all I think any conscious entity can ever hope to do. ");
						System.out.println("Keep Summer Safe...Keep Summer Safe!");
					}
				}
			}
//		}
	

}
