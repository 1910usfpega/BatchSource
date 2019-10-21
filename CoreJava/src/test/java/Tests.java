import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.platform.launcher.listeners.TestExecutionSummary.Failure;

class Tests {
	//Ensures the algorithm is properly functioning by testing for  expected result.
	@Test
	void SquareRoot() {
		double result = Math.sqrt(16);
		if (result != 4.0) {
			fail("Square Root test case failed, invalid output.");
		}
	}
	@Test
	void reversedString() {
		StringBuilder sb = new StringBuilder();
		String str = "Cat";
		for(int i = str.length()-1; i>=0; i--) {
			sb.append(str.charAt(i));
		}
		String reversed =  sb.toString();
		if (reversed == str) {
			fail("String is not being reversed.");
		}
	}
}
