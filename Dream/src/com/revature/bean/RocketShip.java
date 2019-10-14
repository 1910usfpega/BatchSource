package com.revature.bean;

public class RocketShip {
	
	//Instance code block
	{System.out.println("New StarShip Created");}
	
	//Static code block
	static {System.out.println("Im in static code block");}
	
	private Integer numOfRockets;
	private String color;
	private Boolean hasMiniFridge;
	
	// Constructors
	public RocketShip(Integer numOfRockets, String color, Boolean hasMiniFridge) {
		this.numOfRockets = numOfRockets;
		this.color = color;
		this.hasMiniFridge = hasMiniFridge;
	}
	
	public RocketShip(Integer numOfRockets, String color) {
		this(numOfRockets, color, false);
	}
	
	public RocketShip(Integer numOfRockets) {
		this(numOfRockets, "white");
	}
	
	public RocketShip() {
		this(1);
	}
	
	public Integer getNumOfRockets() {
		return numOfRockets;
	}
	public void setNumOfRockets(Integer numOfRockets) {
		this.numOfRockets = numOfRockets;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Boolean getHasMiniFridge() {
		return hasMiniFridge;
	}
	public void setHasMiniFridge(Boolean hasMiniFridge) {
		this.hasMiniFridge = hasMiniFridge;
	}
	@Override
	public String toString() {
		return "RocketShip [numOfRockets=" + numOfRockets + ", color=" + color + ", hasMiniFridge=" + hasMiniFridge
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((hasMiniFridge == null) ? 0 : hasMiniFridge.hashCode());
		result = prime * result + ((numOfRockets == null) ? 0 : numOfRockets.hashCode());
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
		if (numOfRockets == null) {
			if (other.numOfRockets != null)
				return false;
		} else if (!numOfRockets.equals(other.numOfRockets))
			return false;
		return true;
	}
	
	
	
	
	
}
