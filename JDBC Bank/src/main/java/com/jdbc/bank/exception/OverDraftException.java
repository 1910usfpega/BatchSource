package com.jdbc.bank.exception;

public class OverDraftException extends Exception {
	//runtime exception is a superClass which are never checked or
		//caught after being thrown in execution		
			@Override
			public String getMessage() {
				return "Exception made to withdraw. Balance is now below 0.";
			}
}
