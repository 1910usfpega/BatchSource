package com.revature.dao;

import java.sql.SQLException;
import java.util.List;
import com.revature.beans.Person;

public interface PersonDao {
	//CRUD OPS
	public List<Person> getAllPersons() throws SQLException;
	//for every concrete bean you should have a Dao and DaoImpl
	public Person getPersonById(int id) throws SQLException; 


}
