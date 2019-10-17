package com.revature.io;

import java.util.Scanner;

import com.revature.bean.Person;

public class SerialDemo {
	public static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		IO io= new IO();
		/* if output.txt does not exist, it will create it!
		 * if doesn't exist, run it, and then refresh the 
		 * project explorer to see it
		 */
//		System.out.println("What would you like to write?");
//		String s=sc.nextLine();
//		io.writeOutputStreamContents(s);
	//Read from a file
		//System.out.println(io.readInputStreamContents());
		
		/*
		 * Person p1=new Person("Matt",33,4000); Person p2=new
		 * Person("Sir James Todd the 1st",75,15); Person p3=new
		 * Person("Derron",309,195); Person p4=new Person("Derthalie",1111,500);
		 * IOWithCollections.personList.add(p1); IOWithCollections.personList.add(p2);
		 * IOWithCollections.personList.add(p3); IOWithCollections.personList.add(p4);
		 * IOWithCollections.writePersonFile();
		 */
		IOWithCollections.readPersonFile();
		System.out.println(IOWithCollections.personList.toString());
	}

}
