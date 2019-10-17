package com.revature.driver;
import com.revature.dream.RocketShip;
public class Driver13 {

	public static void main(String[] args) {
		RocketShip rocket1 =new RocketShip (2, "blue", "toyota", true); 
				
		RocketShip rocket2 =new RocketShip  (6, "red", "chrystler", false);
		
		RocketShip rocket3 =new RocketShip (9, "green", "honda", true);
		
		RocketShip rocket4 =new RocketShip  (12, "purple", "dodge", false);
		
		RocketShip rocket5 =new RocketShip  (33, "orange", "nissan", true);
		
		System.out.println("is rocket5 equals rocket4 " + rocket5.equals(rocket4));
		// TODO Auto-generated method stub
		rocket4.setNumofRockets(2);
		rocket5.setNumofRockets(rocket4.getNumofRockets());
		
		rocket4.setColor("purple");
		rocket5.setColor(rocket4.getColor());
		
		rocket4.setModel("honda");
		rocket5.setModel(rocket4.getModel());
		
		rocket4.setHasMiniFridge(true);
		rocket5.setHasMiniFridge(rocket4.getHasMiniFridge());
		
		System.out.println("is rocket4 equals to rocket5 " + rocket4.equals(rocket5));
		
		

	}

}
