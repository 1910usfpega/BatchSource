package com.revature.superclass;

public class SubClass extends SuperClass{
	
	public SubClass(String used) {
		super(used);
	}

	public String getUsed() {
		return used;
	}

	@Override
	public boolean hasCaps() {
		for(int i = used.length() - 1; i > 0; i--) {
			if(Character.isUpperCase(used.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String all_upper() {
		// TODO Auto-generated method stub
		String upper = " ";
		for(int i = 0; i < used.length(); i++) {
			if(Character.isUpperCase(used.charAt(i))) {
				upper = upper + used.charAt(i);
			}
			else if(Character.isLowerCase(used.charAt(i))) {
				upper = upper + Character.toUpperCase(used.charAt(i) );
			}
		}
		return upper;
	}

	@Override
	public int toIntPlus10() {
		// TODO Auto-generated method stub
		int converted;
		converted = Integer.parseInt(used);
		
		return converted + 10;
	}
}
