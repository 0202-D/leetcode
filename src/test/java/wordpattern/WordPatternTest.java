package wordpattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordPatternTest {
    WordPattern wordPattern = new WordPattern();

    @Test
    void test1() {
        boolean expected = true;
        boolean actual = wordPattern.wordPattern("abba","dog cat cat dog");
    }
    @Test
    void test2() {
        boolean expected = false;
        boolean actual = wordPattern.wordPattern("abba","dog cat cat fish");
    }
    @Test
    void test3() {
        boolean expected = false;
        boolean actual = wordPattern.wordPattern("abba","dog dog dog dog");
    }
    @Test
    void test4() {
        boolean expected = false;
        boolean actual = wordPattern.wordPattern("aaa","aa aa aa aa");
    }


}