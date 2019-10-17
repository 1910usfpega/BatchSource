package com.revature.generics;

public class Gen1<T> {
    //declare an object of type T
    T ob;
    //pass the constructor a reference to an object of type T
    Gen1(T o) {
        ob = o;
    }
    
    //getter
    T getOb() {
        return ob;
    }
    
    //show type of T
    void showType() {
    	 System.out.println( "Type of T is:" + ob.getClass().getName());
    }

}