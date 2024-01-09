import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfThreeTest {
    PowerOfThree p = new PowerOfThree();

    @Test
    void test1() {
        boolean expected = true;
        boolean actual = p.isPowerOfThree(27);
        assertEquals(expected, actual);
    }
    @Test
    void test2() {
        boolean expected = false;
        boolean actual = p.isPowerOfThree(0);
        assertEquals(expected, actual);
    }
}