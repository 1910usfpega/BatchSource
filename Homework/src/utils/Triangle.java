package utils;

public class Triangle {	
	public static String draw(int lines) {
		String output = "";
		for (int i=1; i<lines+1; i++) {
			for (int j=0; j<i; j++) {
				output = output.concat(((j+i) % 2) + " ");
			}
			output = output.concat("\n");
		}
		return output;
	}

}
