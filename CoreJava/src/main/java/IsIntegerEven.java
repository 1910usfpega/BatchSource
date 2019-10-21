
public class IsIntegerEven {
	public static void isEven(int num) {
		System.out.println("\nInteger Even or Odd:");
		int res = num/2;
		if (res*2==num) {
			System.out.println(num+" Is even");
		}else {
			System.out.println(num+" Is odd");
		}
	}
}
