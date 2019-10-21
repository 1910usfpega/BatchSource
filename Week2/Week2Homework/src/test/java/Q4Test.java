import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.revature.exercises.Q4;

class Q4Test {

	   @Test
	    public void testFactorial() {
	        System.out.println("factorial");
	        int number = 5;
	        int expResult = 120;
	        int result = Q4.factorial();
	        assertEquals(expResult, result);
	    }
}
