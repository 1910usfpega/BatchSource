import java.util.concurrent.CountedCompleter;

public class PrintEven {
	public static void numbers() {
		System.out.println("Print all even numbers from 1 to 100");
		int count = 0;//incremented at loop
		int[] nums = new int[100];
		//appends values to array
		for (int i:nums) {
			count +=1;
				nums[i]= count;
		}
		//Print out values
		for (int i = 0; i<100; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}
