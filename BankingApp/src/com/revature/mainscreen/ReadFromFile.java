package com.revature.mainscreen;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.revature.storage.AccountStorage;
import com.revature.storage.CustomerStorage;
import com.revature.storage.LoginInfo;
import com.revature.user.Account;
import com.revature.user.Customer;

public class ReadFromFile {
	private static final String inFile="SavedCustomers.txt";
	//private static final String inFileP="inputP.txt";
	
	
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
		//System.out.println(str);
		String[] eachLine=str.toString().split("\n");
		for(String x:eachLine) {
			String[] each =x.split(":");
			String[] user = each[0].split(";");
			LoginInfo.newUser(user[0],user[1]);
			Customer newUser = new Customer(user[0],user[1]);
			CustomerStorage.add(newUser);
			
			String[] accts=each[1].split(";");
			for(String y:accts) {
				if(y.length()>0) {
					String[] details=y.split(",");
					System.out.println();
					if(AccountStorage.alreadyUsed(Integer.parseInt(details[0]))) {
						//System.out.println("almost")
						Account account = AccountStorage.getThisAccount(Integer.parseInt(details[0]));
						newUser.addNewAccount(account);
						for(Customer z:account.getUsers() ) {
							//System.out.println(z.getUsername());
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
