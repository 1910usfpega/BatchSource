import java.util.Arrays;

public class BubbleSort {
	public static void performSort() throws Exception {
		System.out.println("Bubble Sort:");
		int[] arr = {1,0,5,6,3,2,3,7,9,8,4};
		int val = 0;//Temperary value storage
		for (int i = 0; i < arr.length; i++) {//Loop over Array
			for (int j = 0; j < arr.length-i; j++) {//Nested loop to iterrate over array except length is altered by i.
				if(arr[j]>arr[j+1]) {
					val = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = val;
					System.out.println(Arrays.toString(arr));
				}
			}
		}
	}
}
