
public class Factorial {
	public static void Compute(int num) {
		System.out.println("N Factorial");
		int numHolder = 1;
		for (int i = 1; i <= num; i++) {//loop repeats depending on parameter indicated
			numHolder = numHolder*i;//equation to calculate factorial on each loop iteration.
		}
		System.out.println("\nThe factorial of "+num+" is "+numHolder);//Print result
	}
}
