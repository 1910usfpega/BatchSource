package com.revature.dream;




public class Driver {

	public static void main(String[] agrs) {

		RocketShip q= new RocketShip(6, "red", "1212-C", true);

		RocketShip w= new RocketShip(6, "green", "1212-C", true);

		RocketShip e= new RocketShip(6, "blue", "1212-C", true);

		RocketShip r= new RocketShip(6, "gren", "1212-C", true);

		RocketShip t= new RocketShip(6, "purple", "1612-A", true);	

		boolean	match = check(q,w,e,r,t);

		print(match);

		if (!match) {

		focusMatch(q,w);	

		match = check(q,w,e,r,t);

		print(match);

		}

	

		

	}

	

public static boolean check(RocketShip ... a) {

	for(int i = 0; i < a.length;i++) {

		for(int j = 0; j < a.length;j++) {

			if(i==j) {}

			else

				if (a[i].equals(a[j])==true)return true;

}

		}

	

	

	return false;

	

}

public static void  focusMatch(RocketShip a, RocketShip b) {

	int numOfRockets = a.getNumOfRockets();

	String color = a.getColor();

	String model = a.getModel();

	boolean hasMiniFridge = a.isHasMiniFridge();

	

	b.setColor(color);

	b.setHasMiniFridge(hasMiniFridge);

	b.setModel(model);

	b.setNumOfRockets(numOfRockets);

}

public static void print(boolean match) {

	if(match)

		System.out.println("there is a match");

	else {

		System.out.println("there is no matching rocketships good sir");

	}

}

}
