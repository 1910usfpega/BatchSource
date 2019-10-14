package com.revature.dream;

/*
 * 
Create a new java project called: Dream
Establish a bean class called RocketShip with the fields, numOfRockets, color, model, and hasMiniFridge.
Also include 1 static and 1 instance code block.
In a Driver class, which should be in a different class, instantiate 5 RocketShips and then see if any of those objects match.
If none match, use the appropiate steps to change the fields for 1 object to match another.
Push this project to your branch on the batch repository.
 */
public class RocketShip {
	private int numOfRockets;
	private String color;
	private String model;
	private boolean hasMiniFridge;
	
	static boolean planetParkAnywhere = true;
	
	//static code block, should welcome you when u initialize a rocket-ship.
	static {
		System.out.println("Welcome aboard my rocket ship" + "\n");
	}
	
	//instance code block, prints for every instance
	{
	 System.out.println("creating a rocket for you");
	}
	
	public RocketShip(int numOfRockets, String color, String model, boolean hasMiniFridge) {
		this.numOfRockets = numOfRockets;
		this.color= color;
		this.model = model;
		this.hasMiniFridge = hasMiniFridge;
		
	}
	//no-args constructor
	public RocketShip() {
		
	}
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

	public static boolean getPlanetParkAnywhere() {
		return planetParkAnywhere;
	}
	public static void setPlanetParkAnywhere(boolean parkAnywhere) {
		planetParkAnywhere = parkAnywhere;
	}
	
	@Override
	public String toString() {
		return "RocketShip [numOfRockets=" + numOfRockets + ", color=" + color + ", model=" + model + ", hasMiniFridge="
				+ hasMiniFridge + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + (hasMiniFridge ? 1231 : 1237);
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + numOfRockets;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RocketShip other = (RocketShip) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (hasMiniFridge != other.hasMiniFridge)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (numOfRockets != other.numOfRockets)
			return false;
		return true;
	}
	
	

	
}
