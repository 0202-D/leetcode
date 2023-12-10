import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectCapitalTest {
    DetectCapital detectCapital = new DetectCapital();
    @Test
    void test1(){
        boolean expected = false;
        boolean actual = detectCapital.detectCapitalUse("wOrd");
        assertEquals(expected,actual);
    }
    @Test
    void test2(){
        boolean expected = true;
        boolean actual = detectCapital.detectCapitalUse("word");
        assertEquals(expected,actual);
    }
    @Test
    void test3(){
        boolean expected = false;
        boolean actual = detectCapital.detectCapitalUse("wOrd");
        assertEquals(expected,actual);
    }

}