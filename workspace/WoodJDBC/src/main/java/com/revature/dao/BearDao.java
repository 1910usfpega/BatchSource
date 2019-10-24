package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.bean.Bear;

public interface BearDao {
public List<Bear> getAllBears() throws SQLException;

}
