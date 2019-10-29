package com.revature.exceptions;

public class AccountOverdraftException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2178472882412446924L;

	public AccountOverdraftException() {
	}
	
	public AccountOverdraftException(String message) {
		super(message);
	}
	
	public AccountOverdraftException(String message, Throwable cause) {
		super(message, cause);
		
	}
}
