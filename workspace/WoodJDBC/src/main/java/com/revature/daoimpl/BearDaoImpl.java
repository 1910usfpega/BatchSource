package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.bean.Bear;
import com.revature.dao.BearDao;
import com.revature.util.ConnFactoryW;

public class BearDaoImpl implements BearDao {
	public static ConnFactoryW cf = ConnFactoryW.getInstance();
//	@Override
	public List<Bear> getAllBears() throws SQLException { 
//		@Override
		

			List<Bear> bearList = new ArrayList<Bear>();
			Connection conn = cf.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from album order by title;");
			Bear a=null;
			while(rs.next()) {
				a=new Bear(rs.getInt(1),rs.getInt(2), rs.getString(3),rs.getDate(4), rs.getInt(5), rs.getInt(6));
				bearList.add(a);
			}
//			Collections.sort(albumList,(arg0,arg1)
//					->{
//						return arg0.getArtist().compareTo(arg1.getArtist()
//								);}
//					);
			return bearList;
		}
	

}

