package com.revature.dream;

public class Driver {
public static void main(String[] args) {
	RocketShip a = new RocketShip(2,"red","modelA",false);
	RocketShip b = new RocketShip(3,"green","modelB",true);
	RocketShip c = new RocketShip(4,"orange","modelC",false);
	RocketShip d = new RocketShip(2,"red","modelA",false);
	RocketShip e = new RocketShip(6,"yellow","modeE",false);
	System.out.println(a.toString());
	System.out.println(b.toString());
	System.out.println(c.toString());
	System.out.println(d.toString());
	System.out.println(e.toString());
	System.out.println(a.equals(c));
	System.out.println(a.equals(d));
	
}
}
