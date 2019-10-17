

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class TestingStrings {
    
    @BeforeAll
    static void beforeAllOfThem() {
        System.out.println("Before All");
    }
    
    @BeforeEach
    void beforeEach(TestInfo info) {
        System.out.println("Initialize test data for" + info.getDisplayName());
    }
    
    @Test
    void toUpperCase() {
        String str = "abcdr";
        String result = str.toUpperCase();
        
        assertEquals("ABCD", result);
    }

    @Test
    @DisplayName("Length Check")
    void test() {
        int actualLength = "ABCD".length();
        int expectedLength = 4;
        
        assertEquals(expectedLength, actualLength);
    }

}






















































