package com.revature.varargs;

public class FunWithVarargs {
	
	public static void main(String[] args) {
		/*Variable length arguments- varargs
		 * Method that will take a variable number of arguments
		 * Automates and hides the process of creating and saving 
		 * the values into an array prior to invoking the method
		 * Can be of any type
		 * must be the last argument
		 * 0 to many args 
		 */
		vaTest(10);
		vaTest(1,4,2,5,6,8,4,2,5,8,9,4,2,5,6);

}
public static void vaTest(  int ...v)  {
	System.out.println("Number of args is : "+ v.length+ "Contents");
	for(int x:v)  {
		System.out.println(x+"");
		

	}
}
}






