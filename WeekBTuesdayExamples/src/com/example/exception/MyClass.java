package com.example.exception;

public class MyClass {
	
	public static void main(String[] pizza) {
		bankTransaction("Withdraw", 2000);
		System.out.println("done");
		
	}
	
	public static void bankTransaction(String action, double amount) {
		if(action.equals("Withdraw")) {
			try {
				withdraw(amount);
			}catch(WithdrawTooBigException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void withdraw(double withdrawAmount) throws WithdrawTooBigException {
		double maxWithdrawAmount = 100000;
		if(withdrawAmount > maxWithdrawAmount) {
			//throw a custom exception here
			throw new WithdrawTooBigException(withdrawAmount + " exceeds the max withdraw limit of: "+ maxWithdrawAmount);
		}
	}
	
}
