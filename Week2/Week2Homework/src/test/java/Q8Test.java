import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.revature.exercises.Q8;

class Q8Test {

	@Test
	void test() {
		String entry = "andy";
		boolean result = Q8.isPalindrome(entry);
		assertTrue(result);
		
	}

}
