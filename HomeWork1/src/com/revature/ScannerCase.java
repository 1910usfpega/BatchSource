package com.revature;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ScannerCase {

	
public void scannery() {
				
   
   
    System.out.println("Please enter 1 ,2 or 3: ");
		        Scanner scan = new Scanner(System.in);
		        int option = scan.nextInt();
		        switch (option) {
		            case 1:
		                int number = 64;
		                System.out.println(Math.sqrt(number));
		                break;
		            case 2:
		                SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		                Date date = new Date(0);
		                System.out.println(df.format(date));
		                break;
		            case 3:
		                String string = "['I', 'am', 'learning', 'Java', 'Code']";
		                String[] array = string.split(",");
		                for (int i = 0; i < array.length; i++) {
		                    {
		                        System.out.println(array[i]);
		                    }
		                }
		        }
		    }
		


}
	


