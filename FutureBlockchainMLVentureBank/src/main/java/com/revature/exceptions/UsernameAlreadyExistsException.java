package com.revature.exceptions;

public class UsernameAlreadyExistsException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6774189997901878091L;

	public UsernameAlreadyExistsException() {
	}
	
	public UsernameAlreadyExistsException(String message) {
		super(message);
	}
	
	public UsernameAlreadyExistsException(String message, Throwable cause) {
		super(message, cause);
		
	}
}
