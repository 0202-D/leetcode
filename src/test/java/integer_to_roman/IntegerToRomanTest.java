package integer_to_roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {
    IntegerToRoman integerToRoman = new IntegerToRoman();
    @Test
    void test1(){
        String expected = "IX";
        String actual = IntegerToRoman.toRoman(9);
        assertEquals(expected,actual);
    }

}