package com.revature;

import java.util.Scanner;

public class ScannerInput {
    public char[] scannery() {
	  Scanner scany = new Scanner(System.in);

      System.out.print("Enter a string: ");
      String Str1 = scany.next();
      System.out.println(Str1);
      
      char[] a= new char[Str1.length()];
      String s = Str1;
      boolean valid = false;
      for (int i = 0; i < s.length(); i++) {
    	  a[i]= s.charAt(i);
    	  if (valid) {
    		  System.out.println(",");
    	  }
        System.out.print(s.charAt(i));
        valid = true;
      }
	return a;
 }
}
