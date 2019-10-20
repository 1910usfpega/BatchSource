package com.revature.bean;

import java.util.ArrayList;

public class PendingAccount extends bankAccount{
	private boolean pending;
	
	
	public PendingAccount(ArrayList<bankAccount> aa) {
		super(aa);
		this.pending = true;
		
	}


	public boolean isPending() {
		return pending;
	}


	public void setPending(boolean pending) {
		this.pending = pending;
	}


	@Override
	public String toString() {
		return "PendingAccount [pending=" + pending + ", amount=" + amount + ", ACCOUNTNUMBER=" + ACCOUNTNUMBER + "]";
	}
	
	

}
