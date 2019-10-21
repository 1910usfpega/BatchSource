package com.revature.triangle;

public class Triangle {

	public static void triangle() {
		
		
		String st = "";
		int y = 1;
		for(int i = 1 ; i <= 4; i++) {			
			for(int z = 0; z < i; z++) {
				if(y ==1) {
					y = 0;
				}else{
					y = 1;
				}
				System.out.print(y);				
			} System.out.println();

	}
}
}
