package reversevowelsofastring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseVowelsOfAStringTest {
    ReverseVowelsOfAString reverse = new ReverseVowelsOfAString();
    @Test
    void test(){
        String expect = "holle";
        String actual = reverse.reverseVowels("hello");
        assertEquals(expect,actual);
    }
    @Test
    void test2(){
        String expect = "leotcede";
        String actual = reverse.reverseVowels("leetcode");
        assertEquals(expect,actual);
    }
}