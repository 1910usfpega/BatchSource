package com.revature.bean;

/*
 * Create a new java project called: Dream
 * Establish a bean class called RocketShip with the fields, numOfRockets, color, model, and hasMiniFridge.
 * Also include 1 static and 1 instance code block.
 * In a Driver class, which should be in a different class, instantiate 5 RocketShips and then see if any of those objects match.
 * If none match, use the appropriate steps to change the fields for 1 object to match another.
 * Push this project to your branch on the batch repository.
 */

public class RocketShip {

	int numOfRockets;
	String color;
	String model;
	boolean hasMiniFridge;
	
	//Main Constructor
	public RocketShip(int numOfRockets, String color, String model, boolean hasMiniFridge) {
		this.numOfRockets = numOfRockets;
		this.color = color;
		this.model = model;
		this.hasMiniFridge = hasMiniFridge;
	}
	
	//Default Constructor
	public RocketShip() {
		
	}

	//Getters and Setters
	public int getNumOfRockets() {
		return numOfRockets;
	}
	public void setNumOfRockets(int numOfRockets) {
		this.numOfRockets = numOfRockets;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public boolean isHasMiniFridge() {
		return hasMiniFridge;
	}
	public void setHasMiniFridge(boolean hasMiniFridge) {
		this.hasMiniFridge = hasMiniFridge;
	}
	//Getters and Setters
	
	public String toString() {
		return "RocketShip [Model = " + model + ", Color = " + color + ", Number of Rockets = " + numOfRockets + ", Mini Fridge = " + hasMiniFridge + "]";
	}
	
}
