import java.lang.annotation.Repeatable;

public class ReverseString {
	public static void Reverse() {
		System.out.println("Reversed String:");
		String name = "Kristhian Deoliveira";
		for(int i = name.length()-1; i>=0; i--) {
			System.out.print(name.charAt(i));
		}
	}
	public static String Reverse(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i = str.length()-1; i>=0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
}
