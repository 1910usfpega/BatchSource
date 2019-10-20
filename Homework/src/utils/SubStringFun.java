package utils;

public class SubStringFun {
	public static String substring(String str, Integer idx) {
		if (idx < 0) {
			return "";
		} else if (idx == 0){
			return "";
		} else if (idx>str.length()) {
			return str;
		} else {
			String temp = "";
			for (int i=0; i<idx; i++) {
				temp = temp + str.charAt(i);
			}
			return temp;
		}
		
	}
}
