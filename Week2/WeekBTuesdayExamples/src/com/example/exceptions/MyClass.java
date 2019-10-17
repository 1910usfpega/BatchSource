package com.example.exceptions;

public class MyClass {
    
    public static void main(String[] args) {
        bankTransaction("withdraw", 50);
        System.out.println("done");
        
    }
    
    public static void bankTransaction(String action, double amount) {
        if (action.equals("withdraw")) {
            
            try {
                withdraw(amount);
            } catch (WithdrawTooBigException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void withdraw(double withdrawAmount) throws WithdrawTooBigException {
        double maxwithdrawAmount = 10000.00;
        
        if (withdrawAmount > maxwithdrawAmount) {
            //throw custom exception 
            throw new WithdrawTooBigException(withdrawAmount + " exceed max withdraw limit of: " + maxwithdrawAmount);
        }
    }
}




















