package power_of_two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfTwoTest {
    PowerOfTwo powerOfTwo = new PowerOfTwo();
    @Test
    void test1(){
        boolean expected = true;
        boolean actual = powerOfTwo.isPowerOfTwo(4);
        assertEquals(expected,actual);
    }

}