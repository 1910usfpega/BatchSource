import java.util.ArrayList;

public class arraysWithnumberAlgorithms {
	public static void calculate() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int evenNums=0, oddNums=0;
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		for (int i = 0; i < list.size(); i++) {
			//Remove prime numbers
			if(list.get(i) %i == 0) {
				list.remove(i);
			}
			//Add even numbers
			if(i%2==0) {
				evenNums+=list.get(i);
			}else {//Add odd numbers
				oddNums+=list.get(i);
				
			}
		}
		System.out.println("Even number sum: "+evenNums+" odd number sum: "+oddNums);
	}
}
