package com.example.exceptions;

public class WithdrawTooBigException extends Exception {
    //control + space + enter generate empty constructor
    public WithdrawTooBigException() {
        
    }
    
    public WithdrawTooBigException(String message) {
        super(message);
    }
    
    public WithdrawTooBigException(String message, Throwable cause) {
        super(message, cause);
    }
    

}


















