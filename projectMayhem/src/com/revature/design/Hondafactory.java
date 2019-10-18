package com.revature.design;
import com.revature.design.Car;
//Factories create an object w/o exposing creation logic to the client
public class Hondafactory {
	/*
	 * use a "fectory" method to return a Car Model based on what String is Given
	 */
	public Car getCar(String whatCar, String color) {
		if("civic".equals(whatCar)) {
			return new Car("Honda", 2020, "Civic", color);
		}else if("crv".equals(whatCar)) {
			return new Car("Honda",2020,"CRV",color);
		}
		return null;//if we have anything else we return null
	}
}
