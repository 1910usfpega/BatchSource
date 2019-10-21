package assignments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ProblemOneTest {

    @Test
    public void bubbleSortTestSuccess() {
        int[] numbers = new int[] { 1, 7, 99, 2, 0, 12, 15 };
        ProblemOne.bSort(numbers);

        assertArrayEquals(new int[] { 0, 1, 2, 7, 12, 15, 99 }, numbers);
    }


}
