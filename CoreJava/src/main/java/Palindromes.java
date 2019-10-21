import java.util.ArrayList;
import java.util.List;

public class Palindromes {
	public static void getPalindromes() {
		//All values stored in this ArrayList
		ArrayList<String> list = new ArrayList<String>();
		list.add("karan");
		list.add("madam");
		list.add("tom");
		list.add("civic");
		list.add("radar");
		list.add("jimmy");
		list.add("kayak");
		list.add("john");
		list.add("refer");
		list.add("billy");
		list.add("did");
		//All palindromes go to this ArrayList
		ArrayList<String> palindromes = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).toString().equals(ReverseString.Reverse(list.get(i).toString()))) {
				palindromes.add(list.get(i).toString());
			}
		}
		System.out.println(palindromes.toString());
	}
	 
}
