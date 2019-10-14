package com.revature.dream;

public class Driver {
public static void main(String[] args) {
//	RocketShip a = new RocketShip(2,"red","modelA",false);
//	RocketShip b = new RocketShip(3,"green","modelB",true);
//	RocketShip c = new RocketShip(4,"orange","modelC",false);
//	RocketShip d = new RocketShip(2,"red","modelA",false);
//	RocketShip e = new RocketShip(6,"yellow","modeE",false);
//	System.out.println(a.toString());
//	System.out.println(b.toString());
//	System.out.println(c.toString());
//	System.out.println(d.toString());
//	System.out.println(e.toString());
//	System.out.println(a.equals(c));
//	System.out.println(a.equals(d));
	
	RocketShip[] rockets = new RocketShip [5]; //declare array of size 2
	RocketShip r1 = new RocketShip(2,"red","modelA",false); // first player object
	RocketShip r2 = new RocketShip(2,"red","modelA",false); // second player object
	RocketShip r3 = new RocketShip(3,"green","modelB",true);
	RocketShip r4 = new RocketShip(4,"orange","modelC",false);
	RocketShip r5 = new RocketShip(6,"yellow","modeE",false);
	rockets[0] = r1; 
	rockets[1] = r2;
	rockets[2] = r3; 
	rockets[3] = r4; 
	rockets[4] = r5; 
	
	for (int i = 0; i < rockets.length; i++) {
        if (i > 0) {
           System.out.println(", ");
        }
        System.out.print(rockets
        		[i]);
        System.out.println(r1.equals(rockets[i]));
     }
	
	
	
}
}
