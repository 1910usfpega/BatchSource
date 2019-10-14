package com.revature.driver;

import com.revature.bean.RocketShip;

public class Driver {

	public static void main(String[] args) {
		RocketShip r1= new RocketShip(3,"ugly green","space bug",false);
		RocketShip r2= new RocketShip(3000,"silver","T-800",true);
		RocketShip r3= new RocketShip(60,"blue","ZX-25",false);
		RocketShip r4= new RocketShip(0,"red and white","health support",true);
		//RocketShip r5= new RocketShip(3000,"silver","T-800",true);
		RocketShip r5= new RocketShip(10000,"black","?",false);
		RocketShip[] hangar= {r1,r2,r3,r4,r5};
		
		compareShips(hangar);
		

	}
	
	public static void compareShips(RocketShip[] hangar) {
		boolean sameShips=false;
		for(int i=0; i<hangar.length;i++) {
			for (int j=0;j<hangar.length;j++) {
				if (i==j) {
					continue;
				}else if(sameShips==false && hangar[i].equals(hangar[j])){
					System.out.println("2 ships are the same: ship "+ (i+1) +" and ship "+ (j+1));
					System.out.println(hangar[i]+" and "+ hangar[j]);
					sameShips=true;
					break;
				}
			}
			
		}
		if(sameShips==false) {
			System.out.println("No ships match. Changing ship number 1 to match ship number 2:");
			System.out.println(hangar[0]);
			
			hangar[0].setColor(hangar[1].getColor());
			hangar[0].setNumOfRockets(hangar[1].getNumOfRockets());
			hangar[0].setModel(hangar[1].getModel());
			hangar[0].setHasMiniFridge(hangar[1].isHasMiniFridge());
			
			System.out.println("Ship has been changed.");
			System.out.println(hangar[0]);
			
		}
		
	}

}
