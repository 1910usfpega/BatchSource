import java.util.Scanner;

public class interestRate {
	public static void calculate() {
		double interestRate = 0.0;
		int numOfYears = 0;
		double dollarAmmount = 0.0;
		System.out.println("*************************************************************************************************************");
		System.out.println("Interest rate calculator\nEnter the interest rate ex: 15.9");
		Scanner scanner = new Scanner(System.in);
		interestRate = scanner.nextDouble();
		System.out.println("Enter the ammount of years");
		numOfYears = scanner.nextInt();
		System.out.println("Enter the dollar ammount ex: 5400.00 for $5,400.00");
		dollarAmmount = scanner.nextDouble();
		double result = (dollarAmmount*numOfYears*interestRate)/100;
		System.out.println("You will pay: "+Double.toString(result)+" in interest");
	}
}