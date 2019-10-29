package com.revature.exceptions;

public class SignInException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2916467683264731765L;

	public SignInException() {
	}
	
	public SignInException(String message) {
		super(message);
	}
	
	public SignInException(String message, Throwable cause) {
		super(message, cause);
		
	}
}
