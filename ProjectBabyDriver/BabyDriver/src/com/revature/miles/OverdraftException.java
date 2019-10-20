package com.revature.miles;

public class OverdraftException extends RuntimeException {
	public OverdraftException(){}
	public OverdraftException(String message) {
		super(message);
	}

}
