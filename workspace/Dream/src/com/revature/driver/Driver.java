package com.revature.driver;
import com.revature.bean.rocketship.Rocketship;
public class Driver {
	
	static Rocketship[] listing = new Rocketship[5];
	
	
	
	public static void main(String[] args) {

		Rocketship a = new Rocketship(0, "","",false);
		listing[0] = a;
		Rocketship b = new Rocketship(3,"Grey","Saturn 5", false);
		listing[1] = b;
		Rocketship c = new Rocketship(6,"Black","Titan", true);
		listing[2] = c;
		Rocketship d = new Rocketship(3, "Grey", "Saturn 5", true);
		listing[3] = d;
		Rocketship e = new Rocketship();
		listing[4] = e;

		for (Rocketship x: listing) {
			for(Rocketship y: listing) {
				if (x != y) {
					System.out.println("Comparing Rocketship "+x.toString()+" to Rocketship "+y.toString());
					System.out.println("True means they are the same, false means not: "+x.equals(y));
				}
			}
		}

	}


}
