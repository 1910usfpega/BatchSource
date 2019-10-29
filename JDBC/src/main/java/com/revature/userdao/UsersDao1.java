package com.revature.userdao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Users;
;

public interface UsersDao1 {
	
		//CRUD OPS
			public List<Users> getAllUsers() throws SQLException;
			public List<Users> getUsersByusers_username(String users_username ) throws SQLException;
			

}
