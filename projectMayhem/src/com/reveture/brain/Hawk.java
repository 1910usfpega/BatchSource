package com.reveture.brain;

class Bird {
	{System.out.println("b1");}//instance code block will run before the constructor
	Bird() {
		System.out.println("b2");
	}
	static {System.out.println("b3"); }//static will run before all 

}
	
class Raptor extends Bird{
	static {System.out.println("r1");}//static will run before all 
	
	public Raptor() {
		System.out.println("r2");
	}
	{System.out.println("r3");}
	
	static {System.out.println("r4");}//static will run before all 
	
}

public  class Hawk extends Raptor {
	
	public static void main(String[] args) {//the main function is the entry point
		System.out.println("init");
		new Hawk();
		System.out.println("hawk");
	}
	
	public Hawk() {	
	}
}
//output:b3,r1,r4,init,b1,b2,r3,r2,hawk