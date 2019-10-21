import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.revature.exercises.Q5;

class Q5Test {

	 @Test
	    void test() {
	        Q5 sub = new Q5();
	         char input = sub.subStringer("hello", 2);
	         char[] b = {'h','e','l','l','o'};
	         char c = 'l';
	         assertEquals(c,input);
	    }
}
