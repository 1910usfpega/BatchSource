
public class FibonacciNumbers {
	//Method print out the first 25 fibonacci numbers
	public static void displayNumbers() {
		System.out.println("First 25 Fibonacci Numbers: ");
		int a = 0;
		int b = 1;
		int c = 0;
		int counter = 25;
		for (int i = 0; i < counter; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}
}
