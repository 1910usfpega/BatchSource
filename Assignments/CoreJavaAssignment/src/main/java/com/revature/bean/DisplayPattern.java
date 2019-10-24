package com.revature.bean;

public class DisplayPattern {
	
	public void runDisplayPattern(int x){
		
		for(int i=1; i<=x; i++){
			for(int j=1; j<=i; j++){
				if(j%2==1){
					System.out.print("1");
				}
				else{
			      System.out.print("0");
			     }
			  
			}
			System.out.println();
			}
			
			
	}
	
	

}
