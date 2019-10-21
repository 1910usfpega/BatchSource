package com.revature.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Question7main {
	
	public static boolean Employee(String str){
		List<Question7emp> employeeList = new ArrayList<Question7emp>(); 

		employeeList.addAll(Arrays.asList(new Question7emp[] {
				new Question7emp("Eddie","electronics",27),
				new Question7emp("Lebron","grocery", 35)}));
		
		System.out.println("Question 7");
		
		System.out.println("LA Lakers Walmart");
        for (Question7emp e : employeeList) {
            System.out.println(e);
        }
        System.out.println("==================");
        System.out.println("Welcome To Laker Land");
       
        Collections.sort(employeeList);
        for (Question7emp e : employeeList) {
            System.out.println(e);
        }
        System.out.println("==================");
        System.out.println("2019");
       
        Collections.sort(employeeList, new Question7comp());
        for (Question7emp e : employeeList) {
            System.out.println(e);
        }
        System.out.println("==================");
        System.out.println("NBA Champs");
		return false;
        
        }

    }
	
