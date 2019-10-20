package utils;

public class PrintFib {
	private static int previous = 0;
	private static int current = 1;
	
	
	public static void start (int iteractions) {
		System.out.print("First "+ iteractions + " Fibonacci numbers: ");
		for (int i=0; i<iteractions; i++) {
			if (i == 0) {
				System.out.print(previous + " ");
			} else if (i == 1) {
				System.out.print(current + " ");
			} else {
				System.out.print(previous + current + " ");
				int temp = previous + current;
				previous = current;
				current = temp;
			}
		}
	}

}
