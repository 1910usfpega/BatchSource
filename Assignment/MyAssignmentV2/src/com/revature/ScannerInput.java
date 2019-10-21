package com.revature;

import java.util.Scanner;

public class ScannerInput {
    public void scannery() {
	  Scanner scany = new Scanner(System.in);

      System.out.print("Enter a string: ");
      String Str1 = scany.next();
      System.out.println(Str1);
      
      String s = Str1;
      for (int i = 0; i < s.length(); i++) {
        System.out.print(s.charAt(i)+ " ,");
      }
 }
}
