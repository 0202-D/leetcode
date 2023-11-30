import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumGapsTest {
    MaximumGaps maximumGaps = new MaximumGaps();
    @Test
    void test1(){
        int expected = 3;
        int actual = maximumGaps.maximumGap(new int[]{3,6,9,1});
        assertEquals(expected,actual);
    }
    @Test
    void test2(){
        int expected = 0;
        int actual = maximumGaps.maximumGap(new int[]{10});
        assertEquals(expected,actual);
    }

}