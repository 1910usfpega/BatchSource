package com.revature.driver;

import com.revature.bean.RocketShip;

public class RocketShipDriver {

	public static void main(String[] args) {
		RocketShip a = new RocketShip(2, "blue", "leer", true);
		RocketShip b = new RocketShip(3, "red", "boeing", false);
		RocketShip c = new RocketShip(5, "green", "ACR" , true);
		RocketShip d = new RocketShip(2, "purple", "leer", true);
		RocketShip e = new RocketShip(4, "aqua", "Prius", false);
		
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		System.out.println(c.equals(d));
		System.out.println(d.equals(e));
		System.out.println(a.equals(c));
		System.out.println(b.equals(d));
		System.out.println(c.equals(e));
		System.out.println(d.equals(a));
		System.out.println(e.equals(b));
		System.out.println(a.equals(e));
		
		
		d.setColor("blue");
		
		System.out.println(a.equals(d));
		
		
	}

}
