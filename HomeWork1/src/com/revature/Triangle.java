package com.revature;

public class Triangle {

	
		
		    //Display the triangle on the console as follows using any type of loop.  Do NOT use a simple group of print statements to accomplish this.
		    //    0
		    //    1 0
		    //    1 0 1
		    //    0 1 0 1
	static boolean a = true;
		    public static int tri() {
		        for (int i = 0; i < 6; i++) {
		            for (int j = 0; j < i; j++) {
		            	if(a) {
		            		  System.out.print("0");
		            		  a = false;
		            	}
		            	else {
		            		  System.out.print("1");
		            	a = true;	  
		            	}
		            }
		            System.out.println("");
		        }
		    return 0;

		}

	

}
