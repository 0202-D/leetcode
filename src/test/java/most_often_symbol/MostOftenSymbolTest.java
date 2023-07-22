package most_often_symbol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostOftenSymbolTest {
    MostOftenSymbol mostOftenSymbol = new MostOftenSymbol();

    @Test
    void test1() {
    char expected = 'a';
    char actual = mostOftenSymbol.mostOftenSymbol("avcbaaa");
    assertEquals(expected,actual);
    }
    @Test
    void test2(){
        var expected = 'b';
        char actual = mostOftenSymbol.mostOftenSymbol("aaabcccbbbb");
        assertEquals(expected,actual);
    }
}