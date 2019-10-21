package com.revature.employe;

import java.util.Comparator;

import com.revature.employe.Employe;

public class AgeComparator implements Comparator<Employe> {

	@Override
	public int compare(Employe o1, Employe o2) {
		// TODO Auto-generated method stub
		return (int) ((o1.getAge() - o2.getAge())*100);
	}
	
	

}
