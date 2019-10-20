package com.revature.mainscreen;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.revature.storage.AccountStorage;
import com.revature.storage.CustomerStorage;
import com.revature.storage.LoginInfo;
import com.revature.storage.OpenApplications;
import com.revature.user.Account;
import com.revature.user.Customer;

public class ReadFromFile {
	private static final String inFile="SavedCustomers.txt";
	
	
	public static void readCustomers() {
		StringBuilder str = new StringBuilder();
		try(InputStream input = new FileInputStream(new File(inFile));) {
			int byt=0;
			while((byt=input.read()) != -1) { 
				str.append((char) byt);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (str.length()==0) { //If file is empty, return now
			return;
		}
		String[] eachLine=str.toString().split("\n");
		for(String x:eachLine) {
			String[] each =x.split(":");
			String[] user = each[0].split(";");
			LoginInfo.newUser(user[0],user[1]);
			Customer newUser = new Customer(user[0],user[1]);
			CustomerStorage.add(newUser);
			if(each.length>1) {  // If there is at least one saved account:
				String[] accts=each[1].split(";");
				for(String y:accts) {
					if(y.length()>0) {
						String[] details=y.split(",");
						if (details[0].equals("OPEN")) {
							if(OpenApplications.alreadyUsed(Integer.parseInt(details[1]))) {
								Account account = OpenApplications.getThisApplication(Integer.parseInt(details[1]));
								newUser.addNewApplication(account);
								for(Customer z:account.getUsers() ) {
									z.addNewApplication(account);
								}
								account.addUser(newUser);
							}else {
								Account account = new Account(Integer.parseInt(details[1]),details[2],Double.parseDouble(details[3]),newUser);
								newUser.addNewApplication(account);
								OpenApplications.addApplication(account);
							}
						}else {
							if(AccountStorage.alreadyUsed(Integer.parseInt(details[0]))) {
								Account account = AccountStorage.getThisAccount(Integer.parseInt(details[0]));
								newUser.addNewAccount(account);
								for(Customer z:account.getUsers() ) {
									z.addNewAccount(account);
								}
								account.addUser(newUser);
							}else {
								Account account = new Account(Integer.parseInt(details[0]),details[1],Double.parseDouble(details[2]),newUser);
								newUser.addNewAccount(account);
								AccountStorage.addAccount(account);
							}
						}
					}
				}
			}
			
			
			
			
			
		}
		
	}

}
