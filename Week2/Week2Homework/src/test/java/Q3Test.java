import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.revature.exercises.Q3;

class Q3Test {

	@Test
    public void reverseString(){
        Assert.assertEquals("cba", Q3.reverseMe("abc"));
    }
 
}
