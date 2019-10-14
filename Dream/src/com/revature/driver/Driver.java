  
package com.revature.driver;
import java.util.Arrays;


import  com.revature.bean.RocketShip;

public class Driver {

	
	public static void main(String[] args) {//method signature

			RocketShip Rocketship1 = new RocketShip(2,"Brown","B1", true);
			RocketShip Rocketship2 = new RocketShip(3,"Black","B2", false);
			RocketShip Rocketship3 = new RocketShip(2,"White","B3", false);
			RocketShip Rocketship4 = new RocketShip(1,"Black","B4", true);
			RocketShip Rocketship5 = new RocketShip(5,"Yellow","B5", false);
			
			System.out.println(Rocketship1.toString());
			System.out.println(Rocketship2.toString());
			System.out.println(Rocketship3.toString());
			System.out.println(Rocketship4.toString());
			System.out.println(Rocketship5.toString());
			System.out.print("----------------\r\n");


			//Date d= new Date(10);
			//java.util.Date f= new Date(2);
			
			//FunWithStatic.staticMethod();
			
			RocketShip[] v = {Rocketship1,Rocketship2,Rocketship3,Rocketship4,Rocketship5};
			compareMe(v);
			
			for(int i = 0; i<v.length;i++) {
				System.out.println(v[i]);
			}


}



	private static void compareMe(RocketShip[] v) {
		// TODO Auto-generated method stub
		for (int i = 0; i<v.length-1;i++) {
			for(int j = i+1; j<v.length;j++) {
				if(v[i].equals(v[j])) {
					System.out.println("Equals");
				}
	            if(i == v.length-2) {
	            	v[i].setnumOfRockets(v[j].getnumOfRockets());
	            	v[i].setcolor(v[j].getcolor());
	            	v[i].sethasMiniFridge(v[j].gethasMiniFridge());
	            	v[i].setmodel(v[j].getmodel());
	            }
				
			}
				
		}
				
	}
		
}


