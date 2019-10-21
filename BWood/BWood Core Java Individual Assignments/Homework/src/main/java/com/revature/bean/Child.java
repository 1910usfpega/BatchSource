
package com.revature.bean;


public class Child extends Parent {

	
	public Child() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean hasUpperCase(String n) {
		String[] temp = n.split("");
		boolean result = false;
		for(String i:temp) {
			if(i.equals(i.toUpperCase())) {
				result = true;
			
			}
		}
		return result;
		
		
	}

	@Override
	public String toLowerCase(String n) {
		// TODO Auto-generated method stub
		return n.toLowerCase();
	}

	@Override
	public int doesStrangeThing(String n) {
		int result =10;
		for(int i=0;i<n.length();i++) {
			result+=(int)n.charAt(i);
		}
		return result;
	}

}
