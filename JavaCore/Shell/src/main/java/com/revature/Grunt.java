package com.revature;

public class Grunt extends Boss{
	String str = "Boss";
	
	public void Uppercheck() {
		if(str == str.toUpperCase())
		{System.out.println("True");}
		else {System.out.println("False");}
	}
	
	public String LowerToUpper() {
		str = str.toUpperCase();
		return str;
	}
	
	public int StringToInteger() {
		//int result = Integer.valueOf(str) + 10;
		int result1 = str.length() + 10;
		return result1;
	}
	
	public static void main (String[] args) {
		Boss obj = new Grunt();
		obj.Uppercheck();
		System.out.println(obj.LowerToUpper());
		System.out.println(obj.StringToInteger());
		obj.StringToInteger();

	}

}
