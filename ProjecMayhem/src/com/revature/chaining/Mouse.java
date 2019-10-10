package com.revature.chaining;
// Constructor Chaining
public class Mouse {
	private int numTeeth;
	private int numWhiskers;
	private int weight;
	
	
	@Override
	public String toString() {
		return "Mouse [numTeeth=" + numTeeth + ", numWhiskers=" + numWhiskers + ", weight=" + weight + "]";
	}


	public Mouse() {
		super();
	}


	public Mouse(int numTeeth, int numWhiskers, int weight) {
		super();
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
		this.weight = weight;
	}
	
	public Mouse (int numTeeth, int numWhiskers) {
		this(numTeeth, numWhiskers, 16);
	}
	
	public Mouse(int numTeeth) {
		this(numTeeth, 8);
	}
	
	public static void main(String[] args) {
		Mouse m = new Mouse(74);
		System.out.println(m.toString());
	}
}
