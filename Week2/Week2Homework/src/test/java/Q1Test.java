import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//import the class you'll be testing
import com.revature.exercises.Q1;

class Q1Test {
  
	@Test
    void testBubbleSort() {
        
        Q1 aaa = new Q1();
    boolean bool = true;
    int [] a =aaa.sort();
    int [] b = {0 ,1, 2, 3, 3, 4, 5, 6, 7, 8, 9};
    for(int i = 0; i< a.length;i++) {
    if(a[i]!=b[i])
    bool = false;
    } 
    assertEquals(true, bool);
    }
}
