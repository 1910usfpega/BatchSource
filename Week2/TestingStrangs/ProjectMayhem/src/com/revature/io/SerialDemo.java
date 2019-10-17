package com.revature.io;

import java.util.Scanner;

import com.revature.bean.Person;

public class SerialDemo {
	

	    public static Scanner sc = new Scanner(System.in);
	    public static void main(String[] args) {
	        IO io = new IO();
	        //if output.txt does not exist it will create it, ru nand refresh project explorer to see it
	        
//	      System.out.println("What would you like to write?");
//	      String s = sc.nextLine();
//	      io.writeOutputStreamContents(s);
	        
	    //  System.out.println(io.readInputStreamContents());
	        Person p1 = new Person("Andy", 12, 270);
	        Person p2 = new Person("Alex", 82, 200);
	        Person p3 = new Person("Pedro", 22, 190);
	        Person p4 = new Person("Juan", 42, 170);
	        Person p5 = new Person("Tony", 40, 190);
	        
	        //the personList iss static so must be called like this
	        
//	      SerializeCollections.personList.add(p1);
//	      SerializeCollections.personList.add(p2);
//	      SerializeCollections.personList.add(p3);
//	      SerializeCollections.personList.add(p4);
//	      SerializeCollections.personList.add(p5);
//	      
//	      SerializeCollections.writePersonFile();
	        
	        IOWithCollections.readPErsonFile();
	        System.out.println(IOWithCollections.personList.toString());
	        
	    }

	

	}
	








