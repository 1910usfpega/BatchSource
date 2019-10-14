package com.revature.chaining;
//method chaining is when we have an object and we are calling methods on that object 

public class Mouse {
	private int numTeeth;//making variables private is a good practice in terms of security 
	private int numWhiskers;
	private int weight;
	private String color;


public Mouse(int numTeeth, int numWhiskers, int weight, String color ) {
	super();
	this.numTeeth = numTeeth;//numTeeth is an object and numTeeth is an instance variable of class Mouse
	this.numWhiskers = numWhiskers;//numWhiskers is an object and an instance variable of the class Mouse 
	this.weight = weight;//weight is an object and an instance variable of the class Mouse
	this.color = color;
}
	
public Mouse(int numTeeth, int numWhiskers, int weight) {//constructor super class with 3 parameters
	this(numTeeth, numWhiskers, weight, "Brown");
}

public Mouse(int numTeeth, int numWhiskers) {//constructor with 2 parameters
	this(numTeeth, numWhiskers, 16);
}
public Mouse(int numTeeth) {//constructor with 1 parameter
	this(numTeeth, 8);
}
public static void main(String[] numTeeth) {//main method 
	Mouse m= new Mouse(73);//I create an object m with single parameter. When this object will be called the single parameter will be passed to that object
	System.out.println(m.toString());
}

@Override
public String toString() {
	return "Mouse [numTeeth=" + numTeeth + ", numWhiskers=" + numWhiskers + ", weight=" + weight + ", color=" + color+ "]";
}



}