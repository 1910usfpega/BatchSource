package assignments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProblemFourTest {

	@Test
	public void factorial() {
		assertTrue(ProblemFour.nFactorial(0) == 1);
		assertTrue(ProblemFour.nFactorial(1) == 1);
		assertTrue(ProblemFour.nFactorial(5) == 120);
	}

}
