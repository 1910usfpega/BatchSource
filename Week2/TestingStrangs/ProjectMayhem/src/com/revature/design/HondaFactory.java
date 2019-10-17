package com.revature.design;

//factories create an object w/o exposing creation logic to the client
public class HondaFactory {
    //we use a factory method to return a Car Model based on what String is given
    //if method is given a parameter of something besides crv and civivc it will return null.
    
    public Car getCar(String whatCar, String color) {
        if ("civic".equals(whatCar)) {
            return new Car("honda", 2020, "civic", color);
        } else if ("crv".equals(whatCar)) {
            return new Car("Honda", 2020, "crv", color);
        } 
        return null;
    }

}



















