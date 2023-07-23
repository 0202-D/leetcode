package same_ends;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameEndsTest {
    SameEnds sameEnds = new SameEnds();
    @Test
    void test1(){
        boolean expected = false;
        boolean actual = sameEnds.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6},1);
        assertEquals(expected,actual);
    }
    @Test
    void test2(){
        boolean expected = true;
        boolean actual = sameEnds.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6},2);
        assertEquals(expected,actual);
    }

}