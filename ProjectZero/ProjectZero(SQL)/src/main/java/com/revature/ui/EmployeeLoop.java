package com.revature.ui;

import java.util.Scanner;

import com.revature.beans.Customer;
import com.revature.storage.MotherLoad;

public class EmployeeLoop {

public static  void empLoop(Scanner in, MotherLoad ml) {
		
		String input = in.nextLine();
		int putIn = Integer.parseInt(input);
		while(putIn!= 5) {
		System.out.println("Press 1 to view accounts");
		System.out.println("Press 2 to view account approval queue");
		System.out.println("Press 3 to view customer information");
		System.out.println("Press 4 to exit");
		
		
		switch(putIn) {
			case 1:
				//logic for applying for an account 
			
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
		
		
	}
		}
	
}
