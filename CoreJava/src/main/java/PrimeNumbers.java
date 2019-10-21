import java.util.ArrayList;

public class PrimeNumbers {
	public static void Compute() {
		ArrayList<Integer> numbers= new ArrayList<Integer>();
		//Fill list with numbers from 0 to 100
		for (int i = 0; i <= 100; i++) {
			numbers.add(i);
		}
		for (int i = 0; i < numbers.size(); i++) {
			if(numbers.get(i) %i == 0) {
				System.out.println(numbers.get(i));
			}
		}
	}
}
