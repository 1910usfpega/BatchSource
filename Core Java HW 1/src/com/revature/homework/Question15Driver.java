package com.revature.homework;

public class Question15Driver implements Math15 {
	
	public static void Chamberlain (String str) {
		System.out.println("Question 15");
	
		
		Question15Driver driver = new Question15Driver();
	driver.addition(8,13);
	driver.subtraction(42, 33);
	driver.multiplication(44,22);
	driver.division(32, 5);
		
	}

	@Override
	public  int addition(int kobe , int wilt) {
		int result = kobe + wilt;
		System.out.println(result);
		return result ;
		
	}

	@Override
	public int subtraction(int worthy, int kareem){
		int result= worthy - kareem;
		System.out.println(result);
		return result;
	}

	@Override
	public int multiplication(int west, int elgin) {
		int result= west * elgin;
		System.out.println(result);
		return result;
	}

	@Override
	public int division(int oneal, int horry) {
		int result= oneal/ horry;
		System.out.println(result);
		return oneal / horry ;
	
}
}