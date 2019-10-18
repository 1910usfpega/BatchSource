package com.revature.design;

// Factories create an object w/o exposing creation logic to the client

public class HondaFactory {
	/*
	 * use a "factory" method to return a Car Mofle based on what String is given
	 */

	public Car getCar(String whatCar, String color) {
		if  ("civic".equals(whatCar)) {
			return new Car("Honda", 2020, "Civic", color);
		} else if ("crv".equals(whatCar)) {
			return new Car("Honda", 2020, "CRV", color);
		}
		return null;
	}
}
