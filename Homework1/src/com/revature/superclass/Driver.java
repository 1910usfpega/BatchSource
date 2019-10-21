package com.revature.superclass;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass demand = new SubClass("Do iT NOw");
		
		System.out.println(demand.getUsed() + " with all caps is "+ demand.all_upper());
		
		if( demand.hasCaps() == true) {
			System.out.println(demand.getUsed() + " has caps in it.");
		}
		else {
			System.out.println(demand.getUsed() + " does not have any caps in it.");
		}
		SubClass number = new SubClass("5");
		System.out.println(number.getUsed() + " plus 10 is " + number.toIntPlus10());
	}

}
