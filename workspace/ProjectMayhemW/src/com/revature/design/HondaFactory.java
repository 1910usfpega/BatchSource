package com.revature.design;

//Factories create an object w/o exposing creation logic to client
/**
 * use a 'factory' method to return a Car Model based upon what parameter is
 * given
 * if the method is given anything other than CRV or Civic, returns null
 */
public class HondaFactory {
	public Car getCar(String whatCar, String color) {
		if ("civic".equalsIgnoreCase(whatCar)) {
			return new Car("Honda", 2020, "Civic", color);
		} else if ("crv".equalsIgnoreCase(whatCar)) {
			return new Car("Honda", 2020, "CRV", color);
		} else {
			return null;
		}
	}
}
