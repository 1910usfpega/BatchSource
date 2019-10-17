package com.revature.chaining;
//Constructor Chaining
public class Mouse {
	private int numTeeth;
	private int numwhiskers;
	private int weight;
	
	
public Mouse(int numTeeth, int numwhiskers, int weight) {
	super();
	this.numTeeth = numTeeth;
	this.numwhiskers = numwhiskers;
	this.weight = weight;
	
}

public Mouse(int numTeeth, int numWhiskers) {
    this(numTeeth, numWhiskers, 2);
}
public Mouse() {
    super();
}

public Mouse(int numTeeth) {
    this(numTeeth, 8);
}


@Override
public String toString() {
	return "Mouse [numTeeth=" + numTeeth + ", numwhiskers=" + numwhiskers + ", weight=" + weight + "]";
}

public static void main(String[] args) {
	Mouse m = new Mouse(73);
	System.out.println(m.toString());
	
}
}











