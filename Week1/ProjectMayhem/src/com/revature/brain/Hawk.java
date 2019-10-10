package com.revature.brain;

class Raptor extends Bird {
    static { System.out.println("r1"); 
    
    }
    
    public Raptor() {
   	 System.out.println("r2");
    }

    { System.out.println("r3"); }
    
    static { System.out.println("r4"); }
}

class Bird{
    { System.out.println("b1"); } 
    Bird() {
   	 System.out.println("b2");
    }

    static { System.out.println("b3");  }  	 
}

public class Hawk extends Raptor {
 static {System.out.println("Test");}
	public static void main(String[] args) {
	   	 System.out.println("init");
	   	 new Hawk();
	   	 System.out.println("hawk");
	    }

    public Hawk() {
    }
}

