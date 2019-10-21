package com.revature.exercises;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Q14 {
	public static void scanning() {
		
		   
		   
	    System.out.println("Choose 1 ,2, 3: ");
			        Scanner in = new Scanner(System.in);
			        int choice = in.nextInt();
			        switch (choice) {
			            case 1:
			                int a = 64;
			                System.out.println(Math.sqrt(a));
			                break;
			            case 2:
			                SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
			                Date date = new Date(0);
			                System.out.println(df.format(date));
			                break;
			            case 3:
			                String myString = "['I', 'am', 'learning', 'Java', 'Code']";
			                String[] array = myString.split(",");
			                for (int i = 0; i < array.length; i++) {
			                    {
			                        System.out.println(array[i]);
			                    }
			                }
			        }
			    }
			


}
