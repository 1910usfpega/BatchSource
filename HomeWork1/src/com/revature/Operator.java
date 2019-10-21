package com.revature;



public class Operator implements OperatorInterface {

		@Override
		public void addition(int a, int b) {
			// TODO Auto-generated method stub
			int c=a+b;
	        System.out.println("The addition of the numbers is: " + c);
		}

		@Override
		public void subtraction(int a, int b) {
			// TODO Auto-generated method stub
			int c=a-b;
	        System.out.println("The addition of the numbers is: " + c);
		}

		@Override
		public void division(int a, int b) {
			// TODO Auto-generated method stub
			int c=a/b;
	        System.out.println("The addition of the numbers is: " + c);
		}

		@Override
		public void multiplication(int a, int b) {
			// TODO Auto-generated method stub
			int c=a*b;
	        System.out.println("The addition of the numbers is: " + c);
		}

		
	

}
