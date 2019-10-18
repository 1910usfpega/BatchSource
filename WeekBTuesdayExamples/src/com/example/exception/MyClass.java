package com.example.exception;

public class MyClass {
	public static void main(String [] pizza) {
		bankTransaction("Withdraw", 690000);
		System.out.println("done");
		
	}
	
    public static void bankTransaction(String action, double amount){
        if (action.equals("Withdraw")) {
            try {
                withdraw(amount);
            } catch (WithdrawTooBigException e) {
                //TODO: handle exception
                e.printStackTrace();
            }
        }
    }

    public static void withdraw(double withdrawAmount) throws WithdrawTooBigException {
        double maxWithdrawAmount = 10000;
        if ( withdrawAmount > maxWithdrawAmount) {
        	// throw a custom exception here
        	throw new WithdrawTooBigException(withdrawAmount + " exceeds the max withdraw limit of: " + maxWithdrawAmount);
        }
    }
}
