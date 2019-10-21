package utils;

import java.util.ArrayList;
import java.util.List;

public class PrintFib {
	private static int previous = 0;
	private static int current = 1;
	
	
	public static List<Integer> start (int iteractions) {
		List<Integer> out_list = new ArrayList<Integer>();
		for (int i=0; i<iteractions; i++) {
			if (i == 0) {
				out_list.add(previous);
			} else if (i == 1) {
				out_list.add(current);
			} else {
				int temp = previous + current;
				out_list.add(temp);
				previous = current;
				current = temp;
			}
		}
		return out_list;
	}

}
