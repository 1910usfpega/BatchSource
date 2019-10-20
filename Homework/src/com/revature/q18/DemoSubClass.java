package com.revature.q18;

public class DemoSubClass extends DemoSuperclass {

	@Override
	public Boolean isUppercaseCharactersInTheString(String ss) {
		return !ss.toLowerCase().equals(ss);
	}

	@Override
	public String convertToUppercase(String ss) {
		return ss.toUpperCase();
	}

	@Override
	public Integer convertStringToInteger(String ss) {
		return Integer.parseInt(ss);
	}



}
