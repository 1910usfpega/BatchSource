import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.revature.IntegerIsEven;

class IntegerIsEvenTest {

	@Test
	void testTestEvenNumber() {
		IntegerIsEven a = new IntegerIsEven();
		boolean aa = a.testEvenNumber(2);
		assertEquals(true, aa);
		
	}

}
