import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.revature.exercises.Q9;

class Q9Test {

	@Test
	void test() {
		List<Integer> list1 = (ArrayList<Integer>) Q9.isPrime();
		Assert.assertEquals(list1, Q9.isPrime());
		
	}

}
