package com.revature.driver;
import com.revature.beans.*;

public class Driver {

	public static void main(String[] args) {
	RocketShip jessie = new RocketShip(3,"red","Team Rocket",true);
	RocketShip james = new RocketShip(5,"black","Team Rocket",true);
	RocketShip meowth = new RocketShip(2,"silver","Team Rocket",false);
	RocketShip ekans = new RocketShip(3,"red","Team Rocket",true);
	RocketShip koffing = new RocketShip(7,"purple","Team Rocket",false);
	
	System.out.println(jessie.toString());
	System.out.println(james.toString());
	System.out.println(meowth.toString());
	System.out.println(ekans.toString());
	System.out.println(koffing.toString());
	boolean match = rocketTest(jessie,james,meowth,ekans,koffing);
	if(match) {
		System.out.println("Matching rockets!");
	}
	else System.out.println("Rockets are not blasting");
	
	boolean match2 = rocketTest(jessie,james,meowth,ekans,koffing);
	print(match2);
	if(!match2) {
		forceMatch(jessie, ekans);
		match2 = rocketTest(jessie,james,meowth,ekans,koffing);
	print(match2);
	}
	
	}
	private static void print(boolean match2) {
		if(match2) {
			System.out.println("Rockets are already matching!");
		}
		else System.out.println("Force match applied! Rockets are now matching!");
		
	}
	public static boolean rocketTest(RocketShip ...r) {
		for(int i=0;i<r.length; i++) {
			for(int j=0;j<r.length;j++) {
				if (i==j) {
					}
				else 
					if(r[i].equals(r[j])==true)return true;
			
			}
		}
		return false;
	}
	public static void forceMatch(RocketShip a, RocketShip b) {
		int numOfRockets = a.getNumOfRockets();
		String color = a.getColor();
		String model = a.getModel();
		boolean hasMiniFridge = a.isHasMiniFridge();
		
		b.setNumOfRockets(numOfRockets);
		b.setColor(color);
		b.setModel(model);
		b.setHasMiniFridge(hasMiniFridge);
	}
}


