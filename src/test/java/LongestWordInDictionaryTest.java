import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestWordInDictionaryTest {
LongestWordInDictionary longest = new LongestWordInDictionary();
@Test
    void test1(){
    String expected = "ale";
    String actual = longest.stringChecker("ale","abpcplea");
    assertEquals(expected,actual);
}
}