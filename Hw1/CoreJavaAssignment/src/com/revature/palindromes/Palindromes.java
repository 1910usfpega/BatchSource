package com.revature.palindromes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Palindromes {

	public static String palindromes(String a, String b, String c,String d, String e, String f,String g,String h,String i,String j,String k) {
		List<String> pal = new ArrayList<String>();
		List<String> all = new ArrayList<String>();
//		all.add("karan");
//		all.add("madam");
//		all.add("tom");
//		all.add("civic");
//		all.add("radar");
//		all.add("jimmy");
//		all.add("kayak");
//		all.add("john");
//		all.add("refer");
//		all.add("billy");
//		all.add("did");
		
		all.add(a);
		all.add(b);
		all.add(c);
		all.add(d);
		all.add(e);
		all.add(f);
		all.add(g);
		all.add(h);
		all.add(i);
		all.add(j);
		all.add(k);

		for (String r : all) {
			String n = "";

			for (int z = r.length() - 1; z >= 0; z--) {
				n += r.charAt(z);
			}

			if (r.equals(n)) {
				pal.add(r);
			}

		}
		System.out.println(pal);
		return pal.toString();
	}
}
