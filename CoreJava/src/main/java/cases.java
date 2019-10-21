import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class cases {
	public static void getTodaysDate() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-YYYY");//Format the way date gets displayed to console
		Date date = new Date();//Date object used to get the actual date values
		System.out.println("Todays date: "+simpleDateFormat.format(date));//Print formatted date
	}
	public static void getsquareRoot(Double num) {
		double result = Math.sqrt(num);
		System.out.println("The square root of: "+num+" equals: "+result);
	}
	public static void splitString() {
		System.out.println("Split string words into array:");
		String str = "I am learning Core Java";
		String[] list= str.split(" ");
		for (String string : list) {
			System.out.print(string+" ");
		}
	}
}
