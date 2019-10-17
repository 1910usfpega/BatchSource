package com.revature.mainscreen;

import com.revature.storage.Bank;
import com.revature.storage.CustomerStorage;
import com.revature.storage.OpenApplications;

public class MainScreen {
	private Bank bank = new Bank();
	private CustomerStorage customers=new CustomerStorage();
	private OpenApplications openApps = new OpenApplications();
	
	public static void main(String[] args) {
		
		

	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public CustomerStorage getCustomers() {
		return customers;
	}

	public void setCustomers(CustomerStorage customers) {
		this.customers = customers;
	}

	public OpenApplications getOpenApps() {
		return openApps;
	}

	public void setOpenApps(OpenApplications openApps) {
		this.openApps = openApps;
	}
	
	
	
	
	

}
