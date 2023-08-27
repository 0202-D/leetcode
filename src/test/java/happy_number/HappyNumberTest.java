package happy_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {
    HappyNumber happyNumber = new HappyNumber();
    @Test
    void test1(){
        boolean expected = true;
        boolean actual = happyNumber.isHappy(19);
        assertEquals(expected,actual);
    }

    @Test
    void test2(){
        boolean expected = false;
        boolean actual = happyNumber.isHappy(2);
        assertEquals(expected,actual);
    }

}