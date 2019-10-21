import java.util.ArrayList;

public class subStrings {
	public static String GetString(String str, int idx) {
		ArrayList<Character> temp = new ArrayList<Character>();
		for (int i = 0; i <= idx; i++) {
			temp.add(str.charAt(i));
		}
		String finalValue = temp.toString();
		//String formatting
		String A = finalValue.replace("]", "");
		String B = A.replace("[", "");
		String C = B.replace(", ", "");
		//END -> String formatting
		return C;
	}
}
