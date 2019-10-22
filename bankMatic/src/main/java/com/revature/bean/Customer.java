package com.revature.bean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.revature.io.AccountsIO;



public class Customer extends User implements  Serializable {
	/**
	 * 
	 */
	public static Scanner sc= new Scanner(System.in);
	
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private Boolean status;
	private List<Account> accountList;
	
	
	public Customer(String firstName, String lastName, Date dateOfBirth, Boolean status, String username,
			String password) {
		super(username, password, "customer");
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.status = status;
		this.accountList = null;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public Boolean getStatus() {
		return status;
	}


	public void setStatus(Boolean status) {
		this.status = status;
	}


	public List<Account> getAccountList() {
		return accountList;
	}


	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
				+ ", status=" + status + ", username=" + getUsername() + ", password=" + getPassword() + ", accountNumber="
				+ accountList + "]";
	}
	
	public void applyForNewAccountLoop() {
		Boolean accountTypeFlag = true;
		
		String newAccountType = null; 
		

    		
		while (accountTypeFlag) {
    		System.out.println("Which type of account you want to apply for?");
    		System.out.println("1. Checking");
    		System.out.println("2. Savings");
    		System.out.println("3. Back to Menu");
    		
    		if (sc.hasNextInt()) {
    			Integer contentsFromUser = sc.nextInt();
    			
    			if (contentsFromUser.equals(1)) {
    				newAccountType = "Checking";
    				accountTypeFlag = false;
    			} else if (contentsFromUser.equals(2)) {
    				newAccountType = "Savings";
    				accountTypeFlag = false;
    			} else if (contentsFromUser.equals(3)) {
    				accountTypeFlag = false;
    			}
    		}
		}
		
		if (newAccountType != null) {
			AccountsIO aIO = AccountsIO.getInstance();
			Account newAccount = new Account(newAccountType, 0.0, this.getUsername(), "pending", aIO.getNextAccountNum() );
			aIO.accountList.add(newAccount);
			aIO.writeToFile();
		}
		
	
		
		
		
	}
		
    @Override
    public void showMenu() {
    	
    	
    	
    	Boolean flag = true;
    	while (flag) {
    		List<String> commands = new ArrayList<String>();
        	commands.add("Apply for a new account");
        	
	    	System.out.println("\n\nWELCOME, " + this.getFirstName() + " " + this.getLastName() + "\n");
	    	System.out.println("Your accounts:");
	    	Boolean no_accounts = true;
	    	
	    	
	    	AccountsIO aIO = AccountsIO.getInstance();
	    	for (int i = 0; i<aIO.accountList.size(); i++) {
	    		//Account account:AccountsIO.accountList
	    		Account account = aIO.accountList.get(i);
	    		if (account.getOwnerUsername().equals(this.getUsername())) {
	    			commands.add("Work with account: " + account.getAccountNumber().toString());
	    			System.out.print(" - " + account.getAccountName() + " (Account number: "+account.getAccountNumber() + ") – " );
	    			if (account.getAccountStatus().equals("pending")) {
	    				System.out.println("pending");
	    			} else if (account.getAccountStatus().equals("canceled")) {
	    				System.out.print("canceled");
	    			} else {
	    				System.out.print("$"+account.getBalance());
	    			}
	    			System.out.println();
	    			
	    			no_accounts = false;
	    		}
	    	}
	    	
	    	if (no_accounts) {
	    		System.out.println("You don't have accounts yet");
	    		// Sysout all account in the following format:
	    	}
	    	
	    	commands.add("Logout");
    	
    	
    	
    		System.out.println("============\n\nWhat you want to do?");
        	for (int i=0; i<commands.size(); i++) {
        		System.out.println((i+1) + ". "+ commands.get(i));
        	}
        	System.out.print("Input number of action 1-" + commands.size()+": ");
        	
        	if (sc.hasNextInt()) {
        		Integer contentsFromUser = sc.nextInt();
        		if ( (contentsFromUser) <= commands.size() ) {
//        			System.out.format( "You chose the action %s: %s", 
//        					contentsFromUser, 
//        					commands.get(contentsFromUser-1));
//        			
        			if (commands.get(contentsFromUser-1).equals("Logout")) {
        				flag=false;
        				
        			} else if (commands.get(contentsFromUser-1).substring(0,"Work with account:".length()).equals("Work with account:")) {
        				String accountNumString =  commands.get(contentsFromUser-1).substring("Work with account: ".length());
        				Integer accountNum = Integer.parseInt(accountNumString);
//        				AccountsIO aIO = AccountsIO.getInstance();
        				Account currentAccount = Account.getAccount(accountNum, aIO.accountList);
        				Account.workWithAccountMenuLoop(currentAccount, this);
        			} else if (commands.get(contentsFromUser-1).equals("Apply for a new account")) {
        				System.out.println("Apply for NEW account: ");
        				applyForNewAccountLoop();
        			}
        			
        			
        		}
        	}
    		
    	}
    }

}
