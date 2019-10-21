package assignments;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ProblemFiveTest {

	@Test
	void test() {
		String x = "foo bar";
		Assert.assertThat(x, CoreMatchers.containsString("foo"));
	}

}
