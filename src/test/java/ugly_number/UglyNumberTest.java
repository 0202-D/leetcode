package ugly_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UglyNumberTest {
    UglyNumber uglyNumber = new UglyNumber();
    @Test
    void test1(){
        boolean expected = true;
        boolean actual = uglyNumber.isUgly(6);
        assertEquals(expected,actual);
    }
    @Test
    void test2(){
        boolean expected = false;
        boolean actual = uglyNumber.isUgly(14);
        assertEquals(expected,actual);
    }

}