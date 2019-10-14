package com.revature.bean;

public class RocketShip {
	//fields
	 int numOfRockets;
	 String color;
	 String model;
	 boolean hasMiniFridge;
	
	static { System.out.println("This is the best static block");}
	
	public RocketShip() {
		
	}

	public RocketShip(int numOfRockets, String color, String model, boolean hasMiniFridge) {
		this.numOfRockets = numOfRockets;
		this.color = color;
		this.model = model;
		this.hasMiniFridge = hasMiniFridge;
		System.out.println("Im a Rocket from Space-X and my daddy is Elon Musk");
	
	}
	
	public void HalVirusTakeOver(RocketShip Hal) {
	
		this.numOfRockets = Hal.numOfRockets;
		this.color = Hal.color;
		this.model = Hal.model;
		this.hasMiniFridge = Hal.hasMiniFridge;
	}
//****Getters****
	public int getNumOfRockets() {
		return numOfRockets;
	}

	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}

	public boolean isHasMiniFridge() {
		return hasMiniFridge;
	}
	
//****Setters****
	public void setNumOfRockets(int numOfRockets) {
		this.numOfRockets = numOfRockets;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setHasMiniFridge(boolean hasMiniFridge) {
		this.hasMiniFridge = hasMiniFridge;
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
