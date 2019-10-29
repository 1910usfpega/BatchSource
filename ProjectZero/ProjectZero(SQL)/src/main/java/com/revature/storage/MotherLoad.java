package com.revature.storage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.revature.beans.Account;
import com.revature.beans.Person;

public class MotherLoad {
 
	public MotherLoad() {
		super();
		// TODO Auto-generated constructor stub
	}

	//account storage
	private ArrayList<Account> allAccounts = new ArrayList<Account>();
			//methods interacting with account storage
			/*methods to: add, remove, return all, return all IDs, return one, & prevent duplicates*/
			 
				public void addAcct(Account acct) {
					this.allAccounts.add(acct);
				}
				public void removeAcct(Account acct) {
					this.allAccounts.remove(acct);
				}
				public ArrayList<Account> showAllAccts(){
					return allAccounts;
				}
				public ArrayList<Integer> acctsByID(){
					ArrayList<Integer> acctsById = new ArrayList();
					for(Account i:allAccounts) {
						acctsById.add(i.getAccountId());
						}
					return acctsById;
					}
				public Account showOneAcct(int acct) {
					return allAccounts.get(acct);
				}
				
	// user storage
	private HashMap<String, Person> allUsers = new HashMap<String, Person>();
			public void addUser(Person p) {
				this.allUsers.put(p.getUsername(), p);
			}
			public void removeUser(Person p) {
				this.allUsers.remove(p.getUsername(), p);
			}
			public HashMap<String, Person> getAllUsers(){
				return allUsers;
			}
			public Set<String> usersByName(){
				return allUsers.keySet();
			}
			public Person getOneUser(String userName) {
				return allUsers.get(userName);
			}
		
	// login information
	private HashMap<String, String> allLogInfo = new HashMap<String,String>();
	public void addLogIn(Person p) {
		this.allLogInfo.put(p.getUsername(), p.getPassword());
	}
	public void removeLogIn(Person p) {
		this.allLogInfo.remove(p.getUsername(), p.getPassword());
	}
	public HashMap<String, String> getAllLogIns(){
		return allLogInfo;
	}
	public ArrayList<String> usersByLogInInfo(){
		ArrayList<String> usersByUN = new ArrayList();
		for(String i:allLogInfo.keySet()) {
			usersByUN.add(i);
			}
		return usersByUN;
		}
	public  boolean checkLogInfo(String un,String pw) {
		if (allLogInfo.containsKey(un) && allLogInfo.get(un).equals(pw)) {
			return true;
		}else {
			return false;
		}
	}
	public String getUsername(String userName) {
		return allLogInfo.get(userName);
	}
	public  boolean userNameAvailability(String userName) {
		boolean found=true;
		for( String  x: allLogInfo.keySet()) {
			if (x.equals(allLogInfo.keySet())) {
				found=false;
			}
		}
		return found;
	}
	//accounts pending approval
	private ArrayList<Account> allApps = new ArrayList<Account>();
	public void addApp(Account acct) {
		this.allApps.add(acct);
	}
	public void removeApp(Account acct) {
		this.allApps.remove(acct);
	}
	public ArrayList<Account> getAllApps(){
		return allApps;
	}
	public ArrayList<Integer> appsByID(){
		ArrayList<Integer> acctsById = new ArrayList();
		for(Account i:allApps) {
			acctsById.add(i.getAccountId());
			}
		return acctsById;
		}
	public Account showOne1(int acct) {
		return allApps.get(acct);
	}	
}
