package yourworkhere;

public class ExampleAccount {
	
	
	public static void main(String[] args) {
		//TODO 	1.2.2 Define the data types below (balance, withdrawalAmount, depositAmount, accountName, accountType)
		//short s = 16;
		//System.out.println(s);
		
		//int i = -32;
		//System.out.println(i);
		
		//float f = 3839.34839f;
		//System.out.println(f);
		
		//long l = 4294967296l;
		//System.out.println(l);
		
		//char c = 'a';
		//System.out.println(c);
		
		double balance = 7700.00;
		System.out.println("Balance:" + balance);
		
		double withdrawalAmount = 500.25;
		System.out.println("Ammount withdrawn:" + withdrawalAmount);
		
		double depositAmount = 645.18;
		System.out.println("Deposited:" + depositAmount);
		
		String accountName = "John Jennings";
		System.out.println("Account Holder's Name:" + accountName);
		
		char accountType = 'a';
		System.out.println("Class 'a' account:" + accountType);
				 
		//TODO	1.2.3 Print the value of balance below
		//System.out.println(balance);
		
		//System.out.println(withdrawalAmount);
		//System.out.println(depositAmount);
		
		//wanted to see if writing the above code works and it does.
		
		//TODO 	1.2.4 Write a short bit of code to execute a withdrawal of 500.25 from the value of balance
		//		Print the result
		
		double withdrawalCurrentValue = balance - withdrawalAmount;
		System.out.println("Balance after withdrawal:" + withdrawalCurrentValue);
		
		//TODO	1.2.5 Write a short snippet of code to deposit 645.18 to the current value of balance
		//		Print the result
		
		double newDepositBalance = withdrawalCurrentValue + depositAmount;
		System.out.println("Balance after deposit:" + newDepositBalance);
		
		
		
		/*
		 * TODO 1.2.6 Write the lines to check the balance if you added compound interest for a year
		 * 
		 * Step 1: Define the variables Use A, P, r, n, t You must decide what datatypes
		 * to make each according to their purpose: 
		 * A - Accrued Amount; this is the amount you're solving for 
		 * P - Principle; set this to the current balance. 
		 * r - rate of interest; set this to 0.15 
		 * n - number of times the amount is compounded; set this to 12 
		 * t - number of years; set this to 1 to represent 1 year
		 * 
		 * Step 2: Calculate the Accrued Amount Use the formula: A = P(1 + r/n)nt
		 * 
		 * Step 3: Print the result to the console
		 */
		
		float P = 7844.93f;
		float r = 0.15f;
		int n = 12;
		int t = 1;
		double A = P * (1 + r / n) * n * t;
		//reminder Java does not understand "implicit" multiplication over () as we would see in math equations
		// need to be explicit
		System.out.println( "Total Accrued Balance:" + A);
		
	
	}
}
