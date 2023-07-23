package make_middle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeMiddleTest {
    MakeMiddle makeMiddle = new MakeMiddle();
    @Test
    void test1(){
        int [] expected = new int[]{2,3};
        int [] actual = makeMiddle.makeMiddle(new int []{1,2,3,4});
        assertArrayEquals(expected,actual);
    }

}