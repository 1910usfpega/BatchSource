package com.revature.dream;

public class RocketShip {

	static {
		//Static Code Block
		System.out.println("Ready for Blast off!");
	}
	{
		//Instance Code Block
		System.out.println("Special Rocket James Harden");
	}
	
private String name;
		private int numofRockets;
		private String color;
		private String model;
		private boolean hasMiniFridge;

		// TODO Auto-generated method stub
		//Constructors
		public RocketShip (int numofRockets, String color, String model, boolean hasMiniFridge) {
			//this. is referring to the object
			//=name is referring to the parameter
			System.out.println("Ready for blast off");
			this.numofRockets=numofRockets;
			this.color=color;
			this.model=model;
			this.hasMiniFridge=true;
		}
		//No-arg Constructor
		public RocketShip() {
			//super(); implicitly there
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getNumofRockets() {
			return numofRockets;
		}
		public void setNumofRockets(int numofRockets) {
			this.numofRockets = numofRockets;
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
		public boolean getHasMiniFridge() {
			return hasMiniFridge;
		}
		public void setHasMiniFridge(boolean hasMiniFridge) {
			this.hasMiniFridge = hasMiniFridge;
		}
		@Override
		public String toString() {
			return "RocketShip [name=" + name + ", numofRockets=" + numofRockets + ", color=" + color + ", model="
					+ model + ", hasMiniFridge=" + hasMiniFridge + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((color == null) ? 0 : color.hashCode());
			result = prime * result + (hasMiniFridge ? 1231 : 1237);
			result = prime * result + ((model == null) ? 0 : model.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + numofRockets;
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
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (numofRockets != other.numofRockets)
				return false;
			return true;
		}
		
		
		
	}


