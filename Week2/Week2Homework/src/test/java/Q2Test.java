import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import com.revature.exercises.Q2;

class Q2Test {

	@Test
	void test() {

		boolean bool = true;

		Q2.fibb();
		int a[] = Q2.fibb();
		int b[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946,
				17711, 28657, 46368 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				bool = false;
			}
			assertEquals(true, bool);

		}
	}
}
