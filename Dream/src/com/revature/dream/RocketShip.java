package com.revature.dream;

public class RocketShip {
	private int numOfRockets ;
	private String color;
	private String model;
	private Boolean hasMiniFridge;
	
	@Override
	public String toString() {
		return "RocketShip [numOfRockets=" + numOfRockets + ", color=" + color + ", model=" + model + ", hasMiniFridge="
				+ hasMiniFridge + "]";
	}
	public int getNumOfRockets() {
		return numOfRockets;
	}
	public void setNumOfRockets(int numOfRockets) {
		this.numOfRockets = numOfRockets;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((hasMiniFridge == null) ? 0 : hasMiniFridge.hashCode());
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
		if (hasMiniFridge == null) {
			if (other.hasMiniFridge != null)
				return false;
		} else if (!hasMiniFridge.equals(other.hasMiniFridge))
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
	public Boolean getHasMiniFridge() {
		return hasMiniFridge;
	}
	public void setHasMiniFridge(Boolean hasMiniFridge) {
		this.hasMiniFridge = hasMiniFridge;
	}
	public RocketShip(int numOfRockets, String color, String model, Boolean hasMiniFridge) {
		super();
		this.numOfRockets = numOfRockets;
		this.color = color;
		this.model = model;
		this.hasMiniFridge = hasMiniFridge;
	}
	static {
		System.out.println("Hello STATIC");
	}
	{
		System.out.println("Hello INSTANCE");
	}
}
