package com.revature.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.bean.Account;

public class AccountsIO {//This is a class that keeps the list of all accounts 
	private static AccountsIO instance;
	
	public static synchronized AccountsIO getInstance() {
		if (instance == null) {
			instance = new AccountsIO();
		}
		return instance;
	}
	
	public AccountsIO () {
		
	}

	private static final String ioFile="accounts.txt";
	public List<Account> accountList = new ArrayList<Account>();
	
	public void writeToFile() {
		try (ObjectOutputStream objectOut = new ObjectOutputStream(
				new FileOutputStream(ioFile));){
			objectOut.writeObject(accountList);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public int getNextAccountNum() {
		int max_val = 100000;
		for (int i=0; i<this.accountList.size(); i++) {
			if (this.accountList.get(i).getAccountNumber() > max_val) {
				max_val = this.accountList.get(i).getAccountNumber();
			}
		}
		return max_val+1;
	}
	
	public int countOfAccountsWithStatus(String status) {
		int count = 0;
		for (int i=0; i<this.accountList.size(); i++) {
			if (this.accountList.get(i).getAccountStatus().equals(status)) {
				count++;
			}
		} 
		return count;
	}
	
	@SuppressWarnings("unchecked")
	public void readFile() {
		try (ObjectInputStream objectIn = new ObjectInputStream(
				new FileInputStream(ioFile));) {
			
			accountList = (ArrayList<Account>) objectIn.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
