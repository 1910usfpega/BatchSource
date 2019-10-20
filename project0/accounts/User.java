package com.project0.accounts;

public abstract class User {
	// fields
	protected String userName;
	protected String password;
	protected double transfer_$;

	public User() {

	}

	public abstract void register();

	public abstract void logIn();

}
