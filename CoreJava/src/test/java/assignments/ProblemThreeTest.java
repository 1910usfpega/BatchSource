package assignments;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProblemThreeTest {

    String reverse(String inputString) {

        StringBuilder reverseStringBuilder = new StringBuilder();

        for(int i = inputString.length() - 1; i>=0; i--){
            reverseStringBuilder.append(inputString.charAt(i));
        }

        return reverseStringBuilder.toString();
    }

    @Test
    public void testAWord() {
        assertEquals("tobor", new ProblemThreeTest().reverse("robot"));
    }
}

