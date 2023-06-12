package reverse_integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {
    ReverseInteger reverseInteger = new ReverseInteger();
    @Test
    void test1(){
        int expected = 321;
        int actual = reverseInteger.reverse(123);
        assertEquals(expected,actual);
    }
    @Test
    void test2(){
        int expected = -321;
        int actual = reverseInteger.reverse(-123);
        assertEquals(expected,actual);
    }
    @Test
    void test3(){
        int expected = 0;
        int actual = reverseInteger.reverse( 1234567899);
        assertEquals(expected,actual);
    }

}