package com.revature.bean;

import java.util.Objects;

public class RocketShip {
	//fields
	private int numOfRockets;
	private String color;
	private String model;
	
	private boolean hasMiniFridge;
	
	//static code block
	static {System.out.println("Static RocketShip code block");}
	//instance code block
	{System.out.println("Instance RocketShip code block");}
	
	//Constructors
	
	public RocketShip(int numOfRockets, String color, String model, boolean hasMiniFridge) {
		super();
		this.numOfRockets = numOfRockets;
		this.color = color;
		this.model = model;
		this.hasMiniFridge = hasMiniFridge;
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
		return Objects.equals(color, other.color) && hasMiniFridge == other.hasMiniFridge
				&& Objects.equals(model, other.model) && numOfRockets == other.numOfRockets;
	}


	public RocketShip() {
		super();
	}
	//Getters and Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public int getNumOfRockets() {
		return numOfRockets;
	}
	public void setNumOfRockets(int numOfRockets) {
		this.numOfRockets = numOfRockets;
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
	@Override
	public String toString() {
		return "RocketShip [numOfRockets=" + numOfRockets + ", model=" + model + ", hasMiniFridge=" + hasMiniFridge
				+ "]";
	}
	 


}
