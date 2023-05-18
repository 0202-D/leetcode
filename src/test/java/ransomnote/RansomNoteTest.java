package ransomnote;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {
    RansomNote ransomNote = new RansomNote();

    @Test
    void test1() {
        boolean expected = false;
        boolean actual = ransomNote.canConstruct("a","b");
        assertEquals(expected,actual);
    }
    @Test
    void test2() {
        boolean expected = false;
        boolean actual = ransomNote.canConstruct("aa","ab");
        assertEquals(expected,actual);
    }
    @Test
    void test3() {
        boolean expected = true;
        boolean actual = ransomNote.canConstruct("aa","aab");
        assertEquals(expected,actual);
    }

}