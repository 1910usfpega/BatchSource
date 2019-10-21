import java.util.ArrayList;

public class Triangle {
	public static void draw() {
		System.out.println("Triangle");
		//Algorithm for triangle
		int num = 1;
		ArrayList<String> list = new ArrayList<String>();
		num = 0;
		list.add(Integer.toString(num));
		num = 10;
		list.add(Integer.toString(num));
		num = num*num+1;
		list.add(Integer.toString(num));
		num = 01;
		list.add("0"+Integer.toString(num)+"0"+Integer.toString(num));
		for (String string : list) {
			System.out.println(string);
		}
		
	}
}
