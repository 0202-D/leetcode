package reverse_words_in_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInStringTest {
    ReverseWordsInString reverseWordsInString = new ReverseWordsInString();
    @Test
    void test1(){
        String expected = "Hello World";
        String actual = reverseWordsInString.reverseWords("World Hello");
        assertEquals(expected,actual);
    }
    @Test
    void test2(){
        String expected ="example good a" ;
        String actual = reverseWordsInString.reverseWords("a good   example");
        assertEquals(expected,actual);
    }

}