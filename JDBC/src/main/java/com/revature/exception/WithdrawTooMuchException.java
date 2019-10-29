package com.revature.exception;

public class WithdrawTooMuchException extends Exception {
	
	
	    public WithdrawTooMuchException() {
	        
	    }    
	    
	   
	    public WithdrawTooMuchException(String message) {
	        super(message);
	    }
	    
	    public WithdrawTooMuchException(String message, Throwable cause) {
	        super(message, cause);
	    }
	    
	    
	}


