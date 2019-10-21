import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class readFromFile {
	public static void printFromFile() {
		try {
			Scanner scanner = new Scanner(new File("Data.txt"));
			scanner.useDelimiter("\n");
			ArrayList<String> list = new ArrayList<String>();
			while(scanner.hasNextLine()) {
				list.add(scanner.nextLine());
			}
			System.out.println(list.get(0));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
