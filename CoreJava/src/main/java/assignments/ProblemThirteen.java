/*Display the triangle on the console as follows using any type of loop.  
 * Do NOT use a simple group of print statements to accomplish this.  
	0 
	1 0
	1 0 1
	0 1 0 1
*/

package assignments;

public class ProblemThirteen {

	// 0 = false
	// 1 = true
	static boolean alternate = false;
	static int increment = 1;

	public static void triangle() {
		for (int i = 0; i < 4; i++) { //first for loop going vertical
			for (int j = 1; j <= increment; j++) { //second for loop going horizontal
				
				//alternate the output from 0 to 1
				if (alternate == false) { 
					System.out.print("0 ");
					alternate = true;
				} else {
					System.out.print("1 ");
					alternate = false;
				}
			}
			System.out.println();
			increment++;
		}
	}
}
