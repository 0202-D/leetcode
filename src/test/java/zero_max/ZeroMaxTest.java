package zero_max;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZeroMaxTest {
    ZeroMax zeroMax = new ZeroMax();
    @Test
    void test1(){
        int [] expected = {3,4,3,3};
        int [] actual = zeroMax.zeroMax(new int[]{0,4,0,3});
        assertArrayEquals(expected,actual);
    }

}