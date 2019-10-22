package com.revature.bean;

public class LogonException extends Exception {
	
public LogonException() {
		
	}
	
	public LogonException(String message) {
		super(message);
	}
	
	public LogonException(String message, Throwable cause) {
		super(message, cause);
		
	}

}
