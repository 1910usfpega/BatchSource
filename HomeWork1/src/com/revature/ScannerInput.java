package com.revature;

import java.util.Scanner;

public class ScannerInput {
    public char[] scanner() {
	  Scanner scan = new Scanner(System.in);
	  

      System.out.print("Enter a string: ");
      String string = scan.next();
      System.out.println(string);
      char [] a = new char[string.length()];
      String string2 = string;
      boolean valid = false;
      for (int i = 0; i < string2.length(); i++) {
    	  a[i] =string2.charAt(i);
    	  if(valid) {
    		  System.out.print(",");
    	  }
        System.out.print(string2.charAt(i));
        valid = true;

      }
	return a;
 }
}
