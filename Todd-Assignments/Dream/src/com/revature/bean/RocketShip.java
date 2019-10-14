package com.revature.bean;

public class RocketShip {
	private int numOfRockets;
	private String color;
	private String model;
	private boolean hasMiniFridge;
	
	static {System.out.println("Welcome to Dream Rocket! Process will begin shortly...");}
	
	public RocketShip(int rocketCount, String color, String model, boolean miniFridge) {
		{System.out.println("Rocket creation in progress...");}
		
		this.numOfRockets = rocketCount;
		this.color = color;
		this.model = model;
		this.hasMiniFridge = miniFridge;
		
		{System.out.println("Rocket complete!");}
	}
	
	public static void main(String[] args) {
		
	}
	
	public void remodel(RocketShip r) {
		this.numOfRockets = r.numOfRockets;
		this.color = r.color;
		this.model = r.model;
		this.hasMiniFridge = r.hasMiniFridge;
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

	@Override
	public String toString() {
		return "Status: numOfRockets=" + numOfRockets + ", color=" + color + ", model=" + model + ", hasMiniFridge="
				+ hasMiniFridge;
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
