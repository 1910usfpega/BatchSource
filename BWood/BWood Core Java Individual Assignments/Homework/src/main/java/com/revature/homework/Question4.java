package com.revature.homework;


/******************************************************************************
 * 
 * @author Bryan Wood
 *
 *****************************************************************************/
public class Question4 {
	
	
	public int factorialN(int z) {
		//because 1! or 0! equal 1
		if(z==1||z==0)
			return 1;
		
		return z* factorialN(z-1);
	}

}
