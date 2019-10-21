package com.revature.employe;

import java.util.Comparator;
import com.revature.employe.Employe;

public class DepartmentComparator implements Comparator<Employe>{

	@Override
	public int compare(Employe o1, Employe o2) {
		// TODO Auto-generated method stub
		return o1.getDepartment().compareTo(o2.getDepartment());
	}	

}
