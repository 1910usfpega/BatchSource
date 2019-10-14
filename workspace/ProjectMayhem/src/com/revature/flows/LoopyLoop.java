package com.revature.flows;

public class LoopyLoop {
	/*If Statement
	 * for decision making, providing multiple paths of execution
	 * 
	 * if(<conditional>){
	 * <what to do if true>
	 * } else if (<second conditional>){
	 * <what to do if 2nd conditional is true)
	 * } else {
	 * <what to do if false>
	 * }
	 * 
	 * Switch Cases
	 * for decision making, providing multiple paths of execution
	 * based upon an integer numeric, a string, a char, or enum.
	 */
	
	public static void whatColor(String color) {
		switch (color) {
		case "green":
			System.out.println("Hulk");
			break;
		case "purple":
			System.out.println("Thanos");
			break;
		case "crimson":
			System.out.println("Roll Tide");
			break;
			default:
				System.out.println("You are a terrible human being.");
			break;
		}
	}
	public static void ifStatement(int a) {
		if (a> 5) {
			System.out.println("bigger than 5");
		}	else if(a==5){
			System.out.println("a is 5");
		}else {
			System.out.println("smaller than 5");
		}
		
	}
	
	public static void main(String[] args) {
		ifStatement(0x0ffffffc);
		whatColor("green");
//		whatColor("red");
	}

}
