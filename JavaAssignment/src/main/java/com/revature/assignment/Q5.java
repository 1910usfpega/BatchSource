package com.revature.assignment;

public class Q5 {

	public static String substring(String str, int idx){
        String temp="";
       
        for(int i=0;i<idx;i++)
        {
            temp=temp+str.charAt(i);
        }
       
        return temp;
    }
}
