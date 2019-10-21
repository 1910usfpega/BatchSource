package com.revature.homework;

public class Question18 extends Q18 {

	@Override
	public void methods1() {
		
		String str = "JAVA IS GOING PLACES";
		
		System.out.println( "Is String uppercase?; "+ isStringUpperCase(str) );
	}
		
		public static boolean isStringUpperCase(String str) {
			
			char[] charArray = str.toCharArray();
			
			for(int i=0; i < charArray.length; i++) {
				if( !Character.isUpperCase( charArray[i])) {
					return false;
				}
			
			}
			return true;
		}
	

	@Override
	public void methods2() {
		String str = new String("java is the best");
		System.out.println(str.toUpperCase());
		
	}

	@Override
	public void methods3() {
		String number = "10";
		Integer result = Integer.valueOf(number);
		System.out.println(result);
		
	}

}
