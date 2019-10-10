package com.revature.scopes;

public class FunWithScopes {
	{
		int c = 4;
	}
	// b is static/class scope, exists within this class (all objecct of this type)
	static int b=7;
	
	public static void main(String[] args) {
		int a=3;
	}

	public static void test() {
		if (b==7) {
			int d = 3;
			System.out.println(b);
		}
//		System.out.println(d);
		
	}
}
