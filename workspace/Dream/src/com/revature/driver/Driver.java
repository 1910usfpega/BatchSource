package com.revature.driver;
import com.revature.bean.rocketship.Rocketship;
public class Driver {
	
	static Rocketship[] listing = new Rocketship[5];
	
	
	
	public static void main(String[] args) {

		Rocketship a = new Rocketship(0, "","",false);
		listing[0] = a;
		Rocketship b = new Rocketship(3,"Grey","Saturn 5", true);
		listing[1] = b;
		Rocketship c = new Rocketship(6,"Black","Titan", false);
		listing[2] = c;
		Rocketship d = new Rocketship(3, "Grey", "Saturn 5", true);
		listing[3] = d;
		Rocketship e = new Rocketship();
		listing[4] = e;

		for (Rocketship x: listing) {
			for(Rocketship y: listing) {
				if (x != y) {
					System.out.println("Comparing Rocketship x to Rocketship y");
					System.out.println(x.equals(y)+": X Rocketship is the same as Y Rocketship");
				}
			}
		}

	}


}
