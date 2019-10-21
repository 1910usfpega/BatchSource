package com.revature.bean;

public class Substring {
	
	public String getSubstring(String s, int idx) {
		
		String str = "";
		
		if (idx < -0) {
			System.out.println("Index is out of BOUND" );
            return s;
        }
        if (idx > s.length()-1) {
            System.out.println("Index is out of BOUND" );
            return s;
        }
        for(int i = 0; i < idx; i++) {
        	str = str + s.charAt(i);	
        }        
        return str;

		
	}

}
