package com.revature.text;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		ArrayList<Citizen> citizens = new ArrayList<Citizen>();
		
		IO.readData(citizens);
		
		for(Citizen temp : citizens) {
			temp.give_info();
		}
	}
}
