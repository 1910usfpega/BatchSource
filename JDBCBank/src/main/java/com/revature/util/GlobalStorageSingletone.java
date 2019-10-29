package com.revature.util;

import com.revature.beans.User;

public class GlobalStorageSingletone {
	private static GlobalStorageSingletone instance;
	
	private GlobalStorageSingletone() {
		
	}
	
	public static synchronized GlobalStorageSingletone getInstance() {
		if (instance == null) {
			instance = new GlobalStorageSingletone();
		}
		return instance;
	}
	
	private User currentUser = null;

	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}
	
	

}
