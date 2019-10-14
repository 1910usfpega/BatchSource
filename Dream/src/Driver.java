
public class Driver {
	public static void main(String[] args) {
		//RocketShip #1
		System.out.println("RocketShip #1");
		RocketShip r1 = new RocketShip(155, "Orange", "Nasa F12", true);
		System.out.println(r1.getColor());
		System.out.println(r1.getHasMiniFridge());
		System.out.println(r1.getModel());
		System.out.println(r1.getNumOfRockets());
		//RocketShip #2
		System.out.println("RocketShip #2");
		RocketShip r2 = new RocketShip(155, "Orange", "Nasa F12", true);
		System.out.println(r2.getColor());
		System.out.println(r2.getHasMiniFridge());
		System.out.println(r2.getModel());
		System.out.println(r2.getNumOfRockets());
		//RocketShip #3
		System.out.println("RocketShip #3");
		RocketShip r3 = new RocketShip(155, "Orange", "Nasa F12", true);
		System.out.println(r3.getColor());
		System.out.println(r3.getHasMiniFridge());
		System.out.println(r3.getModel());
		System.out.println(r3.getNumOfRockets());
		//RocketShip #4
		System.out.println("RocketShip #4");
		RocketShip r4 = new RocketShip(15, "Pink", "Nasa 213", false);
		System.out.println(r4.getColor());
		System.out.println(r4.getHasMiniFridge());
		System.out.println(r4.getModel());
		System.out.println(r4.getNumOfRockets());
		//RocketShip #5
		System.out.println("RocketShip #5");
		RocketShip r5 = new RocketShip(15, "Red", "Nasa 414", true);
		System.out.println(r5.getColor());
		System.out.println(r5.getHasMiniFridge());
		System.out.println(r5.getModel());
		System.out.println(r5.getNumOfRockets());
		
		//Compare Object to see if they match
		if (r1.equals(r2)) {
			System.out.println("r1 and r2 are equal");
		}
		if (r2.equals(r3)) {
			System.out.println("r2 and r3 are equal");
		}
		if (r3.equals(r4)) {
			System.out.println("r3 and r4 are equal");
		}
		
	}
	
}
