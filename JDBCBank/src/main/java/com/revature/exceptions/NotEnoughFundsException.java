package com.revature.exceptions;

public class NotEnoughFundsException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotEnoughFundsException() {
		
	}
	
	public NotEnoughFundsException(String message) {
		super(message);
	}
	
	public NotEnoughFundsException(String message, Throwable cause) {
		super(message,cause);
	}

}
