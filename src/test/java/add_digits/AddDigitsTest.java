package add_digits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddDigitsTest {
    AddDigits addDigits = new AddDigits();
    @Test
    void test1(){
        int expected = 2;
        int actual = addDigits.addDigits(38);
        assertEquals(expected,actual);
    }

}