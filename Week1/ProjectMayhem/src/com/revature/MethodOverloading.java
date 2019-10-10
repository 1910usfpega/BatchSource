package com.revature.overload;

public class MethodOverloading {
	static int myint = 5;
	static int otherint = 10;
	
	static Integer myinteger = 100;
	static Integer otherInteger = 200;
	static Double myDouble= 100.00; 
		// TODO Auto-generated constructor stub
		static Double otherDouble= 200.00; 
	
	public static void main(String[] args)

	{
		//exact match
		System.out.println(addInts(myint,otherint)) ;
		
		//unboxing
		System.out.println(addInts(myinteger,otherInteger));
		
		//conversion
		System.out.println(addInts(myDouble.intValue(), otherDouble.intValue()));
		
		//varargs
		varArgsTest(2,5,10,15,16);
		
	}
		public static void varArgsTest(int a, int ...v) {
			System.out.println("VarArgs Length");
			
		
	}
public static int addInts(int a, int b) {
	return a+b; 
}
}
