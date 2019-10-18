package com.revature.design;

public class Driver {
	private static Hondafactory hf = new Hondafactory();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=hf.getCar("crv", "Black");
		Car c2=hf.getCar("civic", "Cherry Red");
		Car c3=hf.getCar("potato", "Clear");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
